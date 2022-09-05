package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_1 {

    public static void main(String[] args) {
    	
    			System.setProperty("webdriver.gecko.driver", "C:\\Users\\003BA1744\\eclipse-workspace\\Selenium\\src\\test\\resources\\Drivers\\geckodriver.exe");
    	
    	        WebDriver driver = new FirefoxDriver();
    	        Actions actions = new Actions(driver);

    	        //Open browser
    	        driver.get("https://www.training-support.net/selenium/input-events");
    	        //Find the cude
    	        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

    	        //Left click
    	        actions.click(cube).build().perform();
    	        WebElement cubeVal = driver.findElement(By.className("active"));
    	        System.out.println("Left Click: " + cubeVal.getText());

    	        //Double click
    	        actions.doubleClick(cube).build().perform();
    	        cubeVal = driver.findElement(By.className("active"));
    	        System.out.println("Double Click: " + cubeVal.getText());
    	        
    	        //Right click        
    	        actions.contextClick(cube).build().perform();
    	        cubeVal = driver.findElement(By.className("active"));
    	        System.out.println("Right Click: " + cubeVal.getText());

    	        //Close browser
    	        driver.close();
    	    }
    	}  