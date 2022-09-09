package Project1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumProject3 {
	 AndroidDriver driver;
		
	    @BeforeClass
	    public void setUp() throws MalformedURLException {	      
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setAppPackage("com.android.chrome");
	        options.setAppActivity("com.google.android.apps.chrome.Main");
	        options.noReset();
	        URL serverURL = new URL("http://localhost:4723/wd/hub");
	        driver = new AndroidDriver(serverURL, options);
	        driver.get("https://www.training-support.net/selenium");
	    }
	    
	    @Test
	    public void Task3() throws InterruptedException {    
	    	 List<String> Task_Name = new ArrayList();
	    	 Task_Name.add("Add tasks to list");
	         Task_Name.add("Get number of tasks");
	         Task_Name.add("Clear the list"); 
	         System.out.println(Task_Name);	   
	         
	       //get started
		    	driver.findElement(AppiumBy.xpath("//android.widget.Button[text()='Get Started!']")).click();
		    	
		    	//scroll list    	
		    	driver.findElement(AppiumBy.androidUIAutomator("UiScrollable(new UiSelector()).scrollTextIntoView(\"To-Do List\"))"));	    	
		    	driver.findElement(AppiumBy.xpath("//android.view.View[contains(text(),'To-Do List')]")).click();
	         
	 	        for(int i=0;i<=2;i++)
	 	        {	
	 	        	WebElement Text_Box=driver.findElement(AppiumBy.className("android.widget.EditText"));
	 		    	Text_Box.click();
	 		    	Text_Box.sendKeys(Task_Name.get(i));
	 	        	
	 		    	
	 		    	driver.findElement(AppiumBy.xpath("//android.widget.Button[text()='Add Task']")).click();
	 		    	driver.findElement(AppiumBy.xpath("//android.widget.Button[text()='Clear List']")).click();
	 	        	
	 		    	
	 		    	WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.Button[text()='Add more tasks to this list.']"));
	 		    		 	        	
	 	        	if(!element.isDisplayed())
	 	        	{
	 	        		System.out.println("Test case is passed");
	 	        	}
	 	        	else 
	 	        	{
	 	        		System.out.println("Test case is failed");
	 	        	}	
	 	        }
	    	
	    }
}
