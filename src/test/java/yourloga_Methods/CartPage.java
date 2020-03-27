package yourloga_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CartPage {

	WebDriver driver;
	Actions actions;
	public CartPage(WebDriver driver)
	{
		this.driver= driver;

	}

	By product_count= By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");  //xpath  to get number of products present in the cart


	public boolean cartCount(int count)
	{
		String cart_products= driver.findElement(product_count).getText();  //getting product count from the cart 
		int number= Integer.parseInt(cart_products);
		boolean b= (number==count);
		return b;
	}
}

