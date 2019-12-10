package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserDetailsPOM {
	private WebDriver driver; 
	
	public UserDetailsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
//Finding Elements
	
	@FindBy(id="login")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement Login;
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement AddUser;
	
	@FindBy(id="firstname")
	private WebElement Firstname;
	
	@FindBy(id="lastname")
	private WebElement Lastname;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="phone")
	private WebElement PhoneNumber;
	
	@FindBy(id="username")
	private WebElement LoginUsername;
	
	@FindBy(xpath="//input[@name='password[password_auto]' and @value='0']")
	private WebElement EnterPasswordRadio;
	
	@FindBy(xpath="//input[@name='password[password]']")
	private WebElement AddNewUserPassword;
	
	@FindBy(xpath="//button[@title='Learner']//div[@class='filter-option-inner-inner']")
	private WebElement ProfileDropDown;
	
	@FindBy(xpath="//span[contains(text(),'Trainer')]")
	private WebElement TrainerOption;
	
	@FindBy(xpath="//button[@class=' btn btn-primary ' and @name='submit']")
	private WebElement Add;
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement AdministrationBtn;
	
	@FindBy(xpath="//a[@href='subscribe_user2course.php']")
	private WebElement AddUsersToCourse;
	
	@FindBy(xpath="//select[@name='UserList[]']//option[@value='568']")
	private WebElement UserListOption;
	
	@FindBy(xpath="//select[@name='CourseList[]']//option[@value='001']")
	private WebElement CourselistOption;
	
	@FindBy(xpath="//button[@value='Add to the course(s) >>']")
	private WebElement AddtotheCoursesbtn;
	
	//**************************       Declaring Methods Below     *****************************//
	
	
	public void Username(String Username) {
		this.Username.clear();
		this.Username.sendKeys(Username);
	}

	public void Password(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
	
	public void Login() {
		this.Login.click();
	}
	
	public void AddUser() {
		this.AddUser.click();
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
	
	public void PhoneNumber(String PhoneNumber) {
		this.PhoneNumber.clear();
		this.PhoneNumber.sendKeys(PhoneNumber);
	}
	
	public void LoginUsername(String LoginUsername) {
		this.LoginUsername.clear();
		this.LoginUsername.sendKeys(LoginUsername);
	}
	
	public void EnterPasswordRadio() {
		this.EnterPasswordRadio.click();
	}
	
	public void AddNewUserPassword(String AddNewUserPassword) {
		this.AddNewUserPassword.sendKeys(AddNewUserPassword);
	}
	
	public void ProfileDropDown() { 
		this.ProfileDropDown.click();
	 }
	 
	public void TrainerOption() { 
		this.TrainerOption.click();
	 }
	
	public void Add() {
		this.Add.click();
	}
	
	public void AdministrationBtn() {
		this.AdministrationBtn.click();
	}
	
	public void AddUsersToCourse() {
		this.AddUsersToCourse.click();
	}
	
	public void UserListOption() {
		this.UserListOption.click();
	}

	public void CourselistOption() {
		this.CourselistOption.click();
	}

	public void AddtotheCoursesbtn() {
		this.AddtotheCoursesbtn.click();
	}
}

