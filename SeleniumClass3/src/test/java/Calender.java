import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calender {
    static WebDriver driver;
    @Test
    public void calen(){
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
         driver.get("https://nxtgenaiacademy.com/demo-site/");
         driver.findElement(By.id("vfb-18")).click();
         new WebDriverWait(driver,5)
                 .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
    }
}
