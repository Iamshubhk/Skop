package skop.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skop.testbase.TestBase;

public class CommonObjectsRepo extends TestBase {
	
	public WebDriver driver;
	public static final String CONTAINS="CONTAINS";
	public static final String STARTS_WITH="STARTS_WITH";
	public static final String NOT_CONTAINS="NOT_CONTAINS";
	public static final String EQUALS="EQUALS";
	public static final String NOT_EQUALS="NOT_EQUALS";
	
	public static final String expectedHomePagelabel="1.PROJECT PREPARATION AND SET-UP In Progress : 12 / 15";
	
	public static final String expectedMyprofileHeading="MY PROFILE & SETTINGS";
	public static final String expectedFirstNamelabel="First Name:";
	
	public static final String changePasswordHeading="CHANGE PASSWORD";
	public static final String newPasswordlabel="New Password:";
	
	public static final String teampageHeading="About your team";
	public static final String teamMemberSection="Team members";
	
	public static final String teamRolespageHeading="Scoping Recruitment Systems";
	
	public static final String outConfigpageHeading="Set Project Objectives";
	public static final String outConfig_srategicObjectives="Strategic Objectives";
	
	
	public static final String CAT_LI_pageHeading="Scoping Recruitment Systems";
	public static final String CAT_LI_recruitmentSystems="Recruitment systems";
	
	public static final String groupSelection_TrainingAndDev="Training & Development";
	public static final String groupSelection_Recognition="Recognition";
	public static final String groupSelection_coreRecruitment="Core Recruitment";
	public static final String groupSelection_OnBoarding="On Boarding";
	
	public static final String expectedScopingSystem_Heading="About your team";
	public static final String expected_payroll="Payroll";
	public static final String expected_executive_Search="Executive Search";
	
	public static final String expected_CandidateManagement="Candidate Management";
	public static final String expected_Client_portal="Client portal";
	
	public static final String expected_Sunburst_Heading="SUNBURST FUNCTIONALITY VISUALISATION";
	public static final String expected_PeerInsights="PEER INSIGHTS";
	public static final String expected_YourProject="YOUR PROJECT";
	
	public static final String expected_Treemap_Heading="SCOPE AND FEATURE TREEMAP EXPLORER";
	public static final String expected_Peerdata="Peer data";
	public static final String expected_ProjectData="User/project data";
	
	
	public static final String expected_Benefits_Analyser="Benefits Analyser";
	public static final String expected_Category="CATEGORY";
	public static final String expected_feature="FEATURE";
	
	public static final String expected_Peer_intel="Peer intel: Feature Popularity";
	public static final String expected_MetricAndfeature="METRIC & FEATURE DESCRIPTION";
	
	public static final String expected_SCOPE_EDITOR="SCOPE EDITOR";
	public static final String expected_YOUR_SETTINGS="YOUR SETTINGS";
	
	//HOME PAGE OBJECTS
	
	@FindBy(xpath="//h3[contains(text(),'PROJECT PREPARATION AND SET-UP')]")
	private WebElement HOMEOBJECT;
	
	
	//MY PROFILE OBJECTS
	
	@FindBy(xpath="//div[contains(text(),'MY PROFILE & SETTINGS')]")
	private WebElement MYPROFILEHEADING;
	
	@FindBy(xpath="//label[contains(text(),'First Name:')]")
	private WebElement FIRSTNAMELABEL;
	
	//CHANGE PASSWORD OBJECTS
	
	@FindBy(xpath="//div[contains(text(),'CHANGE PASSWORD')]")
	private WebElement CHAGNEPASSWORDHEADING;
	
	@FindBy(xpath="//label[contains(text(),'New Password:')]")
	private WebElement NEWPASSWORDLABEL;
	
	
	//TEAM PAGE OBJECTS
	
	@FindBy(xpath="//div[contains(text(),'About your team')]")
	private WebElement TEAMPAGEHEADING;
	
	@FindBy(xpath="//h3[contains(text(),'Team members')]")
	private WebElement TEAMMEMBERS;
	
	
	//TEAM ROLES PAGE OBJECTS
	
	@FindBy(xpath="//div[contains(text(),'Scoping Recruitment Systems')]")
	private WebElement TEAMROLESPAGEHEADING;
	
	
	//OUTCOME CONFIG PAGE OBJECTS
	
