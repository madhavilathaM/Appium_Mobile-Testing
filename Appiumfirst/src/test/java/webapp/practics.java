package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class practics {
	
	
	
	
	AndroidDriver<AndroidElement>driver;
	
	@BeforeTest
	public void beforetest() throws MalformedURLException
	{
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
	}
}
