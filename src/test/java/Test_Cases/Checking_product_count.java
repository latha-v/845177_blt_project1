package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import methods.Product_Count;
import methods.search_product;
import wrapper.Browser_launch;

public class Checking_product_count {

	WebDriver dr;
	Browser_launch l;
	search_product s;
	Product_Count pc;
	
	@Test  
	
  public void counts3() {
		

		  l= new Browser_launch();     // intializing browser launch object
		  		  
      dr= l.launch("chrome","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
     s= new search_product(dr);

    String products =s.valid_Searching("dresses");
      pc= new Product_Count(dr);
    int count=  pc.counting();
		By product_count= By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");  //xpath  to get number of products present in the cart

	  String cart_products= dr.findElement(product_count).getText();  //getting product count from the cart 
		 int number= Integer.parseInt(cart_products);
		 boolean b= (number==count);
	 Assert.assertTrue(b, "the product count are not same");
	 dr.close();
  }
	//xpath continue1/Continue1 is not working for firefox in the method add_to_cart
    
	/* @Test
	  public void counts2() {
	 
			

		  l= new Browser_launch();     // intializing browser launch object
		  		  
     dr= l.launch("firefox","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
     pc= new Product_Count(dr);
   int count=  pc.counting();
		By product_count= By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");  //xpath  to get number of products present in the cart


	  String cart_products= dr.findElement(product_count).getText();  //getting product count from the cart 
		 int number= Integer.parseInt(cart_products);
		 boolean b= (number==count);
	 Assert.assertTrue(b, "the product count are not same");
	 dr.close();
 }*/
}
