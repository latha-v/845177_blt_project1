package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import methods.contact_us;
import wrapper.Browser_launch;

public class Support_through_contactus {
	WebDriver dr;
	Browser_launch l;
	contact_us c;
	
  @Test
  public void contacting_support1() // test case  for contact us 
  {
	  l = new Browser_launch();
	  dr=l.launch("chrome", "http://automationpractice.com/index.php");  // chrome browser launching 
	 c=new contact_us(dr);
	String text= c.Contact_us();
	System.out.println(text);
	Assert.assertTrue(text.contains("Your message has been successfully sent to our team."), "in sufficient data");
	
	  dr.close();					 //closing the browser 
  }
  @Test
  public void contacting_support2() // test case  for contact us 
  {
	  l = new Browser_launch();
	  dr=l.launch("firefox", "http://automationpractice.com/index.php");  // firefox browser launching 
	 c=new contact_us(dr);								 					//object for contactus class
	String text= c.Contact_us();  											// calling Contact_us method in contact_us class   
	System.out.println(text);
	Assert.assertTrue(text.contains("Your message has been successfully sent to our team."), "in sufficient data");  //assert for checking report send or not
	
	  dr.close();     //closing the browser 
  }
}