	@FindBy(xpath="//div[contains(text(),'Set Project Objectives')]")
	private WebElement OUTCOMECONFIGPAGEHEADING;
	
	
	@FindBy(xpath="//h3[contains(text(),'Strategic Objectives')]")
	private WebElement STRATEGICOBJECTIVES;
	
	//Select Cat/LI Sets page objects
	
	@FindBy(xpath="//div[contains(text(),'Scoping Recruitment Systems')]")
	private WebElement CAT_LI_PAGEHEADING;
	
	@FindBy(xpath="//h3[contains(text(),'Recruitment systems')]")
	private WebElement 	ERP;
	
	@FindBy(xpath="//h3[contains(text(),'Recruitment systems')]")
	private WebElement 	RECRUITMENTSYSTEMS;
	
	@FindBy(xpath="//h3[contains(text(),'CRM Systems')]")
	private WebElement CRMSYSTEMS;
	
	@FindBy(xpath="//h3[contains(text(),'Core System')]")
	private WebElement CORESYSTEMS;
	
	
	//Selection groups
	
	@FindBy(xpath="//h3[contains(text(),'Training & Development')]")
	private WebElement 	TRARINGANDDEVLOPMENT;
	
	@FindBy(xpath="//h3[contains(text(),'Core Recruitment')]")
	private WebElement 	CORERECRUITMENT;
	
	@FindBy(xpath="//h3[contains(text(),'Recognition')]")
	private WebElement RECOGNITION;
	
	@FindBy(xpath="//h3[contains(text(),'On Boarding')]")
	private WebElement ONBOARDING;
	
	//Scoping system objects
	
	@FindBy(xpath="//div[contains(text(),'Scoping Recruitment Systems')]")
	private WebElement SCOPINGRECRITMENTHEADING;
	
	@FindBy(xpath="//h3[contains(text(),'Payroll')]")
	private WebElement 	PAYROLL;
	
	@FindBy(xpath="//h3[contains(text(),'Executive Search')]")
	private WebElement 	EXECUTIVESEARCH;
	
	//Candidate Management objects
	
	@FindBy(xpath="//h3[contains(text(),'Candidate Management')]")
	private WebElement 	CANDIDATEMANAGEMENT;
	
	@FindBy(xpath="//h3[contains(text(),'Client portal')]")
	private WebElement 	CLIENTPORTAL;
	
	//Sunburst objects
	
	@FindBy(xpath="//div[contains(text(),'SUNBURST FUNCTIONALITY VISUALISATION')]")
	private WebElement 	SURNHEADING;
	
	@FindBy(xpath="//h4[contains(text(),'PEER INSIGHTS')]")
	private WebElement 	PEERINSIGHTS;
	
	
	@FindBy(xpath="//h4[contains(text(),'YOUR PROJECT')]")
	private WebElement 	YOURPROJECT;
	
	
	//TREEMAP objects
	
	@FindBy(xpath="//div[contains(text(),'SCOPE AND FEATURE TREEMAP EXPLORER')]")
	private WebElement 	TREEMAPHEADING;
	
	@FindBy(xpath="//td[contains(text(),'Peer data')]")
	private WebElement 	PEERDATA;
	
	@FindBy(xpath="//td[contains(text(),'User/project data')]")
	private WebElement 	PROJECTDATA;
	
	
	//Benefits objects
	
	@FindBy(xpath="//div[contains(text(),'Benefits Analyser')]")
	private WebElement 	BENEFITSANALYSERHEADING;
	
	@FindBy(xpath="//th[contains(text(),'CATEGORY')]")
	private WebElement 	CATEGORY;
	
	@FindBy(xpath="//th[contains(text(),'FEATURE')]")
	private WebElement 	FEATURE;
	
	
	//Scope Analysis objects
	@FindBy(xpath="//div[contains(text(),'Peer intel: Feature Popularity')]")
	private WebElement 	PEERINTEL;
	
	@FindBy(xpath="//td[contains(text(),'METRIC & FEATURE DESCRIPTION')]")
	private WebElement 	METRICFEATURE;
	
	
	//SCOPE EDITOR objects
	
	@FindBy(xpath="//div[contains(text(),'SCOPE EDITOR')]")
	private WebElement 	SCOPEEDITOR;
	
