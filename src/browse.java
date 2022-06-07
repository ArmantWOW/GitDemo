import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class browse extends baseChrome{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElementByCssSelector(".navbar-toggler").click();
		driver.findElementByCssSelector("a[href*='products']").click();
		
	}
	

}
