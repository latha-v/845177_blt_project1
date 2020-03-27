package yourloga_Test_Cases;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.Browser_launch;
import yourloga_Methods.SearchProduct;

public class InvalidSerch {



	WebDriver driver;
	Browser_launch launchb;
	SearchProduct searchp;


	@Test							
	public void search1()				//test case for valid search
	{
		launchb= new Browser_launch();      //initializing the browser launch object
		driver= launchb.launch("chrome","http://automationpractice.com/index.php");  //launching the chrome browser
		searchp= new SearchProduct(driver);
		String product = searchp.invalid_Searching("books");				//calling the invalid search method
		System.out.println(product);
		Assert.assertTrue(product.contains("No results were found for your search \"books\""), "valid search");  //assert for  invalid search


		driver.close();							//to close the browser
	}
	@Test
	public void search2() 				// test case for invalid search
	{
		launchb= new Browser_launch();				//initializing the browser launch object
		driver= launchb.launch("firefox","http://automationpractice.com/index.php");  //launching the  firefox browser
		searchp= new SearchProduct(driver);
		String product = searchp.invalid_Searching("books");  //calling the invalid search method
		System.out.println(product);
		Assert.assertTrue(product.contains("No results were found for your search \"books\""), "valid search");  //assert for  invalid search

		driver.close();						//to close the browser
	}
}


