/**
 * @author M. Claveau / G.Pouilloux
 */

package fr.minesnantes.browserautomation.plugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import fr.minesnantes.browserautomation.seleniumDSL.Assert;
import fr.minesnantes.browserautomation.seleniumDSL.CallProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Click;
import fr.minesnantes.browserautomation.seleniumDSL.Fill;
import fr.minesnantes.browserautomation.seleniumDSL.MainProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Navigate;
import fr.minesnantes.browserautomation.seleniumDSL.Procedure;
import fr.minesnantes.browserautomation.seleniumDSL.Read;
import fr.minesnantes.browserautomation.seleniumDSL.Select;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest;
import fr.minesnantes.browserautomation.seleniumDSL.presentation.SeleniumDSLEditor;

/**
 * Handles the execution of the selenium plugin
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SeleniumHandler extends AbstractHandler {
	
	private MessageConsole myConsole;
	
	private MessageConsoleStream consoleOutput;
	
	private EList<Procedure> procedures;
	
	/**
	 * Find existing console or create a new one
	 * The console is a runtime one not compile
	 * @param name
	 * @return
	 */
   private MessageConsole findConsole(String name) {
      ConsolePlugin plugin = ConsolePlugin.getDefault();
      IConsoleManager conMan = plugin.getConsoleManager();
      IConsole[] existing = conMan.getConsoles();
      for (int i = 0; i < existing.length; i++)
         if (name.equals(existing[i].getName()))
            return (MessageConsole) existing[i];
      //no console found, so create a new one
      MessageConsole myConsole = new MessageConsole(name, null);
      conMan.addConsoles(new IConsole[]{myConsole});
      return myConsole;
   }

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorPart editor = window.getActivePage().getActiveEditor();
		
		// FIXME if *.slnm file opened with xtext, then the instance class is not SeleniumDSLEditor
		// using the model editor (genmodel) is fine
		if(editor instanceof SeleniumDSLEditor) {
			Resource myResource = ((SeleniumDSLEditor) editor).getEditingDomain().getResourceSet().getResources().get(0);

			EObject e = myResource.getContents().get(0);
			
			this.myConsole = this.findConsole("Selenium");
		    this.consoleOutput = myConsole.newMessageStream();
		    
			if(e instanceof SeleniumTest) {			  
				  SeleniumTest seleniumTest = (SeleniumTest) e;
					this.consoleOutput.println("Selenium test execution");
					this.consoleOutput.println("===================");
					
					this.procedures = seleniumTest.getProcedures();
					
					MainProcedure mainProcedure = seleniumTest.getMain();
					
					if(mainProcedure != null) {
						this.consoleOutput.println("Entering main procedure");

						// Initialize Selenium web driver for Google Chrome
						System.setProperty("webdriver.chrome.driver", "./chromedriver");
						WebDriver webDriver = new ChromeDriver();
																		
						mainProcedure.getInstructions().forEach(i -> {
							// TODO process each instruction
							// TODO (CallProc) take care of calling the procedures if they exist
							
							if(i instanceof Navigate) {
								Navigate navigateTask = (Navigate) i;
								String urlToNavigate = navigateTask.getUrl();
								
								// TODO check if regular URL using regex
								if(urlToNavigate != null && urlToNavigate != "") {
									webDriver.get(urlToNavigate);
								}
							} else if(i instanceof Click) {
								// TODO très dégueu cette partie là...
								Click clickTask = (Click) i;
								String elementName = clickTask.getName();
								if(elementName != null && elementName != "") {
									WebElement element = null;
									try {
										element = webDriver.findElement(By.linkText(elementName));
									} catch(NoSuchElementException ex) {
										try {
											element = webDriver.findElement(By.name(elementName));
										} catch(NoSuchElementException ex2) {
											element = webDriver.findElement(By.xpath("//input[@value = \"" + elementName + "\"]"));
										}
									} finally {
										if(element != null) {
											element.click();
										}
									}
										
								}
							} else if(i instanceof Fill) {
								Fill fillTask = (Fill) i;
								String elementName = fillTask.getName();
								String elementValue = fillTask.getValue();
								if(elementName != null && elementName != "" 
										&& elementValue != null && elementValue != "") {
									WebElement element = webDriver.findElement(By.name(elementName));
									element.sendKeys(elementValue);
								}
								
							} else if(i instanceof Select) {
								
							} else if(i instanceof Assert) {
								
							} else if(i instanceof Read) {
								
							} else if(i instanceof CallProcedure) {
								
							} else {
								this.consoleOutput.println("Unknown instruction - " + i.getClass().getCanonicalName());
							}							
						});
						
						// Close the browser
						webDriver.quit();
					}
			}
		}
		
		return null;
	}
}
