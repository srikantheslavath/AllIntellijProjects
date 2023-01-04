package BaseClassPackage;

import UtilsPackage.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
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
                        FileInputStream in = new FileInputStream(
                                "C:\\Users\\Sampath Velupula\\IdeaProjects\\DatadrivenFramework" +
                                        "\\src\\main\\java\\ConfigPropertiesPackage\\Config.Properties");
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
                                "C:\\Users\\Sampath Velupula\\IdeaProjects\\DatadrivenFramework\\" +
                                        "src\\main\\resources\\Drivers\\chrome105.exe");
                        // create a driver object for Chrome browser
                        driver = new ChromeDriver();
                } else if (browserName.equals("firefox")) {
                        System.setProperty("webdriver.gecko.driver",
                                "src/main/resources/Drivers/geckodriver.exe");
                        driver = new FirefoxDriver();
                }


                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
                driver.get(prop.getProperty("url"));


        }
}
