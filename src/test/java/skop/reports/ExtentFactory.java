package skop.reports;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import skop.utils.ExcelUtils;

public class ExtentFactory extends ExcelUtils {
	public static ExtentReports extent;
	public static ExtentTest loggers;
	public static ExtentHtmlReporter htmlReporter;

	public static ExtentHtmlReporter getHtmlReporter() {
		String reportPath = System.getProperty("user.dir")+"/src/test/resources/reports/SkopReports.html";
		htmlReporter = new ExtentHtmlReporter(reportPath);
		htmlReporter.config().setDocumentTitle("TrailLink Automation Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setReportName("TrailLink Automation Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		return htmlReporter;
	}

	public static ExtentReports getExtent() {
		if (extent != null)
			return extent; // avoid creating new instance of html file
		extent = new ExtentReports();
		extent.attachReporter(getHtmlReporter());
		return extent;
	}

	public static ExtentTest startTest(String testcaseName) {
		loggers = extent.createTest(testcaseName);
		return loggers;
	}

	public static void endTest(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			loggers.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test is FAILED", ExtentColor.RED));
			loggers.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			loggers.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test is PASSED", ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.SKIP) {
			loggers.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test is SKIPPED", ExtentColor.GREY));
			loggers.skip(result.getThrowable());
		}
	}

	public static void logSteps(ExtentTest loggers, String teststep) {
		loggers.log(Status.INFO, teststep);
	}

}
