package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Activity6 {
    WebDriver driver;
    //Include alwaysRun property on the @BeforeTest
    //to make sure the page opens
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\003BA1744\\eclipse-workspace\\Selenium\\src\\test\\resources\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @Test
    @Parameters({"username", "password"})
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}
