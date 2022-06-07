import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_3 extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
		//Hide keyboard
		driver.hideKeyboard();
		
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		//Other code for scrolling
		driver.findElementByXPath("//*[@text='Argentina']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector.resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))");
		int c  = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i = 0; i < c; i++) {
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(text.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
				break;
			}
			
		}
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		String lastpageText = driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		Assert.assertEquals("Jordan 6 Rings", lastpageText);
	}

}
