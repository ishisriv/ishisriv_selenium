package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPOM {
	private WebDriver driver; 
	
	public SignupPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
//Finding Elements
	
	@FindBy(xpath="//a[contains(text(),' Sign up! ')]")
	private WebElement SignUpBtn;
	
	@FindBy(id="registration_firstname")
	private WebElement Firstname;
	
	@FindBy(id="registration_lastname")
	private WebElement Lastname;
	
	@FindBy(id="registration_email")
	private WebElement Email;

	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="pass1")
	private WebElement Password;

	@FindBy(id="pass2")
	private WebElement ConfirmPassword;
	
	@FindBy(id="registration_phone")
	private WebElement Phone;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement Language;

	@FindBy(id="registration_submit")
	private WebElement Register;

	
	//**************************       Declaring Methods Below     *****************************//
	
	
	public void SignUpBtn() {
		this.SignUpBtn.click();
	}
	
	public void Firstname(String Firstname) {
		this.Firstname.clear();
		this.Firstname.sendKeys(Firstname);
	}
	
	public void Lastname(String Lastname) {
		this.Lastname.clear();
		this.Lastname.sendKeys(Lastname);
	}

	public void Email(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	public void Username(String Username) {
		this.Username.clear();
		this.Username.sendKeys(Username);
	}
	public void Password(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
	
	public void ConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.clear();
		this.ConfirmPassword.sendKeys(ConfirmPassword);
	}
	
	public void Phone(String Phone) {
		this.Phone.clear();
		this.Phone.sendKeys(Phone);
	}
	
	public void Language(String Language) {
		this.Language.sendKeys(Language);
	}
	
		public void Register() {
		this.Register.click();
	}
}