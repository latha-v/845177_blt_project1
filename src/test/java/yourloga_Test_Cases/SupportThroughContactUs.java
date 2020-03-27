package yourloga_Test_Cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.Browser_launch;
import yourloga_Methods.ContactUs;

public class SupportThroughContactUs {
	WebDriver driver;
	Browser_launch launchb;
	ContactUs cartc;

	@Test
	public void contacting_Support1() // test case  for contact us 
	{
		launchb = new Browser_launch();
		driver=launchb.launch("chrome", "http://automationpractice.com/index.php");  // chrome browser launching 
		cartc=new ContactUs(driver);
		String text= cartc.contact_Us();											// calling Contact_us method in contact_us class
		System.out.println(text);
		Assert.assertTrue(text.contains("Your message has been successfully sent to our team."), "in sufficient data");

		driver.close();					 //closing the browser 
	}
	@Test
	public void contacting_Support2() // test case  for contact us 
	{
		launchb = new Browser_launch();
		driver=launchb.launch("firefox", "http://automationpractice.com/index.php");  // firefox browser launching 
		cartc=new ContactUs(driver);								 					//object for contactus class
		String text= cartc.contact_Us();  											// calling Contact_us method in contact_us class   
		System.out.println(text);
		Assert.assertTrue(text.contains("Your message has been successfully sent to our team."), "in sufficient data");  //assert for checking report send or not

		driver.close();     //closing the browser 
	}
}
