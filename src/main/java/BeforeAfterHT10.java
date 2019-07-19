import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BeforeAfterHT10 {
    public WebDriver driver;
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);
    @BeforeClass

public void setup() {
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);
    System.setProperty("webdriver.chrome.driver", "C:\\Drivertest\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.automationpractice.com");
    driver.findElement( By.id( "search_query_top" ) ).click( );
    }
    @AfterClass
    public void exit(){
        driver.quit();
    }
}
