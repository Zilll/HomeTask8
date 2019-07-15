import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Task9 {
    public WebDriver driver;
    @Before
    public void setup() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Drivertest\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.com");
        driver.findElement( By.id( "search_query_top" ) ).click( );
    }
    @Test
    public void HT9() throws Exception{
        driver.findElement( By.id( "search_query_top" ) ).sendKeys("Blouse" );
        driver.findElement( By.id( "search_query_top" ) ).submit();
        driver.findElement( By.id( "list" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]" ) ).click();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
        driver.findElement( By.xpath( "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span" ) ).click();
        driver.findElement( By.id( "cart_quantity_up_2_7_0_0" ) ).click();
        Thread.sleep( 2000 );
        String totalProdPrice = driver.findElement( By.id( "total_product_price_2_7_0" ) ).getText();  //        Total для товара ,
        String totalProd = driver.findElement( By.id( "total_product" ) ).getText();         //Total products,
        String totalShiping = driver.findElement( By.id( "total_shipping" ) ).getText();          //Total shipping ,
        String totalNoTax = driver.findElement( By.id( "total_price_without_tax" ) ).getText();  //Total всех товаров ,
        String totalTax = driver.findElement( By.id( "total_tax" ) ).getText(); //Tax
        String totalPrice = driver.findElement( By.id( "total_price" ) ).getText();          //TOTAL
        System.out.println(totalProd );
        Assert.assertEquals( "$54.00",totalProdPrice );
        Assert.assertEquals( "$54.00",totalProd );
        Assert.assertEquals( "$2.00",totalShiping );
        Assert.assertEquals( "$56.00",totalNoTax );
        Assert.assertEquals( "$0.00",totalTax );
        Assert.assertEquals( "$56.00",totalPrice );
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
        driver.findElement( By.id( "2_7_0_0" ) ).click();//recycle
        Thread.sleep( 2000 );
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
        String emptyRecycle = driver.findElement(By.className("alert-warning")).getText();
        System.out.println(emptyRecycle );
        Assert.assertEquals( "Your shopping cart is empty.",emptyRecycle );
    }
    @After
    public void exit(){
        driver.quit();
    }
}
