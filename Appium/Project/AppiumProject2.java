package Project1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumProject2 {
	 AndroidDriver driver;
		
	    @BeforeClass
	    public void setUp() throws MalformedURLException {	      
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setAppPackage("com.google.android.keep");
	        options.setAppActivity(".activities.BrowseActivity");
	        options.noReset();
	        URL serverURL = new URL("http://localhost:4723/wd/hub");
	        driver = new AndroidDriver(serverURL, options);
	    }
	    
	    @Test
	    public void Task2() throws InterruptedException {    
	    	
	    	String Title1="New Title";
	    	String Description="New description";
	    	
	    	driver.findElement(AppiumBy.accessibilityId("New text note")).click();	    	
	    	WebElement Title=driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title"));
	    	Title.click();
	    	Title.sendKeys(Title1);
	    	
	    	driver.findElement(AppiumBy.accessibilityId("New text note")).click();	    	
	    	WebElement Note_Description=driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text"));
	    	Note_Description.click();
	    	Note_Description.sendKeys(Description);
	    	
	    	
	    	driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();
	    	
	    	String Actual_Title=driver.findElement(AppiumBy.id("com.google.android.keep:id/index_note_title")).getText();
	    	String Actual_Description=driver.findElement(AppiumBy.id("com.google.android.keep:id/index_note_text_description")).getText();
	    	
	    	Assert.assertEquals(Actual_Title, Title1);
	    	Assert.assertEquals(Actual_Description, Description);
	      
	    }
}