	@FindBy(xpath="//h4[contains(text(),'YOUR SETTINGS')]")
	private WebElement 	YOURSETTINGS;
	
	
	//###############################################################################################################################
	public CommonObjectsRepo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//HOME PAGE OBJECTS
	public void homePagelableVerify(){
		checkObjectIsDisplayed(HOMEOBJECT);
		verifyText(HOMEOBJECT, expectedHomePagelabel,CONTAINS);
	}
	
	
	//MY PROFILE OBJECTS
	public void myProfilePagelableVerify(){
		checkObjectIsDisplayed(MYPROFILEHEADING);
		assertTrue(verifyText(MYPROFILEHEADING, expectedMyprofileHeading,CONTAINS));	
	}
	
	public void myProfilefirstNameObj(){
		checkObjectIsDisplayed(FIRSTNAMELABEL);
		assertTrue(verifyText(FIRSTNAMELABEL, expectedFirstNamelabel,CONTAINS));	
	}
	
	//CHANGE PASSWORD OBJECTS
	public void chagnePasswordPagelableVerify(){
		checkObjectIsDisplayed(CHAGNEPASSWORDHEADING);
		assertTrue(verifyText(CHAGNEPASSWORDHEADING, changePasswordHeading,CONTAINS));	
	}
	
	public void newPasswordObj(){
		checkObjectIsDisplayed(NEWPASSWORDLABEL);
		assertTrue(verifyText(NEWPASSWORDLABEL, newPasswordlabel,CONTAINS));	
	}
	
	//TEAM PAGE OBJECTS
	public void teamPagelableVerify(){
		checkObjectIsDisplayed(TEAMPAGEHEADING);
		assertTrue(verifyText(TEAMPAGEHEADING, teampageHeading,CONTAINS));	
	}
	
	public void teamMemberObj(){
		checkObjectIsDisplayed(TEAMMEMBERS);
		assertTrue(verifyText(TEAMMEMBERS, teamMemberSection,CONTAINS));	
	}
		
	//TEAM ROLES PAGE OBJECTS
	public void teamRolesPagelableVerify(){
		checkObjectIsDisplayed(TEAMROLESPAGEHEADING);
		assertTrue(verifyText(TEAMROLESPAGEHEADING, teamRolespageHeading,CONTAINS));	
	}
	
	//OUTCOME CONFIG PAGE OBJECTS
	public void outComeConfigPagelableVerify(){
		checkObjectIsDisplayed(OUTCOMECONFIGPAGEHEADING);
		assertTrue(verifyText(OUTCOMECONFIGPAGEHEADING, outConfigpageHeading,CONTAINS));	
	}
	
	public void srategicObjectivesObj(){
		checkObjectIsDisplayed(STRATEGICOBJECTIVES);
		assertTrue(verifyText(STRATEGICOBJECTIVES, outConfig_srategicObjectives,CONTAINS));	
	}
	
	//OUTCOME CONFIG PAGE OBJECTS
	public void Cat_li_SetsPagelableVerify(){
		checkObjectIsDisplayed(CAT_LI_PAGEHEADING);
		assertTrue(verifyText(CAT_LI_PAGEHEADING, CAT_LI_pageHeading,CONTAINS));	
	}
	
	public void recruitmentSystemObj(){
		checkObjectIsDisplayed(RECRUITMENTSYSTEMS);
		assertTrue(verifyText(RECRUITMENTSYSTEMS, CAT_LI_recruitmentSystems,CONTAINS));	
	}
	
	public void crmSystemsObj(){
		checkObjectIsDisplayed(CRMSYSTEMS);	
	}
	
	public void eRPObj(){
		checkObjectIsDisplayed(ERP);
	}
	
	
	//SELECTION GROUPS PAGE OBJECTS
	public void selection_Groups_trainAndDev(){
		checkObjectIsDisplayed(TRARINGANDDEVLOPMENT);
		assertTrue(verifyText(TRARINGANDDEVLOPMENT, groupSelection_TrainingAndDev,CONTAINS));	
	}
	
	public void selection_Groups_coreRecruitment(){
		checkObjectIsDisplayed(CORERECRUITMENT);
		assertTrue(verifyText(CORERECRUITMENT, groupSelection_coreRecruitment,CONTAINS));	
	}
	
	public void selection_Groups_Recognition(){
		checkObjectIsDisplayed(RECOGNITION);
		assertTrue(verifyText(RECOGNITION, groupSelection_Recognition,CONTAINS));
	}
	
