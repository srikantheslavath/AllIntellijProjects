import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ALerts {
@Test
    public void simplealert() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
WebElement element =driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
JavascriptExecutor js= ((JavascriptExecutor) driver);
js.executeScript("arguments[0].click();", element);
    Alert prompt=driver.switchTo().alert();
prompt.sendKeys("srikanth");
prompt.accept();

    }
}