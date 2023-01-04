import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
@Test
    public void sele() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.86.243:4444/wd/hub"),cap);
        driver.get("http://whiteboxqa.com/");
        System.out.println(driver.getTitle());
    }
@Test
    public void selenium() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName("firefox");
    capabilities.setPlatform(Platform.WINDOWS);
    FirefoxOptions options =new FirefoxOptions();
    options.merge(capabilities);
    WebDriver driver = new RemoteWebDriver(new URL("http://192.168.86.243:4444/wd/hub"),capabilities);
    driver.get("http://whiteboxqa.com/");
    driver.findElement(By.id("loginButton")).click();
    }
}
