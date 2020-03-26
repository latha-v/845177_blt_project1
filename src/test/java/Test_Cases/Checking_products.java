package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import methods.add_to_cart;
import methods.search_product;
import wrapper.Browser_launch;

public class Checking_products {
	
	String[] products;
	
	WebDriver dr;
	Browser_launch l;
	search_product p;
    
    add_to_cart c;
    
    By cart = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");  //xpath for cart
    
    By name1 = By.xpath("//*[@id='product_5_19_0_0']/td[2]/p");  //xpath  for first product name
	By name2= By.xpath("//*[@id='product_4_16_0_0']/td[2]/p");   //xpath  for second product name
    
    
    @Test
  
  public void verify1() {
	  
			  l= new Browser_launch();     // intializing browser launch object
			  		  
	  dr= l.launch("chrome","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
	  p= new search_product(dr);                      //calling search_product method
	  String product = p.valid_Searching("dresses");  //
	
	    
	 c= new add_to_cart(dr);              //itializing add to cart method object
	 products = new String[2];            //string declaration
	products = c.adding();                //calling adding method to add product cart
	
	String product1=products[0];        //to store the individual product name seperately
	String product2=products[1];
	
	System.out.println(product1);
	System.out.println(product2);
	
	dr.findElement(cart).click();                                //to click on the cart
	 String actual_products1 =dr.findElement(name1).getText();   //to get name of the product 1
	String  actual_products2 =dr.findElement(name2).getText();   //to get name of the product 2
	
	
	System.out.println(actual_products1);
	System.out.println(actual_products2);
	
	boolean b1= false;
	boolean b2= false;
	if(product1.contains(actual_products1))   //to check the name is same for the product1 added to the cart and the product added in the cart
	{

		b1=true;
	}
	
	System.out.println(b1);
	
	if(product2.contains(actual_products2))   //to check the name is same for the product1 added to the cart and the product added in the cart
	
	{

		b2=true;
	}
	
	System.out.println(b2);
	
	Assert.assertTrue((b1&&b2), "the products are not same");  // assert for checking two products  added correctly 
	  dr.close();                         //to close the browser
  }
    //xpath continue1/Continue1 is not working for firefox in the method add_to_cart
    
  /* @Test 
    
    public void verify2() {
  	  
  			  l= new Browser_launch();     // intializing browser launch object
  			  		  
  	  dr= l.launch("firefox","http://automationpractice.com/index.php");   // calling browser lanch method to launch browser
  	  p= new search_product(dr);                      //calling search_product method
  	  String product = p.valid_Searching("dresses");  //
  	
  	    
  	 c= new add_to_cart(dr);              //itializing add to cart method object
  	 products = new String[2];            //string declaration
  	products = c.adding();                //calling adding method to add product cart
  	
  	String product1=products[0];        //to store the individual product name seperately
  	String product2=products[1];
  	
  	System.out.println(product1);
  	System.out.println(product2);
  	
  	dr.findElement(cart).click();                                //to click on the cart
	 String actual_products1 =dr.findElement(name1).getText();   //to get name of the product 1
	String  actual_products2 =dr.findElement(name2).getText();   //to get name of the product 2
	
	
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
	  dr.close();   
    } */	
}
