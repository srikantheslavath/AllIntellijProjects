import com.sun.jdi.PathSearchingVirtualMachine;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class demo extends BaseClass{
    public static void main(String[] args) throws MalformedURLException {
        Capabilities();
        AndroidDriver<AndroidElement>driver =Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("")).click();
    }
}
