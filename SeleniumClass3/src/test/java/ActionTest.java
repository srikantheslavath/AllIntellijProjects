import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionTest {


@Test
    public void actionsdemo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.manage().window().maximize();
    WebElement a = driver.findElement(By.id("vfb-23"));
    a.sendKeys("srikanth");
        Actions actions = new Actions(driver);
        actions.keyDown(a, Keys.SHIFT);
        actions.sendKeys("srikanth");
        actions.keyUp(Keys.SHIFT);
        Action action = actions.build();
        action.perform();






    }
}
