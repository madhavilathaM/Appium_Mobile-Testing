package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class prcti1 {
	
	

	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void befortest() throws MalformedURLException
	{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.myntra.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.myntra.android.SplashActivity");
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.myntra.android.activities.CartActivity");
			
		
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			}
	
@Test
	public void test() throws InterruptedException
	{
		
		System.out.println("hi welcome to myntra");
		
		Thread.sleep(10000);
		
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
		
		
	}
}
