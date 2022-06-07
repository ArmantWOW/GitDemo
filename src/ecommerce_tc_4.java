import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_4 extends base {

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
		
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		String amount1 = driver.findElementsById("com.androidsample.generalstore.id/productPrice").get(0).getText();
		amount1 = amount1.substring(1);
		double amount1Value= Double.parseDouble(amount1);
		String amount2 = driver.findElementsById("com.androidsample.generalstore.id/productPrice").get(1).getText();
		amount2 = amount2.substring(1);
		double amount2Value= Double.parseDouble(amount2);
		double totalofProducts = amount1Value + amount2Value;
		String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		total= total.substring(1);
		double totalValue = Double.parseDouble(total);
		Assert.assertEquals(totalofProducts, totalValue);
		
		}

}