	public void selection_Groups_onBoard(){
		checkObjectIsDisplayed(ONBOARDING);
		assertTrue(verifyText(ONBOARDING, groupSelection_OnBoarding,CONTAINS));
	}
	
	//Scoping system objects
	
	
	public void scopeRecruitmentPagelableVerify(){
		checkObjectIsDisplayed(SCOPINGRECRITMENTHEADING);
		verifyText(SCOPINGRECRITMENTHEADING, expectedScopingSystem_Heading,CONTAINS);
	}
	
	public void payroll(){
		checkObjectIsDisplayed(PAYROLL);
		assertTrue(verifyText(PAYROLL, expected_payroll,CONTAINS));	
	}
	
	public void executiveearch(){
		checkObjectIsDisplayed(EXECUTIVESEARCH);
		assertTrue(verifyText(EXECUTIVESEARCH, expected_executive_Search,CONTAINS));	
	}
	
	//Candidate Management objects
		
	public void candidateManagement(){
		checkObjectIsDisplayed(CANDIDATEMANAGEMENT);
		assertTrue(verifyText(CANDIDATEMANAGEMENT, expected_CandidateManagement,CONTAINS));	
	}
	
	public void clientportal(){
		checkObjectIsDisplayed(CLIENTPORTAL);
		assertTrue(verifyText(CLIENTPORTAL, expected_Client_portal,CONTAINS));	
	}
	
	//Sunburst objects
	
	
	public void sunburstPagelableVerify(){
		checkObjectIsDisplayed(SURNHEADING);
		verifyText(SURNHEADING, expected_Sunburst_Heading,CONTAINS);
	}
	
	
	public void peerInsights(){
		checkObjectIsDisplayed(PEERINSIGHTS);
		assertTrue(verifyText(PEERINSIGHTS, expected_PeerInsights,CONTAINS));	
	}
	
	public void yourProject(){
		checkObjectIsDisplayed(YOURPROJECT);
		assertTrue(verifyText(YOURPROJECT, expected_YourProject,CONTAINS));	
	}
	
	//Treemap objects
	
	
	public void treeMapPagelableVerify(){
		checkObjectIsDisplayed(TREEMAPHEADING);
		verifyText(TREEMAPHEADING, expected_Treemap_Heading,CONTAINS);
	}
	
	
	public void peerData(){
		checkObjectIsDisplayed(PEERDATA);
		assertTrue(verifyText(PEERDATA, expected_Peerdata,CONTAINS));	
	}
	
	public void Projectdata(){
		checkObjectIsDisplayed(PROJECTDATA);
		assertTrue(verifyText(PROJECTDATA, expected_ProjectData,CONTAINS));	
	}
	
	
	//Benefit analyser objects
	
	
	public void benefitsAnalyserPagelableVerify(){
		checkObjectIsDisplayed(BENEFITSANALYSERHEADING);
		verifyText(BENEFITSANALYSERHEADING, expected_Benefits_Analyser,CONTAINS);
	}
	
	
	public void category(){
		checkObjectIsDisplayed(CATEGORY);
		assertTrue(verifyText(CATEGORY, expected_Category,CONTAINS));	
	}
	
	public void feature(){
		checkObjectIsDisplayed(FEATURE);
		assertTrue(verifyText(FEATURE, expected_feature,CONTAINS));	
	
	}
	
	//Scope Analysis objects
	
	public void metricFeature(){
		checkObjectIsDisplayed(METRICFEATURE);
		verifyText(METRICFEATURE, expected_MetricAndfeature,CONTAINS);
	}
	
	
	public void peerIntel(){
		checkObjectIsDisplayed(PEERINTEL);
		assertTrue(verifyText(PEERINTEL, expected_Peer_intel,CONTAINS));	
	}
	
	//SCOPE EDITOR objects
	
	
	public void scopEditorPagelableVerify(){
		checkObjectIsDisplayed(SCOPEEDITOR);
		verifyText(SCOPEEDITOR, expected_SCOPE_EDITOR,CONTAINS);
	}
	
	
	public void settings(){
		checkObjectIsDisplayed(YOURSETTINGS);
		assertTrue(verifyText(YOURSETTINGS, expected_YOUR_SETTINGS,CONTAINS));	
	}
}