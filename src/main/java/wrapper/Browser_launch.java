package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_launch {
 WebDriver dr;
 
public  WebDriver launch(String browser , String url)  //method to lanch browser
{
	

	switch (browser)
	{
	case "chrome" :    //launching chrome browser
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		dr= new ChromeDriver();  //initializing dr object
		break;
	}
	case "firefox":			//launching firefox browser
	{
		System.setProperty("webdriver.gecko.driver","src/test/resources/Drivers/geckodriver.exe");
		dr= new FirefoxDriver();		//initializing dr object
		
	}
	}
	dr.manage().window().maximize();   //maximizing the browser window
	dr.get(url);						// to launch the site
	dr.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);		// implicit wait for all webelements
	return dr;														// returning dr to the calling method

	
}
}
