package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.UserDetailsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class eLearningInvalidRegistration_TC88 {

	private WebDriver driver;
	private String baseUrl;
	private UserDetailsPOM UserDetailsPOM;
	private static Properties properties;
	//private ScreenShot screenShot;

	@BeforeClass	//getting baseurl info
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others2.properties");
		properties.load(inStream);
	}

	@BeforeMethod	//identifying browser to chose
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		UserDetailsPOM = new UserDetailsPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void eLearningInvalidRegistration() throws InterruptedException {
		
	
		UserDetailsPOM.Username("ishisri@gmail.com");
		UserDetailsPOM.Password("Welcome1234");		//entering incorrect pwd: Correct pwd is "Welcome1234"
		UserDetailsPOM.Login();
		
	}
}
