import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        File appDir = new File("src");
        File f = new File(appDir,"ApiDemos-debug (1).apk");
        if(device.equals("emulator")) {
         //   cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vikasEmulator");
        }
        else if (device.equals("real"))
        {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        cap.setCapability(MobileCapabilityType.APP,appDir.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

              AndroidDriver<AndroidElement>  driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }
}
