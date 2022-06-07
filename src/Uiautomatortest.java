import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		

	}

}
