package skop.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import skop.testbase.TestBase;

public class Login extends TestBase {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//h3[@class='h5 text-center' and contains(text(),'Log in with Email or Username')]")
	private WebElement LOGINPAGELABLE;
	
	@FindBy(xpath="//*[@id='login_link']")
	private WebElement LOGINLINK;
	
	@FindBy(xpath="//*[@id='login_email']")
	private WebElement EMAILTEXTBOX;
	
	@FindBy(xpath="//*[@id='login_password']")
	private WebElement PASSWORDTEXTBOX;
	
	@FindBy(xpath="//*[@id='login_me']")
	private WebElement LOGINBUTTON;
	
	@FindBy(css="#login-error-form")
	private WebElement LOGINERROR;

	
	
	
	public Login(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginlableVerify(){
		checkObjectIsDisplayed(LOGINPAGELABLE);
		assertEquals(LOGINPAGELABLE.getText(), "Log in with Email or Username");
	}
	
	
	public void clickLoginLink(){
		checkObjectIsDisplayed(LOGINLINK);
		LOGINLINK.click();
	
	}
	
	public void enterEmail(String email){
		checkObjectIsDisplayed(EMAILTEXTBOX);
		clearAndwrite(EMAILTEXTBOX, email);	
		System.out.println("Email entered.");
	}
	
	public void enterPassword(String password){
		checkObjectIsDisplayed(PASSWORDTEXTBOX);
		clearAndwrite(PASSWORDTEXTBOX, password);	
		System.out.println("Password entered.");
	}
	
	public void clickLoginButton(){
		checkObjectIsDisplayed(LOGINBUTTON);
		LOGINBUTTON.click();
		sleep(5000);
		System.out.println("Clicked on Login button.");
	}
	
	public void doLogin(){
		String email = environment.getProperty("email");
		String password = environment.getProperty("password");
		enterEmail(email);
		//loggers.log(Status.INFO, "Email entered.");
		enterPassword(password);
		//loggers.log(Status.INFO, "Password entered.");
		clickLoginButton();	
		//loggers.log(Status.INFO, "Clicked login button.");
	}
}
