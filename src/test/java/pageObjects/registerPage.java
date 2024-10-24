package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends basePage 
{
  public registerPage(WebDriver driver)
  {
	  super(driver);
  }
  @FindBy(xpath = "//a[text()='Register']") WebElement registerLink;
  @FindBy(xpath = "//input[@id='gender-male']")  WebElement maleRadio;
  @FindBy(xpath = "//input[@id='gender-female']")  WebElement femaleRadio;
  @FindBy(id = "FirstName")   WebElement firstNameTF;
  @FindBy(id = "LastName")    WebElement lastNameTF;
  @FindBy(id = "Email")       WebElement emailTF;
  @FindBy(id = "Company")     WebElement companyTF;
  @FindBy(id = "Password")    WebElement passTF;
  @FindBy(id = "ConfirmPassword")  WebElement conPassTF;
  @FindBy(id = "register-button")  WebElement registerBtn;
  @FindBy(xpath = "//select[@name='DateOfBirthYear']")  WebElement yearDD;
  @FindBy(xpath = "//select[@name='DateOfBirthMonth']") WebElement monthDD;
  @FindBy(xpath = "//select[@name='DateOfBirthDay']")   WebElement dateDD;
  @FindBy(xpath = "//a[text()='Log in']")     WebElement loginLink;
  public void regLink()
  {
	registerLink.click();  
  }
  public WebElement firstTF()
  {
	  return firstNameTF;
  }
  public WebElement lastTF()
  {
	  return lastNameTF;
  }
  public WebElement email()
  {
	 return emailTF; 
  }
  public WebElement password()
  {
	  return passTF;
  }
  public WebElement conPass()
  {
	  return conPassTF;
  }
  public WebElement Month()
  {
	  return monthDD;
  }
  public WebElement Date()
  {
	  return dateDD;
  }
  public WebElement Year()
  {
	  return yearDD;
  }
  public void registerButton()
  {
	  registerBtn.click();
  }
  public void male()
  {
	maleRadio.click();  
  }
  public void female()
  {
	  femaleRadio.click();
  }
  public void loginL()
  {
	  loginLink.click();
  }
}
