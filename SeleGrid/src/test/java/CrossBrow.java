
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class CrossBrow {

    @Test
    public void testing() throws MalformedURLException {
        //Define Desired cap

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.27:4444/wd/hub"), cap);
        driver.get("http://whiteboxqa.com/");
        System.out.println(driver.getTitle());

    }

    @Test
    public void Screens() throws MalformedURLException {


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("firefox");
        cap.setPlatform(Platform.WINDOWS);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.27:4444/wd/hub"), cap);
        driver.get("http://whiteboxqa.com/index.php");
        driver.manage().window().maximize();
        File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try {

                FileHandler.copy(screen, new File("C:\\Users\\Sampath Velupula\\IdeaProjects\\SeleGrid\\" +
                        "src\\main\\resources\\screenshot\\photo.png"));
            }
            catch (IOException e){
                e.printStackTrace();

            }
            driver.close();
        }
    }
