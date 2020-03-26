package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import methods.search_product;
import wrapper.Browser_launch;

public class Search {
	
	WebDriver dr;
	Browser_launch l;
	search_product p;
	
	
  @Test							
  public void search1()				//test case for valid search
  {
	  l= new Browser_launch();      //initializing the browser launch object
	  dr= l.launch("chrome","http://automationpractice.com/index.php");  //launching the chrome browser
	  p= new search_product(dr);
	  String product = p.valid_Searching("t-shirts");				//calling the invalid search method
	  System.out.println(product);
	  Assert.assertTrue(product.contains("Faded Short Sleeve"), "invalid search");		//assert for valid search
	
	
	  dr.close();							//to close the browser
  }
  @Test
  public void search2() 				// test case for invalid search
  {
	  l= new Browser_launch();				//initializing the browser launch object
	  dr= l.launch("firefox","http://automationpractice.com/index.php");  //launching the  firefox browser
	  p= new search_product(dr);
	  String product = p.valid_Searching("t-shirts");    //calling the invalid search method
	  System.out.println(product);
	  Assert.assertTrue(product.contains("Faded Short Sleeve T-shirts"), "valid search");  //assert for  invalid search
	 
	  dr.close();						//to close the browser
  }
}
