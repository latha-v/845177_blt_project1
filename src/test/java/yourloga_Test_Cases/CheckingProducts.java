package yourloga_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.Browser_launch;
import yourloga_Methods.AddToCart;
import yourloga_Methods.SearchProduct;
import yourloga_Methods.Verifing_product;

public class CheckingProducts {

	String[] products;

	WebDriver driver;
	Browser_launch launchb;
	SearchProduct searchp;

	AddToCart cartc;
Verifing_product verify;
	

	@Test

	public void verify1() {

		launchb= new Browser_launch();     // intializing browser launch object

		driver= launchb.launch("chrome","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
		searchp= new SearchProduct(driver);                      //calling search_product method
		String product = searchp.valid_Searching("dresses");  //


		cartc= new AddToCart(driver);              //itializing add to cart method object
		products = new String[2];            //string declaration
		products = cartc.adding();                //calling adding method to add product cart

		String product1=products[0];        //to store the individual product name seperately
		String product2=products[1];

		System.out.println(product1);
		System.out.println(product2);
		verify= new Verifing_product(driver) ;
		boolean b = verify.verifyProduct(product1, product2);
	Assert.assertTrue((b), "the products are not same");  // assert for checking two products  added correctly 
		driver.close();                         //to close the browser
	}
	//xpath continue1/Continue1 is not working for firefox in the method add_to_cart

	/*  @Test 

    public void verify2() {

  			  launchb= new Browser_launch();     // intializing browser launch object

  	  driver= launchb.launch("firefox","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
  	  searchp= new search_product(driver);                      //calling search_product method
  	  String product = searchp.valid_Searching("dresses");  //


  	 cartc= new add_to_cart(driver);              //itializing add to cart method object
  	 products = new String[2];            //string declaration
  	products = cartc.adding();                //calling adding method to add product cart

  	String product1=products[0];        //to store the individual product name seperately
  	String product2=products[1];

  	System.out.println(product1);
  	System.out.println(product2);

  	driver.findElement(cart).click();                                //to click on the cart
	 String actual_products1 =driver.findElement(name1).getText();   //to get name of the product 1
	String  actual_products2 =driver.findElement(name2).getText();   //to get name of the product 2


	System.out.println(actual_products1);
	System.out.println(actual_products2);

	boolean b1= false;
	boolean b2= false;
	if(product1.contains(actual_products1))   //to check the name is same for the product1 added to the cart and the product added in the cart
	{

		b1=true;
	}

	System.out.println(b1);
System.out.println(b1);

	if(product2.contains(actual_products2))   //to check the name is same for the product1 added to the cart and the product added in the cart

	{

		b2=true;
	}

	System.out.println(b2);

	Assert.assertTrue((b1&&b2), "the products are not same");  // assert for checking two products  added correctly 
	  driver.close();   
    }*/ 	
}
