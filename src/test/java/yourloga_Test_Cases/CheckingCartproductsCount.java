package yourloga_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.Browser_launch;
import yourloga_Methods.CartPage;
import yourloga_Methods.ProductCount;
import yourloga_Methods.SearchProduct;

public class CheckingCartproductsCount {

	WebDriver driver;
	Browser_launch launchb;
	SearchProduct searchp;
	ProductCount productc;
	CartPage cartp;
	
	@Test  

	public void counts3() {


		launchb= new Browser_launch();     // intializing browser launch object

		driver= launchb.launch("chrome","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
		searchp= new SearchProduct(driver);

		String products =searchp.valid_Searching("dresses");
		productc= new ProductCount(driver);
		int count=  productc.counting();
		cartp = new CartPage(driver);
		 boolean b=cartp.cartCount(count);
		
		Assert.assertTrue(b, "the product count are not same");
		driver.close();
	}
	//xpath continue1/Continue1 is not working for firefox in the method add_to_cart

	/* @Test
	  public void counts2() {



		  launchb= new Browser_launch();     // intializing browser launch object

     driver= launchb.launch("firefox","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
     productc= new Product_Count(driver);
   int count=  productc.counting();
		By product_count= By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");  //xpath  to get number of products present in the cart


	  String cart_products= driver.findElement(product_count).getText();  //getting product count from the cart 
		 int number= Integer.parseInt(cart_products);
		 boolean b= (number==count);
	 Assert.assertTrue(b, "the product count are not same");
	 driver.close();
 }*/
}
