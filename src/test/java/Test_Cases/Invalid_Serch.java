package Test_Cases;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import methods.search_product;
import wrapper.Browser_launch;

public class Invalid_Serch {
  
	
		
		WebDriver dr;
		Browser_launch l;
		search_product p;
		
		
	  @Test							
	  public void search1()				//test case for valid search
	  {
		  l= new Browser_launch();      //initializing the browser launch object
		  dr= l.launch("chrome","http://automationpractice.com/index.php");  //launching the chrome browser
		  p= new search_product(dr);
		  String product = p.invalid_Searching("books");				//calling the invalid search method
		  System.out.println(product);
		  Assert.assertTrue(product.contains("No results were found for your search \"books\""), "valid search");  //assert for  invalid search
			 
		
		  dr.close();							//to close the browser
	  }
	  @Test
	  public void search2() 				// test case for invalid search
	  {
		  l= new Browser_launch();				//initializing the browser launch object
		  dr= l.launch("firefox","http://automationpractice.com/index.php");  //launching the  firefox browser
		  p= new search_product(dr);
		  String product = p.invalid_Searching("books");  //calling the invalid search method
		  System.out.println(product);
		  Assert.assertTrue(product.contains("No results were found for your search \"books\""), "valid search");  //assert for  invalid search
		 
		  dr.close();						//to close the browser
	  }
	}


