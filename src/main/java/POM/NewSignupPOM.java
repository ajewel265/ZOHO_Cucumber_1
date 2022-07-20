package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewSignupPOM {
 WebDriver driver;

 public NewSignupPOM(WebDriver driver) {
  this.driver = driver;
  PageFactory.initElements(driver, this);

 }
 @FindBy(xpath = "//span[normalize-space()='Accept All Cookies']")
 WebElement Clickallcookies;
 public  void Closeallcookies()
 {
  Clickallcookies.click();
 }
 //@FindBy(xpath = "//*[name()='path' and contains(@data-name,'Union 1')]")
 //WebElement closeCookies;
 //public void ClsCookies()
 {
 // closeCookies.click();
 }
  @FindBy(xpath = "//div[@class='zgh-utilities']//a[@class='zgh-signup'][normalize-space()='Sign Up Now']")
  WebElement SignUpNow;
  public void ClickSignupnow()
  { SignUpNow.click(); }

 @FindBy(xpath = "//input[@id='company_name']")
 WebElement CompanyName;
  public void companyname(String name){  CompanyName.sendKeys(name);}



}




