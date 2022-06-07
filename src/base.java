import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class base{
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	//chrome - url
	//App .apk, device,4723, 
	//commands
	//AndroidDriver
	File appDir = new File("src");
	File app = new File(appDir, "General-Store.apk");
	DesiredCapabilities capabilitie = new DesiredCapabilities();
	capabilitie.setCapability(MobileCapabilityType.DEVICE_NAME,"Armantemulator");
	//capabilitie.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
	
	capabilitie.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
	//UI Automator -> Android apps
	capabilitie.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilitie);
	return driver;
	}
}