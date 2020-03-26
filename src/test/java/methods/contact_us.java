package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class contact_us {

	WebDriver dr;
	public contact_us(WebDriver dr)
	{
		this.dr=dr;
		
	}
	
By contactlink = By.xpath("//*[@id='contact-link']//a");                   //xpath for contact us link
By option = By.xpath("//option[@value='2']");								//xpath for selecting the customer type
By mail = By.xpath("//*[@class='form-control grey validate']");				//xpath of mail textbox
By reference = By.xpath("//*[@class='form-control grey']");					//xpath for referenc textbox
By message= By.xpath("//*[@id='message']");									//xpath for message textbox
By send= By.xpath("//*[@name='submitMessage']");							//xpath of send button
By result = By.xpath("//*[@class='alert alert-success']");					//xpath  alert message

	 public String Contact_us()
	 {
		 String text=null;											
		 dr.findElement(contactlink).click();							//clicking on the contact us 
		 dr.findElement(option).click();								//selecting the customer type
		 dr.findElement(mail).sendKeys("sreelatha.ece2015@gmail.com");	//sending mail id to the mailid textbox
		 dr.findElement(reference).sendKeys("Ie354654555");				//sending the reference to the reference textbox
		 dr.findElement(message).sendKeys("the product is different from the produt ordered");  // sending the message to the message text box
		 dr.findElement(send).click();                                   //clicking on the send button
		 text= dr.findElement(result).getText();						//getting and storing  the result as text 
		 return text;													// returning the stored string
	 }
	
}
