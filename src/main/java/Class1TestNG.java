import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Class1TestNG {

    public WebDriver driver;
    //PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);

    @Test
    public void GoToRegister() throws InterruptedException {
        Thread.sleep(10000);  // Let the user actually see something!
        String generatedString = RandomStringUtils.randomAlphabetic( 5 );
        System.out.println( generatedString);
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a" ) ).click( );
        driver.findElement( By.xpath( "//*[@id=\"email_create\"]" ) ).sendKeys(generatedString + "somde@gg.com");
        driver.findElement( By.xpath( "//*[@id=\"SubmitCreate\"]" ) ).click();
        System.out.println("Info Entered" );
    }
}
