package org.BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.UtilityPackage.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

   public static WebDriver driver;
   public static Properties prop;

    public BaseClass() {
        try {
            prop = new Properties();

            FileInputStream in = new FileInputStream("C:\\Users\\Sampath Velupula\\eclipse-workspace\\AmazonAutomation\\"
                    + "src\\main\\java\\ConfigPackage\\Config.properties");
            prop.load(in);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void initialization() {

        String browserName=prop.getProperty("browser");

        WebDriverManager.chromedriver().setup();

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver.","C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
                    "AmazonAutomation2\\Browsers\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browserName.equals("firefox")){
            System.setProperty("webdriver.chromedriver.","C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
                    "AmazonAutomation2\\Browsers\\gecko.exe");
            driver=new FirefoxDriver();

        }
driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }

}

