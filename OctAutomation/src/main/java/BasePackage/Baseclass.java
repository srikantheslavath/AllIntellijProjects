package BasePackage;

import UtilityPackage.Utilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Baseclass { //parent class
    public static WebDriver driver;
    public static Properties prop;

    public static Logger loger;


    public Baseclass() { //constructor
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Sampath Velupula\\IdeaProjects\\OctAutomation\\src\\main\\java\\ConfigPackage\\Config.Properties");
            prop.load(fis);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
        public void Initialization(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


            driver.manage().window().maximize();


            driver.get(prop.getProperty("url"));
            loger.info("url is opened");

            loger = Logger.getLogger("October Automation Framework");
            PropertyConfigurator.configure("C:\\Users\\Sampath Velupula\\IdeaProjects\\OctAutomation\\src\\main\\resources\\Log4J.Properties");

            driver.manage().timeouts().pageLoadTimeout(Utilis.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Utilis.IMPLICIT_WAIT,TimeUnit.SECONDS);

        }
    }

