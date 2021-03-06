package skop.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import skop.utils.ActionsUtility;

public class TestBase extends ActionsUtility {

	public WebDriver driver;
	public static File env;
	public static Properties environment;
	public Properties OR;
	public File ORfile;
	public static FileInputStream Configfile;
	public FileInputStream ORprop;

	public void init() throws Throwable {
		loadProperties();
		System.out.println(environment.getProperty("email"));
		launchBrowser(environment.getProperty("browser"));
		geturl();
	}

	public void launchBrowser(String browser) throws Throwable {
		System.out.println("OS is: "+System.getProperty("os.name")+" And Browser is: "+browser);
		if (System.getProperty("os.name").contains("Windows 10")) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.marionette",
						System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
				// loggers.info("Operating System: Windows And Browser :
				// Firefox");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				// loggers.info("Operating System: Windows And Browser :
				// Chrome");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				options.addArguments("window-size=1280,1024");
				driver = new ChromeDriver(options);
			}
		} else if (System.getProperty("os.name").contains("Linux"))
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
				System.out.println("Launching chrome browser on linux....");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				options.addArguments("window-size=1920,1080");
				driver = new ChromeDriver(options);
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.marionette",
						System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
				System.out.println("Launching firefox browser on linux....");
				driver = new FirefoxDriver();
			}
	}

	public void geturl() throws Throwable {
		String Url = environment.getProperty("URL");
		System.out.println("Launching the following Website: " + Url);
		driver.get(Url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public String getEndPoint(int row, int col) throws Throwable {
		String endPoint = getcelldata("Testcase Data", row, col);
		return endPoint;
	}

	public URL urlbuilder(String endPoint) throws Throwable {
		String baseUrl = environment.getProperty("URL");
		System.out.println("End point is : " + endPoint);
		String finalUrlstr = baseUrl + endPoint;
		URL finalUrl = new URL(finalUrlstr);
		return finalUrl;
	}

	public static void loadProperties() throws IOException {
		// Load env.properties file
		environment = new Properties();
		env = new File(System.getProperty("user.dir") + "/src/test/resources/config/env.properties");
		FileInputStream Configfile = new FileInputStream(env);
		environment.load(Configfile);
	}

	public static String isLinkBroken(URL url) throws Exception
	{
		// url = new URL("http://yahoo.com");
		String response = "";
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		try
		{
			connection.connect();
			response = connection.getResponseMessage();
			connection.disconnect();
			return response;
		}
		catch (Exception exp)
		{
			return exp.getMessage();
		}
	}

	public void sleep(int value) {
		try {
			// System.out.println("Sleeping for " + value + " seconds");
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void NavigateTo(URL Url) {
		System.out.println("Navigating on this URL: "+Url);
		driver.navigate().to(Url);
	}
	
	/**
     * Verifying the Text - eg :Error/success messages
     * @param object
     * @param data
	 * @return 
     */
    public boolean verifyText(WebElement element, String expected, String comparison) {
    	String expectedtext = expected.replaceAll("\\s","").toLowerCase();
        String actualText = element.getText().replaceAll("\\s","").toLowerCase();
    
        System.out.println("Expected text: '" + expectedtext + "'");
        System.out.println("Actual text: '" + actualText + "'");       

        boolean isOK = false;
        switch (comparison) {
            case "STARTS_WITH":
                isOK = actualText.toLowerCase().startsWith(expectedtext.toLowerCase());
                break;
            case "CONTAINS":
            	
                isOK = actualText.contains(expectedtext.toLowerCase());
                break;
            case "NOT_CONTAINS":
                  isOK = !(actualText.toLowerCase().contains(expectedtext.toLowerCase()));
                break;
            case "NOT_EQUALS":
                  isOK = !(actualText.toLowerCase().equalsIgnoreCase(expectedtext.toLowerCase()));
                break;
            case "EQUALS":
            default:
                isOK = expectedtext.equalsIgnoreCase(actualText);
                break;
        	}
        return isOK;
        }
    
    

	public void implicitwait(long Time) {
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.MILLISECONDS);
	}
	

	/**
	 * Writes the desired text in a text area (or input)
	 * @param params
	 *            1 - The element to write and 2 - The text to be written
	 */
	public void clearAndwrite(WebElement element, String value) {
		element.clear();
		// Type the content with 100 ms delay in between each character
		for (Character c : value.toCharArray()) {
			element.sendKeys(c.toString());
			sleep(20);
		}
	}

	/**
	 * Check if object exists AND that it is displayed, using its location
	 * 
	 * @param params
	 *            The element locator
	 * 
	 */
	public void checkObjectIsDisplayed(WebElement element) {

		int NUMBER_OF_WAITS = 1;
		int count = 0;
		boolean elementIsDisplayed = false;
		do {
			try {
				elementIsDisplayed = element != null && element.isDisplayed();
				if (!elementIsDisplayed) {
					System.out.println("Element is not yet displayed - Sleeping for 500ms before checking again");
					sleep(500);
				}
			} catch (Exception e) {
				if (e.getCause() instanceof org.openqa.selenium.StaleElementReferenceException) {
					System.out.println("Element is STALE. Trying again");
					sleep(1000);
				} else {
					e.printStackTrace();
				}
			}
		} while (!elementIsDisplayed && count++ < NUMBER_OF_WAITS);

	}
	
	/**
     * Switches to an alert on screen and accept it
     * @param params Nothing is expected
     */
    public void acceptAlert() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
    /**
     * Switches to an alert on screen and dismiss it
     * @param params Nothing is expected
     */
    public void dismissAlert() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

	public void mouseOverToElement(WebDriver driver, WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println("Could not mouse over to element: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Click on the desired element.
	 * 
	 * @param params
	 *            The locator of the element to be clicked
	 */
	public void scrollAndFind(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			System.out.println("An exception was thrown. scrollAndFind: " + e.getMessage());
			e.printStackTrace();
		}
		sleep(500);
	}

	public static void HoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}

	public void sliderMove(WebDriver driver, WebElement slider, int x, int y) {
		int width = slider.getSize().getWidth();
		Actions move = new Actions(driver);
		move.clickAndHold(slider);
		move.moveByOffset(x, y).build().perform();
		move.release(slider).perform();
	}

	public void scrolltoElement(WebDriver driver, WebElement Element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Element);
		sleep(500);
	}

	public String getparentwindowandswitchNewWindow(WebDriver driver) {
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		return winHandleBefore;
	}

	public void switchNewWindow(WebDriver driver) {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public void switchParentWindow(WebDriver driver, String parentWindow) {
		driver.switchTo().window(parentWindow);
	}

	public void waitForVisibility(WebDriver driver, WebElement element) throws Error {
		WebDriverWait wait = new WebDriverWait(driver, 20) {
		};
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForVisibilityOfAllElements(WebDriver driver, List<WebElement> element) throws Error {
		WebDriverWait wait = new WebDriverWait(driver, 20) {
		};
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void fluentwait(WebDriver driver, WebElement element) throws Error {
		new WebDriverWait(driver, 60).pollingEvery(1, TimeUnit.SECONDS).until(ExpectedConditions.visibilityOf(element));
	}

	public void viewElement(WebDriver driver, WebElement element) throws Error {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", element);
	}

	public void clickUsingJs(WebDriver driver, WebElement element) throws Error {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement new_element = wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", new_element);
	}

	public void enterTextUsingJs(WebDriver driver, WebElement element, String Value) throws Error {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement new_element = wait.until(ExpectedConditions.visibilityOf(element));
		((JavascriptExecutor) driver).executeScript("arguments[0].value = '" + Value + "'", new_element);

	}

}
