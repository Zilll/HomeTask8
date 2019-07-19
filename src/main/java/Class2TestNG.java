import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class Class2TestNG {
    public WebDriver driver;
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);

    @Test
    public void EnterRegData(){
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
        driver.findElement( By.xpath( "//*[@id=\"postcode\"]" ) ).sendKeys( "00000");
        driver.findElement( By.xpath( "//*[@id=\"phone_mobile\"]" ) ).sendKeys( "4747474747");
        driver.findElement( By.xpath( "//*[@id=\"submitAccount\"]" ) ).click();
    }
}
