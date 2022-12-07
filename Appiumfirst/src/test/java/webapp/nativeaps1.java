package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

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
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.TapOptions.tapOptions;;

public class nativeaps1 {
	

	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void befortest() throws MalformedURLException
	{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
			
		
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			}
	
	@Test(enabled=false)
	public void testcase1() throws InterruptedException
	{
		
		
		System.out.println("Hi Welcome to Appium Native Apps");
		
		//driver.findElement(MobileBy.AccessibilityId("Animation")).click();
		//driver.findElementByAccessibilityId("Animation").click();
		
		driver.findElementByAccessibilityId("Preference").click();
		
		//driver.findElement(MobileBy.AccessibilityId("Cloning")).click();
		Thread.sleep(5000);
		//driver.findElements(MobileBy.className("android.widget.TextView")).get(2).click();
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Reversing\")")).click();
		
		//driver.navigate().back();
		
		//driver.findElementByAccessibilityId("Media").click();
		
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("android:id/checkbox")).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
		//driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		//driver.findElements(MobileBy.className("android.widget.RelativeLayout")).get(0).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("android:id/edit")).sendKeys("madhavi");
		
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("android:id/button2")).click();
		
		driver.hideKeyboard();
		//driver.navigate().back();
		
	}
	
	
	
	@Test(enabled=false)
	public void test2() throws InterruptedException
	{
		
		driver.openNotifications();
		
	
		Thread.sleep(3000);
		//driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
		
		//driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		driver.findElement(MobileBy.AccessibilityId("Open quick settings.")).click();
		Thread.sleep(3000);
		//driver.findElement(MobileBy.AccessibilityId("Airplane mode")).click();

		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Auto-rotate\")")).click();
		
		//driver.findElement(MobileBy.AccessibilityId("Open settings.")).click();
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Battery\")")).click();
		Thread.sleep(3000);
		//driver.findElement(MobileBy.AccessibilityId("Battery saver")).click();
		
		//driver.navigate().back();
		
		Thread.sleep(3000);
		
		//driver.findElement(MobileBy.e)
		AndroidElement page1=	driver.findElement(MobileBy.id("3d11bd47-0835-4643-b51a-edd1331c9d93"));
		//AndroidElement page1=driver.findElements(MobileBy.className("android.support.v4.view.ViewPager")).get(1);
		
		Thread.sleep(3000);
		//AndroidElement page2=driver.findElements(MobileBy.className("android.support.v4.view.ViewPager")).get(2);
		AndroidElement page2=	driver.findElement(MobileBy.id("5b244f47-52f8-4cf5-861f-5a1000f5fa10"));
		TouchAction ta1=new TouchAction(driver);
		Thread.sleep(3000);
		ta1.longPress(longPressOptions().withElement(element(page1)).withDuration(ofSeconds(5))).moveTo(element(page2)).release().perform();
		
		
		
	}
	@Test(enabled=false)
	public void testcase3() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Expandable Lists\")")).click();
	AndroidElement tap=	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"1. Custom Adapter\")"));
	
	TouchAction ta=new TouchAction(driver);
	
	//ta.tap(tapOptions().withElement(element(tap))).perform();
	
	ta.tap(tapOptions().withElement(element(tap))).perform();
	AndroidElement press=	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"People Names\")"));
	
	//driver.findElementByAndroidUIAutomator("text(\"People Names\")").click();
	ta.longPress(longPressOptions().withElement(element(press)).withDuration(ofSeconds(3))).release().perform();
	
	driver.findElementByAndroidUIAutomator("text(\"Sample action\")").click();
		
	}
	
	@Test(enabled=false)
	public void scroll()
	{
		
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
		
		
	}
	
	@Test(enabled=false)
public void dropdown() throws InterruptedException
{
	
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
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
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Visibility")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Invis")).click();
		
		driver.findElement(MobileBy.AccessibilityId("Vis")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Gone")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Vis")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("TextSwitcher")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Next")).click();
		driver.findElement(MobileBy.AccessibilityId("Next")).click();

}
	
	@Test(enabled=false)
	public void swipe() throws InterruptedException
	{
		
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		
		driver.findElement(MobileBy.AccessibilityId("12")).click();
		
		AndroidElement one=driver.findElement(MobileBy.AccessibilityId("15"));
		
		AndroidElement two=driver.findElement(MobileBy.AccessibilityId("45"));
		
		TouchAction TA=new TouchAction(driver);
		
		TA.longPress(longPressOptions().withElement(element(one)).withDuration(ofSeconds(3))).moveTo(element(two)).release().perform();
		
		driver.findElementByAndroidUIAutomator("text(\"PM\")").click();
		
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		
		AndroidElement dot1=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
		AndroidElement dot2=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_3"));
		Thread.sleep(3000);
		TA.longPress(longPressOptions().withElement(element(dot2)).withDuration(ofSeconds(5))).moveTo(element(dot1)).release().perform();
		
		
		
	}
	
	
	@Test
	public void switchapp() throws InterruptedException
	{
		
		driver.findElement(MobileBy.AccessibilityId("OS")).click();
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
		
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
		
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("Hi Welcome Madhavi");
		
		
		driver.findElement(MobileBy.AccessibilityId("Send")).click();
		
		
		driver.activateApp("com.google.android.apps.messaging");
		
		String M=driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/conversation_snippet")).getText();
		
	System.out.println(M);
	
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
	
	
	}
	
	
}
