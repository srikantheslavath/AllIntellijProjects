package org.BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static Properties prop;

    public BaseTest() {
        try {
            prop = new Properties();
            FileInputStream in = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/ConfigPackage/Config.Properties");
            prop.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void init() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
        "MyFirstAutomation\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
    }

}
