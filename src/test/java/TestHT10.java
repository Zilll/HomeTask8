import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestHT10 extends BeforeAfterHT10 {
    //static WebDriver driver;
    @Test
    public void HT10() throws NullPointerException, InterruptedException{
        PageElementsHT10 PageElementsHT10 = new PageElementsHT10(driver);
        Thread.sleep( 2000);
        PageElementsHT10.searchClick();
        PageElementsHT10.searchSendBlouse();
        PageElementsHT10.submitSearch();
        Thread.sleep( 3000);
        PageElementsHT10.changeViewToList();
        PageElementsHT10.addToCartinList();
        Thread.sleep( 2000);
        PageElementsHT10.proceedToCheckout();
        PageElementsHT10.addQuantity();
        Thread.sleep( 2000 );
        PageElementsHT10.totalProdPrice(); //        Total для товара ,
        PageElementsHT10.totalProd();   //Total products,
        PageElementsHT10.totalShiping();      //Total shipping ,
        PageElementsHT10.totalNoTax();   //Total всех товаров ,
        PageElementsHT10.totalTax();   //Tax
        PageElementsHT10.totalPrice();   //TOTAL
        Assert.assertEquals( "$54.00",PageElementsHT10.totalProdPrice() );
        Assert.assertEquals( "$54.00",PageElementsHT10.totalProd() );
        Assert.assertEquals( "$2.00",PageElementsHT10.totalShiping() );
        Assert.assertEquals( "$56.00",PageElementsHT10.totalNoTax() );
        Assert.assertEquals( "$0.00",PageElementsHT10.totalTax() );
        Assert.assertEquals( "$56.00",PageElementsHT10.totalPrice() );
        PageElementsHT10.clearRecycle();
        Thread.sleep( 2000 );
        PageElementsHT10.emptyRecycle();
        Assert.assertEquals( "Your shopping cart is empty.",PageElementsHT10.emptyRecycle() );
    }
}
