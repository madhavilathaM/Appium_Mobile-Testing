package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class runner1 {
	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void beforetest() throws MalformedURLException
	{
		
		//driver=capabilities.webapp();
		
		

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\2#MadhaviLatha\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		
		
	}
	
	
	@Test
	public void test1() throws InterruptedException
	{
		
		
		driver.get("https://www.google.co.in/");
		
		System.out.println("Welcome to Moolyaed");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("moolyaed");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("moolyaed",Keys.ENTER);
		
	
//	Actions ac = new Actions(driver);
//		ac.sendKeys(Keys.ENTER).build().perform();
//		
		
		
		List<AndroidElement> links1=driver.findElements(By.tagName("a"));
		System.out.print("total links   "+links1.size());
		

		for(int i=0;i<links1.size();i++)
		{
		
			
		System.out.println(links1.get(i).getText());
	 //System.out.println(links1.get(i).getAttribute("href"));
		  

		String url1=links1.get(i).getAttribute("href");
		if(url1!=null)
		{
		
		System.out.println(links1.get(i).getAttribute("href"));
	}
		
		
	}
		//JavascriptExecutor js = (JavascriptExecutor)driver;

		//js.executeScript("document.getElementsByClassName('oewGkc LeUQr MUxGbd v0nnCb')[1].scrollIntoView();");
	//js.executeScript("document.getElementsByClassName('oewGkc LeUQr MUxGbd v0nnCb')[1].click();");
	
	WebElement text=driver.findElement(By.xpath("//*[contains(text(),'MoolyaEd | LinkedIn')]"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",text);
	text.click();
	
	System.out.println(driver.getTitle());
	
	
}
}
