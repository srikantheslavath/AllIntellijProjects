import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts {
@Test
    public void handlealerts(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().window().maximize();
        //simple alert

    driver.findElement(By.xpath("//button[@name='alertbox']")).click();
    Alert SimpleAlert = driver.switchTo().alert();
    SimpleAlert.accept();


    WebElement element = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",element);
    Alert promptalert = driver.switchTo().alert();
    promptalert.sendKeys("srikanth");
    promptalert.accept();

    }
}
