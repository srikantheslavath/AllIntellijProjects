package com.BasePackage;

import com.UtilityPackage.UtilityClass;
import com.UtilityPackage.WebEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePageClass {

    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;

    public BasePageClass() {
        try {
            prop = new Properties();
            FileInputStream in = new FileInputStream(
                    "C:\\Users\\Sampath Velupula\\IdeaProjects\\HybridFrameworkCRM\\src\\" +
                            "main\\java\\com\\configPropertiesPackage\\Config.Properties");
            prop.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        WebDriverManager.chromedriver().setup();
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Sampath Velupula\\IdeaProjects\\HybridFrameworkCRM\\BrowserDrivers\\chromedriver.exe");
            // create a driver object for Chrome browser
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\Sampath Velupula\\IdeaProjects\\HybridFrameworkCRM\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        e_driver = new EventFiringWebDriver(driver);  //create an object for EventFiringWEbDriver
        eventListener = new WebEventListener(); //create object of EventListenerHandler to register it with EventFiringWebDriver
        e_driver.register(eventListener);
        driver = e_driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }
}