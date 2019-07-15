import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BeforeAfterHT10 {
    public WebDriver driver;
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);
    @Before

public void setup() {
        PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);
    System.setProperty("webdriver.chrome.driver", "C:\\Drivertest\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.automationpractice.com");
    driver.findElement( By.id( "search_query_top" ) ).click( );
    }
    @After
    public void exit(){
        driver.quit();
    }
}
