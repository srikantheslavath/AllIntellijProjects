import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class Base {
  public static AndroidDriver<AndroidElement>driver;
    static DesiredCapabilities cap = new DesiredCapabilities();

    public static AndroidDriver<AndroidElement> capabilities(){


    File appDir =new File("C:/Users/Sampath Velupula/IdeaProjects/mauto/" +
            "src/main/resources/Apkfiles/ApiDemos-debug.apk");
    File app=new File(appDir,"ApiDemos-debug.apk");
     cap.setCapability(MobileCapabilityType.DEVICE_NAME,"FirstAvd");
     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
     cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
     driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);3


        return driver;
    }
}
