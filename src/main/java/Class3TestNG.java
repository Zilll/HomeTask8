import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class Class3TestNG {
    public WebDriver driver;
    PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);

    @Test
    public void SearchBlouse() throws InterruptedException {
        Thread.sleep( 3000 );
        driver.findElement( By.id( "search_query_top" ) ).click( );
        driver.findElement( By.id( "search_query_top" ) ).sendKeys("Blouse" );
        driver.findElement( By.id( "search_query_top" ) ).submit();
    }
}
