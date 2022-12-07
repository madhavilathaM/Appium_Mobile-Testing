package webapp;

import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;;

public class task {
	
	
	AndroidDriver<AndroidElement>driver;
	
	@BeforeTest
	public void beforetest() throws MalformedURLException
	{
		
		

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
			
		
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);

		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		driver.findElement(MobileBy.AccessibilityId("1. Dialog")).click();
		driver.findElement(MobileBy.AccessibilityId("change the date")).click();
		driver.findElementByAndroidUIAutomator("text(\"14\")").click();
		driver.findElement(MobileBy.id("android:id/button1")).click();
		
		driver.findElement(MobileBy.id("io.appium.android.apis:id/pickTime")).click();
		
	AndroidElement time1=	driver.findElement(MobileBy.AccessibilityId("10"));
		
	AndroidElement time2=	driver.findElement(MobileBy.AccessibilityId("12"));
	
	TouchAction ta=new TouchAction(driver);
	
	
	
	ta.longPress(longPressOptions().withElement(element(time1)).withDuration(ofSeconds(5))).moveTo(element(time2)).release().perform();
	
	driver.findElement(MobileBy.id("android:id/button1")).click();
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	Thread.sleep(3000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))").click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.id("io.appium.android.apis:id/spinner1")).click();
	Thread.sleep(3000);
	driver.findElementByAndroidUIAutomator("text(\"green\")").click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.id("io.appium.android.apis:id/spinner2")).click();
	Thread.sleep(3000);
	driver.findElementByAndroidUIAutomator("text(\"Neptune\")").click();
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("Visibility")).click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("Invis")).click();
	
	driver.findElement(MobileBy.AccessibilityId("Vis")).click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("Gone")).click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("Vis")).click();
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(3000);
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("TextSwitcher")).click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("Next")).click();
	driver.findElement(MobileBy.AccessibilityId("Next")).click();
	
	
	driver.activateApp("com.myntra.android");
	
	System.out.println("hi welcome to myntra");
	
Thread.sleep(10000);
	
	driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();

	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Controls\")")).click();
	driver.findElement(MobileBy.AccessibilityId("3. Holo Light Theme")).click();
	driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("madhavi");
	
	driver.hideKeyboard();
	
	
	driver.findElement(MobileBy.AccessibilityId("Checkbox 2")).click();
	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
		
	}
	
	
	

}
