import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Locators extends BaseClass{
    public static void main(String[] args) throws MalformedURLException {
      capabilities();
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//"));
        TouchActions t = new TouchActions(driver);

    }
}
