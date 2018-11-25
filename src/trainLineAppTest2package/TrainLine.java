package trainLineAppTest2package;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.DeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;

import org.testng.Assert;
import org.testng.AssertJUnit;

//import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeTest;

//client sends commands to appium in json format then appium reads and per
//performs automation


public class TrainLine {
	
	WebDriver driver;
	
	WebDriverWait wait;
	DesiredCapabilities cap;
	
	@BeforeMethod
	@BeforeTest
	public void setUp() throws MalformedURLException {
		
		
		cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability(CapabilityType.VERSION, "5.1");
		cap.setCapability("appPackage", "com.thetrainline");
		cap.setCapability("appActivity", "one_platform.home.HomeActivity");
	
		
		}

	
	@Test
	public void testApp() throws MalformedURLException {
				
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		wait = new WebDriverWait(driver, 60);
		
	
		
		//com.thetrainline:id/btn_from
		driver.findElement(By.id("com.thetrainline:id/btn_from")).click();
		driver.findElement(By.id("com.thetrainline:id/search_station_searchbox")).sendKeys("London Euston");

		//click here to select from list
		wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("com.thetrainline:id/nearest_stations_list_item_station_name")).click();

		
	}
	//@AfterMethod
	//@AfterTest
	//public void tearDown() {
		//driver.close();
	//}
	
	
}
