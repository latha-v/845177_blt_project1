package yourloga_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import wrapper.Browser_launch;

public class Verifing_product {
	String[] products;

	WebDriver driver;
	Browser_launch launchb;
	SearchProduct searchp;

	AddToCart cartc;
	public Verifing_product(WebDriver driver)
	{
		this.driver= driver;

	}
	By cart = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");  //xpath for cart

	By name1 = By.xpath("//*[@id='product_5_19_0_0']/td[2]/p");  //xpath  for first product name
	By name2= By.xpath("//*[@id='product_4_16_0_0']/td[2]/p");   //xpath  for second product name
	public boolean verifyProduct(String product1, String product2)
	{
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

		if(product2.contains(actual_products2))   //to check the name is same for the product1 added to the cart and the product added in the cart

		{

			b2=true;
		}
		System.out.println(b2);

		boolean b=(b1&&b2);
		return b;
	}
}
