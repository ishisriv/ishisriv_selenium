package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	/*
	 * @FindBy(id="formLogin_submitAuth") private WebElement loginBtn;
	 */
	
	//@FindBy(className="fa fa-user-o")
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement loginBtn; 
	
	//@FindBy(className="btn btn-primary")
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement Register;
	
	
	//Finding Elements On Register Page
	
	@FindBy(id="input-firstname")
	private WebElement Firstname;
	
	@FindBy(id="input-lastname")
	private WebElement Lastname;
	
	@FindBy(id="input-email")
	private WebElement Email;

	@FindBy(id="input-telephone")
	private WebElement Telephone;

	@FindBy(id="input-address-1")
	private WebElement Address1;
	
	@FindBy(id="input-address-2")
	private WebElement Address2;

	@FindBy(id="input-city")
	private WebElement City;

	@FindBy(id="input-postcode")
	private WebElement Postcode;

	@FindBy(id="input-country")
	private WebElement Country;
	
	@FindBy(id="input-zone")
	private WebElement RegionState;
	
	@FindBy(id="input-password")
	private WebElement Password;
	
	@FindBy(id="input-confirm")
	private WebElement ConfirmPassword;

	@FindBy(name="newsletter")
	private WebElement SubscribeNo;

	@FindBy(name="agree")
	private WebElement AcceptTerms;

	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Continue;
	
	//Identifying Login Elements
	@FindBy(xpath="//input[@value='Login']")
	private WebElement Login;
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement LoginEmail;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement LoginPassword;
	
	@FindBy(linkText="Forgotten Password")
	private WebElement ForgotPwd;
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement VerifyEmail;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement VerifyContinue;
	
	
	
	//**************************       Declaring Methods Below     *****************************//
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	//Creating Methods for each field to pass value
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
	
	public void Telephone(String Telephone) {
		this.Telephone.clear();
		this.Telephone.sendKeys(Telephone);
	}
	
	public void Address1(String Address1) {
		this.Address1.clear();
		this.Address1.sendKeys(Address1);
	}
	
	public void Address2(String Address2) {
		this.Address2.clear();
		this.Address2.sendKeys(Address2);
	}
	
		
	public void City(String City) {
		this.City.clear();
		this.City.sendKeys(City);
	}
	
	public void Postcode(String Postcode) {
		this.Postcode.clear();
		this.Postcode.sendKeys(Postcode);
	}
	
	public void Country(String Country) {
		//this.Country.clear();
		this.Country.sendKeys(Country);
	}
	
	public void RegionState(String RegionState) {
		//this.RegionState.clear();
		this.RegionState.sendKeys(RegionState);
	}
	
	public void Password(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
	
	//City, Postcode, Country, RegionState, Password, ConfirmPassword, Subscribe, AcceptTerms, Continue
	
	public void ConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.clear();
		this.ConfirmPassword.sendKeys(ConfirmPassword);
	}
	
	public void SubscribeNo() {
		//this.SubscribeNo.clear();
		this.SubscribeNo.click();
	}
	
	public void AcceptTerms() {
		//this.AcceptTerms.clear();
		this.AcceptTerms.click();
	}
	
	public void Continue() {
		//this.Continue.clear();
		this.Continue.click();
	}
	
	/*
	 * public void clickLoginBtn() { this.loginBtn.click(); }
	 */
	
	public void clickLoginBtn() {
		this.loginBtn.click();
	}
	
	public void clickRegister() {
		this.Register.click();
	}
	
	public void clickLogin() {
		this.Login.click();
	}
	
	//Defining methods for login page
	public void LoginEmail(String LoginEmail) {
		this.LoginEmail.clear();
		this.LoginEmail.sendKeys(LoginEmail);
	}
	
	public void LoginPassword(String LoginPassword) {
		this.LoginPassword.clear();
		this.LoginPassword.sendKeys(LoginPassword);
	}
	
	public void ForgotPwd() {
		this.ForgotPwd.click();
	}
	
	public void VerifyEmail(String VerifyEmail) {
		this.VerifyEmail.clear();
		this.VerifyEmail.sendKeys(VerifyEmail);
	}
	
	public void VerifyContinue() {
		this.VerifyContinue.click();
	}
	

}