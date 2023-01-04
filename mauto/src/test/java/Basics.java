import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{

    public static void main(String[] args) {
        capabilities();
        AndroidDriver<AndroidElement>driver=capabilities();
        driver.findElement()
    }
}
