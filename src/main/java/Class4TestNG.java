import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class Class4TestNG {
    public WebDriver driver;
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);

    @Test
    public void LogOut(){
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a" ) ).click( );
    }
}
