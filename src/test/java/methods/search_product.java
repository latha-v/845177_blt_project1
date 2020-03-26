package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import wrapper.Browser_launch;

public class search_product {
WebDriver dr;
 Browser_launch l;
  
 public search_product(WebDriver dr)
 {
	 this.dr=dr;
	 
 }
 By search_textbox= By.xpath("//*[@class='search_query form-control ac_input']");   //xpath for the search text box
 By list = By.xpath("//*[@id='search']/div[2]/ul/li");								// xpath for list of the items with given string 
	By search_icon = By.xpath("//*[@class='btn btn-default button-search']");		//xpath for search icon
	
	By product_searched = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a");  //x path for 1st product displayed after searching
	By resultpath= By.xpath("//*[@class='alert alert-warning']");			//xpath of message for invalid search
	

 public String  valid_Searching(String product)         //valid search
 {
	String Searched_product=null;
	
	dr.findElement(search_textbox).sendKeys(product);     //sending keys to the search text box
	
	dr.findElement(search_icon).click();					//  clicking  on the search icon
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	Searched_product =dr.findElement(product_searched).getText();  // the 1st product displayed after searching
	 
	return Searched_product ;								//return statement for valid search method
	 
 }
 public String  invalid_Searching(String product)
 {
	String Searched_product=null;
	
	dr.findElement(search_textbox).sendKeys(product);			 //sending keys to the search text box
	
	dr.findElement(search_icon).click();						//  clicking  on the search icon
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
		 Searched_product =dr.findElement(resultpath).getText();		// the error message for invalid search
	 
	return Searched_product ;											//return statement for invalid search method
	 
 }
}
