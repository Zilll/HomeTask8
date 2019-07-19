import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class AfterHTTestNG {
    public WebDriver driver;
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);

    @AfterSuite
    public void exit(){
        System.out.println("exit" );
    }
}
