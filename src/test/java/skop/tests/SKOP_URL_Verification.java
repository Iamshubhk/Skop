package skop.tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
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
	public String testcasename;
	

	@BeforeSuite
	public void setupAndLogin() throws Throwable {
		testcasename = "SKOP_Login";
		init();
		Login logobj = new Login(driver);
		logobj.doLogin();
		extent = getExtent();
		loggers = startTest(testcasename);
	}
	
	

	@Test(priority=0)
	public void CheckHomeURL() throws Throwable {
		testcasename = "TC_01_URL_Home";
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
		testcasename = "TC_02_URL_My_Profile";
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
		
		testcasename = "TC_03_URL_ChangePassword";
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
		
		testcasename = "TC_04_URL_Team";
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
		
		testcasename = "TC_05_URL_TeamRoles";
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
		
		testcasename = "TC_06_URL_Outcome_Config";
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
		
		testcasename = "TC_07_URL_check_cat_li_sets";
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
		
		testcasename = "TC_08_URL_selection_Groups";
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
	
	
	
	@Test(priority=8)
	public void scope_Recruitment_Url() throws Throwable {
		
		testcasename = "TC_09_Scope_Recruitment";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(13, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the sope recruitment page objects..");
		commonOR.scopeRecruitmentPagelableVerify();
		commonOR.payroll();
		commonOR.executiveearch();
		
	}
	
	
	@Test(priority=9)
	public void scope_Quantify_Url() throws Throwable {
		
		testcasename = "TC_10_URL_Quantify";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(14, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the scope quantify page objects..");
		commonOR.candidateManagement();
		commonOR.clientportal();
		commonOR.executiveearch();
		
	}
	
	
	@Test(priority=10)
	public void sunburstPage_Url() throws Throwable {
		
		testcasename = "TC_11_URL_Sunburst";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(15, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the sunburst page objects..");
		commonOR.sunburstPagelableVerify();
		commonOR.peerInsights();
		commonOR.yourProject();
		
	}
	
	@Test(priority=11)
	public void treeMapPage_Url() throws Throwable {
		
		testcasename = "TC_12_URL_Treemap";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(16, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the sope recruitment page objects..");
		commonOR.treeMapPagelableVerify();
		commonOR.peerData();
		commonOR.Projectdata();
		
	}
	
	//Benefit analyser objects
	
	@Test(priority=12)
	public void benefitAnalyser_Url() throws Throwable {
		
		testcasename = "TC_13_URL_BenefitAnalyser";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(17, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the Benefit Analyser page objects..");
		commonOR.benefitsAnalyserPagelableVerify();
		commonOR.category();
		commonOR.feature();
		
	}
	
	
	@Test(priority=13)
	public void scopeAnalysis_Url() throws Throwable {
		
		testcasename = "TC_14_URL_ScopeAnalysis";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(18, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the scope analysis page objects..");
		commonOR.metricFeature();
		commonOR.peerIntel();
		
		
	}
	
	@Test(priority=14)
	public void scopeEditor_Url() throws Throwable {
		
		testcasename = "TC_15_URL_SCOPE_EDITOR";
		extent = getExtent();
		loggers = startTest(testcasename);
		
		CommonObjectsRepo commonOR = new CommonObjectsRepo(driver);
		String endPoint = getEndPoint(19, 3);
		URL url = urlbuilder(endPoint);

		loggers.log(Status.INFO, "URL to be navigate: " + url);
		NavigateTo(url);

		String response = isLinkBroken(url);
		loggers.log(Status.INFO, "URL response is: " + response);

		loggers.log(Status.INFO, "Verifying the scope editor page objects..");
		commonOR.scopEditorPagelableVerify();
		commonOR.settings();
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		try {
			endTest(driver,testcasename,result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent.flush();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
