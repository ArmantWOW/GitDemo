package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Preferences {
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependecies']")
	public WebElement dependecies;
}
