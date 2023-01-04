import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot {
    @Test
    public void Screens() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://whiteboxqa.com/index.php");
        driver.manage().window().maximize();
        File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screen, new File("C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
                    "SeleniumClass3\\src\\main\\resources\\Screenshot\\demo.png"));
        }
        catch (IOException e){
            e.printStackTrace();

        }
        driver.close();
    }
    @Test
    public  void hardassert(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://whiteboxqa.com/index.php");
        WebElement logo = driver.findElement(By.id("logo"));
        Assert.assertEquals(true,logo.isDisplayed());
    }
}
