import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class BaseClass {

    AndroidDriver<AndroidElement> driver;

    DesiredCapabilities cap =new DesiredCapabilities();
    File appdir =new File("src");
    File app =new File(appdir,"ApiDemos-debug (2).apk");
cap.setCapability(MobileCapabilityType.DEVICENAME,"vikasemulator");
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
cap.setCapability(MobileCapabilityType.APP,app.getAbsolutepath);
driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
}
