package yourloga_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {

	WebDriver driver;
	public ContactUs(WebDriver driver)
	{
		this.driver=driver;

	}

	By contactlink = By.xpath("//*[@id='contact-link']//a");                   //xpath for contact us link
	By option = By.xpath("//option[@value='2']");								//xpath for selecting the customer type
	By mail = By.xpath("//*[@class='form-control grey validate']");				//xpath of mail textbox
	By reference = By.xpath("//*[@class='form-control grey']");					//xpath for referenc textbox
	By message= By.xpath("//*[@id='message']");									//xpath for message textbox
	By send= By.xpath("//*[@name='submitMessage']");							//xpath of send button
	By result = By.xpath("//*[@class='alert alert-success']");					//xpath  alert message

	public String contact_Us()
	{
		String text=null;											
		driver.findElement(contactlink).click();							//clicking on the contact us 
		driver.findElement(option).click();								//selecting the customer type
		driver.findElement(mail).sendKeys("sreelatha.ece2015@gmail.com");	//sending mail id to the mailid textbox
		driver.findElement(reference).sendKeys("Ie354654555");				//sending the reference to the reference textbox
		driver.findElement(message).sendKeys("the product is different from the produt ordered");  // sending the message to the message text box
		driver.findElement(send).click();                                   //clicking on the send button
		text= driver.findElement(result).getText();						//getting and storing  the result as text 
		return text;													// returning the stored string
	}

}
