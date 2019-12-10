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

import com.training.generics.ScreenShot;
import com.training.pom.SignupPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class eLearningSignUp {

	private WebDriver driver;
	private String baseUrl;
	private SignupPOM SignupPOM;
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
		SignupPOM = new SignupPOM(driver);
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
	public void eLearningSignup() throws InterruptedException {
		SignupPOM.SignUpBtn();
		SignupPOM.Firstname("Ishi");
		SignupPOM.Lastname("Sri");
		SignupPOM.Email("ishisri@gmail.com");
		SignupPOM.Username("Ishi_Sri");
		SignupPOM.Password("Welcome123");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SignupPOM.ConfirmPassword("Welcome123");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SignupPOM.Phone("987654321");
		//SignupPOM.Language("English");
		SignupPOM.Register();
		Thread.sleep(2000);
	}
}
