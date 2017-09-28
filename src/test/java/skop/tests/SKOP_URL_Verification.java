package skop.tests;

import java.net.URL;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import skop.pages.CommonObjectsRepo;
import skop.pages.Login;
import skop.testbase.TestBase;

public class SKOP_URL_Verification extends TestBase {

	

	@BeforeSuite
	public void setupAndLogin() throws Throwable {
		String testcasename = "SKOP_Login";
		init();
		Login logobj = new Login(driver);
		logobj.doLogin();
		extent = getExtent();
		loggers = startTest(testcasename);
	}
	
	

	@Test(priority=0)
	public void CheckHomeURL() throws Throwable {
		String testcasename = "TC_01_URL_Home";
		extent = getExtent();
		loggers = startTest(testcasename);
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(5, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the home page objects..");
		commonOR.homePagelableVerify();

	}
	
	@Test(priority=1)
	public void checkmyProfileURL() throws Throwable {
		String testcasename = "TC_02_URL_My_Profile";
		extent = getExtent();
		loggers = startTest(testcasename);
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(6, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the My Profile page objects..");
		commonOR.myProfilePagelableVerify();
		commonOR.myProfilefirstNameObj();

	}
	
	@Test(priority=2)
	public void checkchangePasswordURL() throws Throwable {
		
		String testcasename = "TC_03_URL_ChangePassword";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(7, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the change password page objects..");
		commonOR.chagnePasswordPagelableVerify();
		commonOR.newPasswordObj();

	}
	
	@Test(priority=3)
	public void checkTeamURL() throws Throwable {
		
		String testcasename = "TC_04_URL_Team";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(8, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the team page objects..");
		commonOR.teamPagelableVerify();
		commonOR.teamMemberObj();

	}
	
	
	@Test(priority=4)
	public void checkTeamRolesUrl() throws Throwable {
		
		String testcasename = "TC_05_URL_TeamRoles";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(9, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the team role page objects..");
		commonOR.teamRolesPagelableVerify();

	}
	
	
	@Test(priority=5)
	public void checkOutcomeConfigUrl() throws Throwable {
		
		String testcasename = "TC_06_URL_Outcome_Config";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(10, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the outcome config page objects..");
		commonOR.outComeConfigPagelableVerify();
		commonOR.srategicObjectivesObj();

	}
	
	@Test(priority=6)
	public void check_cat_li_sets_Url() throws Throwable {
		
		String testcasename = "TC_07_URL_check_cat_li_sets_Url";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(11, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the cat li sets page objects..");
		commonOR.Cat_li_SetsPagelableVerify();
		commonOR.recruitmentSystemObj();
		commonOR.crmSystemsObj();
		commonOR.eRPObj();
	}
	
	@Test(priority=7)
	public void selection_Groups_Url() throws Throwable {
		
		String testcasename = "TC_08_URL_selection_Groups_Url";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(12, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the selection groups page objects..");
		commonOR.selection_Groups_coreRecruitment();
		commonOR.selection_Groups_onBoard();
		commonOR.selection_Groups_Recognition();
		commonOR.selection_Groups_trainAndDev();
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		endTest(result);
		extent.flush();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
