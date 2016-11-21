package browserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
    
    private static WebDriver webDriver;
    
    private static void login (String username, String password) {
        WebElement element0 = webDriver.findElement(By.linkText("Log in"));
        element0.click();
        WebElement element1 = webDriver.findElement(By.xpath("//input[@value=\"Cliquez ici ou sur le logo C'zam pour vous identifier\"]"));
        element1.click();
        Select element2 = new Select(webDriver.findElement(By.name("user_idp")));
        element2.selectByVisibleText("Ecole des Mines de Nantes");
        WebElement element3 = webDriver.findElement(By.xpath("//input[@value=\"Select\"]"));
        element3.click();
        WebElement element4 = webDriver.findElement(By.xpath("//input[@value=\"Save and continue to your Home Organization \"]"));
        element4.click();
        WebElement element5 = webDriver.findElement(By.name("username"));
        element5.sendKeys(username);
        WebElement element6 = webDriver.findElement(By.name("password"));
        element6.sendKeys(password);
        WebElement element7 = webDriver.findElement(By.name("warn"));
        element7.click();
        WebElement element8 = webDriver.findElement(By.xpath("//input[@type='submit']"));
        element8.click();
        WebElement element9 = webDriver.findElement(By.name("Connecté sous le nom"));
        if(!element9.getAttribute("value").contains("Massimo Tisi")) {
            throw new AssertionError(element9.getAttribute("value") + " does not contain Massimo Tisi");
        };
    }
    private static void navigateToCampus () {
        webDriver.get("http://campus.mines-nantes.fr");
    }
    
    public static void main(String[] args) {
        // Initialize Selenium web driver for Google Chrome
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
        webDriver = new ChromeDriver();
        
        navigateToCampus();
        login("gpouil14", "123456");
        
        // Close the browser
        webDriver.quit();
    }
}
