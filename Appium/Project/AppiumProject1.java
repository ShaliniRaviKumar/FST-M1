package Project1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumProject1 {
	 AndroidDriver driver;
	
	    @BeforeClass
	    public void setUp() throws MalformedURLException {	      
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setAppPackage("com.google.android.apps.tasks");
	        options.setAppActivity(".ui.TaskListsActivity");
	        options.noReset();
	        URL serverURL = new URL("http://localhost:4723/wd/hub");
	        driver = new AndroidDriver(serverURL, options);
	    }
	    
	    @Test
	    public void Task1() throws InterruptedException {    List<String> Task_Name = new ArrayList();
        Task_Name.add("Complete Activity with Google Tasks");
        Task_Name.add("Complete Activity with Google Keep");
        Task_Name.add("Complete the second Activity Google Keep"); 
        System.out.println(Task_Name);	    	
	        for(int i=0;i<=2;i++)
	        {		        	
		        Thread.sleep(20000);
	        	driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
	        	driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys(Task_Name.get(i));
	        	driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
	        }
	        
	        driver.findElement(AppiumBy.accessibilityId("New list")).click();
	        List<String> Task_Name_List = new ArrayList();
	        String Taskdesc1=Task_Name.get(0);
	        String Taskdesc2=Task_Name.get(1);
	        String Taskdesc3=Task_Name.get(2);
	        String Task_Name1=driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@text()='"+Taskdesc1+"']")).getText();
	        Task_Name_List.add(Task_Name1);
	        String Task_Name2=driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@text()='"+Taskdesc2+"']")).getText();
	        Task_Name_List.add(Task_Name2);
	        String Task_Name3=driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@text()='"+Taskdesc3+"']")).getText();
	        Task_Name_List.add(Task_Name3);
	        System.out.println(Task_Name_List);	        
	        Assert.assertNotEquals(Task_Name, Task_Name_List);
	      
	    }
	   


}
