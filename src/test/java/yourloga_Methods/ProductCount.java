package yourloga_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ProductCount {

	WebDriver driver;
	Actions actions;
	String[]products ;

	public ProductCount(WebDriver driver)
	{
		this.driver= driver;

	}
	By product1=By.xpath("//ul[@class='product_list grid row']//img[@title='Printed Summer Dress']");      //xpath for image of product1
	By name1= By.xpath("//ul[@class='product_list grid row']//h5[@itemprop='name']");    		    //xpath for name of the product1
	By button1=By.xpath("//ul[@class='product_list grid row']//a[@class='button ajax_add_to_cart_button btn btn-default']");		//xpath for aadto cart button of the product1
	By Continue1 = By.xpath("//*[@title='Continue shopping']");		                       //xpath to continue shoppimh from the product1
	By continue1= By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span");

	By product2=By.xpath("//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img");      //xpath for image of product2
	By name2= By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/h5/a");			    //xpath for name of the product2
	By button2 =By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]");		//xpath for aadto cart button of the product2
	By Continue2= By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span/i");		//xpath to continue shoppimh from the product1


	By product_count= By.xpath("//a[@title='View my shopping cart']//child::span");  //xpath  to get number of products present in the cart


	public int counting()
	{
		int count =0;                             // declaring and initializing the count variable
		products=new String[2];                   //declaring a string to store the product names
		actions = new Actions(driver);	                  // initializing the actions object

		WebElement eproduct1= driver.findElement(product1);		
		actions.moveToElement(eproduct1).build().perform();		  //mouse over action for product 1

		products[0]=driver.findElement(name1).getText();  //storing the product1 name
		driver.findElement(button1).click();				// clicking on the add to cart

		count++;										//incrementing the count value by 1

		driver.findElement(Continue1).click();;           // clicking on the continue shopping

		WebElement e1product= driver.findElement(product2);      //mouse over action for product2
		actions.moveToElement(e1product).build().perform();          //storing the product2 name

		products[1]=driver.findElement(name2).getText();    
		driver.findElement(button2).click();				  // clicking on the add to cart

		count++;											//incrementing count value by 1

		driver.findElement(Continue2).click();;                // clicking on the continue shopping


		System.out.println("no.of products added to cart :"+count);    //displaying the count value in console

		String cart_products= driver.findElement(product_count).getText();  //getting product count from the cart 
		int number= Integer.parseInt(cart_products);					// converting string in to integer
		System.out.println("no.of products in cart  :"+number);		//displaying the number products in the cart in the console

		if(count==number)												// to check the both counts are same
		{
			System.out.println("the no. of products are added same"); 
		}
		return count;											//returning th products added to the cart

	}
}


