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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.minesnantes.browserautomation.seleniumDSL.Click;
import fr.minesnantes.browserautomation.seleniumDSL.Instruction;
import fr.minesnantes.browserautomation.seleniumDSL.MainProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Procedure;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest;
import fr.minesnantes.browserautomation.seleniumDSL.presentation.SeleniumDSLEditor;

import org.eclipse.jface.dialogs.MessageDialog;

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
						
						// TODO I guess we have to instantiate some Selenium stuff here
						// for example, opening Chrome browser as well
						
						mainProcedure.getInstructions().forEach(i -> {
							// TODO process each instruction
							// (CallProc) take care of calling the procedures if they exist
//							if(i instanceof Click) {
//								
//							}
							this.consoleOutput.println(i.getClass().getCanonicalName());
						});
					}
			}
		}
		
//		MessageDialog.openInformation(
//				window.getShell(),
//				"Selenium test runner",
//				"Hello, Selenium");
		return null;
	}
}
