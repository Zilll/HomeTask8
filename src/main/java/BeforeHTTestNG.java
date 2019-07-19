import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class BeforeHTTestNG {
    public WebDriver driver;
    @DataProvider(name="SearchSomething")
    public Object[][] getData() {
        return new Object[][] {
        {"Blouse"},
        {"Штаны какие-то"},
        {"T-Shirt"}
        };
    }

    @BeforeClass
    public void setup() {
    System.setProperty("webdriver.chrome.driver", "C:\\Drivertest\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.automationpractice.com");
    driver.findElement( By.id( "search_query_top" ) ).click( );
    }

    @Test(priority = 1)
    public void GoToRegister() throws InterruptedException {
        Thread.sleep(5000);  // Let the user actually see something!
        String generatedString = RandomStringUtils.randomAlphabetic( 5 );
        System.out.println( generatedString);
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a" ) ).click( );
        driver.findElement( By.xpath( "//*[@id=\"email_create\"]" ) ).sendKeys(generatedString + "somde@gg.com");
        driver.findElement( By.xpath( "//*[@id=\"SubmitCreate\"]" ) ).click();
        System.out.println("OnRegisterPage" );
    }
    @Test(priority = 2)
    public void EnterRegData() throws InterruptedException{
        Thread.sleep(5000);  // Let the user actually see something!
        driver.findElement( By.id( "id_gender1" ) ).click( );
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
        Select dropdown = new Select( driver.findElement( By.id( "id_state" ) ));
        dropdown.selectByVisibleText("Alabama");
        driver.findElement( By.xpath( "//*[@id=\"postcode\"]" ) ).sendKeys( "00000");
        driver.findElement( By.xpath( "//*[@id=\"phone_mobile\"]" ) ).sendKeys( "4747474747");
        driver.findElement( By.xpath( "//*[@id=\"submitAccount\"]" ) ).click();
    }
    @Test(priority = 3,dataProvider="SearchSomething")
    public void SearchBlouse(String Odegda) throws InterruptedException {
        Thread.sleep( 3000 );
        driver.findElement( By.id( "search_query_top" ) ).click( );
        WebElement SearchThing = driver.findElement( By.id( "search_query_top" ) );
        SearchThing.sendKeys(Odegda);
        driver.findElement( By.id( "search_query_top" ) ).submit();
        driver.findElement( By.id( "search_query_top" ) ).click( );
        SearchThing.clear();
    }
    @Test(priority = 4)
    public void LogOut(){
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a" ) ).click( );
    }
    @AfterClass
    public void exit(){
        driver.quit();
    }
}
