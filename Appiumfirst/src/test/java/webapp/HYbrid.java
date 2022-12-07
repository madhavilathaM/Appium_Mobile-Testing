package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class HYbrid {
	
	

	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void befortest() throws MalformedURLException
	{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
			
		
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			}
	
	
	@Test(enabled=false)
	public void positive() throws InterruptedException
	{
	
		
		driver.findElement(MobileBy.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Madhavi");
		
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
		
		Thread.sleep(5000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		String price1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		
		price1=price1.substring(1);
		
		Double cost1=Double.parseDouble(price1);
		System.out.println(cost1);
		
		String price2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		price2=price2.substring(1);
		Double cost2=Double.parseDouble(price2);
		System.out.println(price2);
		Double Totalprice=cost1+cost2;
		System.out.println(Totalprice);
		
		
		
		String total=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		
		total=total.substring(1);
		
		double total1=Double.parseDouble(total);
		
		System.out.println(total1);
		
		if(Totalprice.equals(total1))
		{
			
			System.out.println("Price Matched");
		}
		else
		{
			
			System.out.print("Price not Matching");
		}
		
		
		Thread.sleep(5000);
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/webView"));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		
	}
		
		
	@Test(enabled=false)
	public void negative() throws InterruptedException
	{
	
		
		driver.findElement(MobileBy.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();
		//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Madhavi");
		
		//driver.hideKeyboard();
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
	String M=	driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
		
	System.out.println(M);
		
		
		
	}
	@Test(enabled=true)
	public void scroll() throws InterruptedException
	{
		

		driver.findElement(MobileBy.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Madhavi");
		
		driver.hideKeyboard();
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
		
		Thread.sleep(5000);
		
		String productname=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").getText();
		
		System.out.println(productname);
		
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		
		
String price1=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productPrice")).getText();
		
		price1=price1.substring(1);
		
		Double cost1=Double.parseDouble(price1);
		System.out.println(cost1);
		
		Thread.sleep(5000);
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		
		
		
		
		
		
	}

}
