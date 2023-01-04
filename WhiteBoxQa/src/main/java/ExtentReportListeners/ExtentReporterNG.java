package ExtentReportListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.HashMap;
import java.util.Map;

public class ExtentReporterNG {
    private static ExtentReports extent=new ExtentReports();
    static Map<Integer, ExtentTest>extentTestMap=new HashMap<>();
    static{
        extent.setSystemInfo("os",System.getProperty("os.name"));
        extent.setSystemInfo("os version",System.getProperty("os.version"));
    }
    public synchronized static ExtentReports getExtentReports(){


        //this method helps in configuring the report(name of the report,title,author, where to create report)
        String path = System.getProperty("C:\\Users\\Sampath Velupula\\IdeaProjects\\WhiteBoxQa\\src\\Reports\\extent.html");   //location for the ExtentReport
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);    //creating object for ExtentSparkReporter
        reporter.config().setReportName("Web Automation results");    //we can configure ExtentReport page using reporter.config()method
        reporter.config().setDocumentTitle("Test Results");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Sampath Velupula");
        return extent;

    }
    public static synchronized ExtentTest getTest(){
        return extentTestMap.get((int) Thread.currentThread().getId());
    }
    public static synchronized ExtentTest startTest(String testName,String desc){
        ExtentTest test= getExtentReports().createTest(testName,desc);
        extentTestMap.put((int) Thread.currentThread().getId(),test);
        return test;
    }
}

