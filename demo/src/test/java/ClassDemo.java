import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ClassDemo {
    @Test

    public void octgrid() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        ChromeOptions option = new ChromeOptions();
        option.merge(cap);
        String huburl ="http://192.168.86.203:4444/wd/hub";
        WebDriver driver= new RemoteWebDriver(new URL(huburl),option);
        driver.get("http://whiteboxqa.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


}
