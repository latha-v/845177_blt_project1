package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class add_to_cart {

	WebDriver dr;
	Actions a;
	String[]products ;
   
public add_to_cart(WebDriver dr)
{
	this.dr= dr;
	
}
By product1=By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img");      //xpath for image of product1
By name1= By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a");    		    //xpath for name of the product1
By button1=By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]");		//xpath for aadto cart button of the product1
By Continue1 = By.xpath("//*[@title='Continue shopping']");		                       //xpath to continue shoppimh from the product1
By continue1= By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span");

By product2=By.xpath("//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img");      //xpath for image of product2
By name2= By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/h5/a");			    //xpath for name of the product2
By button2 =By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]");		//xpath for aadto cart button of the product2
By Continue2= By.xpath("//*[@title='Continue shopping']");		                        //xpath to continue shoppimh from the product1
By continue2 = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span");


public String[] adding()
{
	int count =0;                             // declaring and initializing the count variable
	products=new String[2];                   //declaring a string to store the product names
	 a = new Actions(dr);	                  // initializing the actions object
	 
	WebElement e= dr.findElement(product1);		
	 a.moveToElement(e).build().perform();		  //mouse over action for product 1
	 
	 products[0]=dr.findElement(name1).getText();  //storing the product1 name
	 dr.findElement(button1).click();				// clicking on the add to cart
	 
	 count++;										//incrementing the count value by 1
	 
	 dr.findElement(continue1).click();           // clicking on the continue shopping
	 
	 WebElement e1= dr.findElement(product2);      //mouse over action for product2
	 a.moveToElement(e1).build().perform();          //storing the product2 name
	 
	 products[1]=dr.findElement(name2).getText();    
	 dr.findElement(button2).click();				  // clicking on the add to cart
	 
	 count++;											//incrementing count value by 1
	 
	 dr.findElement(continue2).click();;                // clicking on the continue shopping
	 
	
	
	
	 return products;											//returning th products added to the cart
	 
}
}
