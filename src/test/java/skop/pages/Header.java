package skop.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skop.testbase.TestBase;

public class Header extends TestBase {
	
	final WebDriver driver;
	
	@FindBy(xpath="//div[@class='hygiene-nav']//a[contains(text(),'Log in')]")
	private WebElement LOGINLINK;
	
	@FindBy(xpath="//div[@class='hygiene-nav']//a[contains(text(),'Log Out')]")
	private WebElement LOGOUTLINK;
	
	@FindBy(xpath="//div[@class='hygiene-nav']//a[contains(text(),'Register')]")
	private WebElement REGISTRATIONPAGELINK;
	
	@FindBy(xpath="//*[@id='main-menu']//a[contains(text(),'My Profile')]")
	private WebElement MYPROFILE;
	
	@FindBy(xpath="//div[@class='hygiene-nav']//a[contains(text(),'Hello,')]")
	private WebElement MYPROFILENAME;
	
	public Header(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin(){
		this.waitForVisibility(driver,LOGINLINK);
		LOGINLINK.click();
		sleep(1000);
	}
	
	public void clickLogout(){
		this.waitForVisibility(driver,LOGOUTLINK);
		LOGINLINK.click();
		sleep(5000);
	}
	
	public void clickRegister(){
		this.waitForVisibility(driver,REGISTRATIONPAGELINK);
		REGISTRATIONPAGELINK.click();	
	}
	
	public void CheckLogoutLink(){
		checkObjectIsDisplayed(LOGOUTLINK);			
		assertEquals(LOGOUTLINK.getText(), "Log Out");
	}
	
}
