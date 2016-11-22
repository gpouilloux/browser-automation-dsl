package browserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
    
    private static WebDriver webDriver;
    
    
    public static void main(String[] args) {
        // Initialize Selenium web driver for Google Chrome
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
        webDriver = new ChromeDriver();
        
        webDriver.get("http://www.mines-nantes.fr/fr/content/advancedsearch");
        WebElement element0 = webDriver.findElement(By.name("SearchText"));
        element0.clear();
        element0.sendKeys("2007");
        Select element1 = new Select(webDriver.findElement(By.name("SearchDate")));
        element1.selectByVisibleText("Dernier jour");
        WebElement element2 = webDriver.findElement(By.xpath("//input[@value=\"RECHERCHER\"]"));
        element2.click();
        
        // Close the browser
        webDriver.quit();
    }
}
