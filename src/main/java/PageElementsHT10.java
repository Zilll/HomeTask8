import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class PageElementsHT10 {
    public WebDriver driver;

    public PageElementsHT10( WebDriver driver ) {
        //PageFactory.initElements( driver, this );
        this.driver = driver;
    }
    public void searchClick( ){
            driver.findElement( By.id( "search_query_top" ) ).click( );
    }

    public void searchSendBlouse(){
        driver.findElement( By.id( "search_query_top" ) ).sendKeys("Blouse" );
    }
    public void submitSearch() {
        driver.findElement( By.id( "search_query_top" ) ).submit( );
    }
    public void changeViewToList() {
         driver.findElement( By.id( "list" ) ).click();
    }
    public void addToCartinList() {
        driver.findElement( By.xpath( "//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]" ) ).click();
    }
    public void proceedToCheckout() {
        driver.findElement( By.xpath( "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span" ) ).click();
    }
    public void addQuantity() {
        driver.findElement( By.id( "cart_quantity_up_2_7_0_0" ) ).click();
    }

    public String totalProdPrice() {
        String totalProdPrice = driver.findElement( By.id( "total_product_price_2_7_0" ) ).getText();
        return totalProdPrice;
    }
    public String totalProd() {
        String totalProd = driver.findElement( By.id( "total_product" ) ).getText();
        return totalProd;
    }
    public String totalShiping() {
        String totalShiping =driver.findElement( By.id( "total_shipping" ) ).getText();
        return totalShiping;

    }
    public String totalNoTax() {
        String totalNoTax =driver.findElement( By.id( "total_price_without_tax" ) ).getText();
        return totalNoTax;
    }
    public String totalTax() {
        String totalTax =driver.findElement( By.id( "total_tax" ) ).getText();
        return totalTax;
    }
    public String totalPrice() {
        String totalPrice = driver.findElement( By.id( "total_price" ) ).getText();
        return totalPrice;
    }
    public void clearRecycle() {
        driver.findElement( By.id( "2_7_0_0" ) ).click();//recycle;
    }
    public String emptyRecycle() {
        String emptyRecycle =driver.findElement(By.className("alert-warning")).getText();
        return emptyRecycle;

    }

//        Assert.assertEquals( "$54.00",PageElementsHT10.totalProdPrice );
//        Assert.assertEquals( "$54.00",totalProd );
//        Assert.assertEquals( "$2.00",totalShiping );
//        Assert.assertEquals( "$56.00",totalNoTax );
//        Assert.assertEquals( "$0.00",totalTax );
//        Assert.assertEquals( "$56.00",totalPrice );
//        Assert.assertEquals( "Your shopping cart is empty.",emptyRecycle );
    }

