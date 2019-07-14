import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW8 {
    private WebDriver driver;
    public HW8 HW8;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivertest\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.com");
    }
    private String generatedString = RandomStringUtils.randomAlphabetic( 5 );
    @Test
    public void HW8() throws Exception{
        Thread.sleep(2000);  // Let the user actually see something!
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"email_create\"]" ) ).sendKeys(generatedString + "somde@gg.com");
        driver.findElement( By.xpath( "//*[@id=\"SubmitCreate\"]" ) ).click();
        Thread.sleep( 2000 );
        driver.findElement( By.id( "id_gender1" )).click( );
        driver.findElement( By.xpath( "//*[@id=\"customer_firstname\"]" ) ).sendKeys( "name ");
        driver.findElement( By.xpath( "//*[@id=\"customer_lastname\"]" ) ).sendKeys( "Sdsssf ");
        //driver.findElement( By.xpath( "//*[@id=\"email\"]" ) ).sendKeys( generatedString + "@gole.com");
        driver.findElement( By.xpath( "//*[@id=\"passwd\"]" ) ).sendKeys( "Sdsssf ");
        //Address field
        driver.findElement( By.xpath( "//*[@id=\"firstname\"]" ) ).sendKeys( "name");
        driver.findElement( By.xpath( "//*[@id=\"lastname\"]" ) ).sendKeys( "lastname");
        driver.findElement( By.xpath( "//*[@id=\"company\"]" ) ).sendKeys( "company");
        driver.findElement( By.xpath( "//*[@id=\"address1\"]" ) ).sendKeys( "tomas 15");
        driver.findElement( By.xpath( "//*[@id=\"city\"]" ) ).sendKeys( "london");
        driver.findElement( By.xpath( "//*[@id=\"postcode\"]" ) ).sendKeys( "00000");
        driver.findElement( By.xpath( "//*[@id=\"phone_mobile\"]" ) ).sendKeys( "4747474747");
        driver.findElement( By.xpath( "//*[@id=\"submitAccount\"]" ) ).click();
        String bodyText = driver.findElement( By.xpath( "//*[@id=\"center_column\"]/div/p" ) ).getText( );
        Assert.assertEquals( "There is 1 error",bodyText );


    }
    @After
    public void exit(){
        driver.quit();
    }
}
