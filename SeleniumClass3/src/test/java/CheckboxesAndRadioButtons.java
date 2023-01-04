import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckboxesAndRadioButtons {
@Test
    public void Checkbox(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.manage().window().maximize();

        driver.findElement(By.id("vfb-5")).sendKeys("Srikanth");
        driver.findElement(By.id("vfb-7")).sendKeys("Eslavath");
        driver.findElement(By.xpath("//input[@value='TestNG']")).click();
  driver.findElement(By.id("vfb-20-0")).click();
  driver.findElement(By.id("vfb-8-1")).click();
  driver.findElement(By.id("vfb-13-zip")).sendKeys("Hyderabad");
  Select a= new Select(driver.findElement(By.id("vfb-13-country")));
    List<WebElement> option =a.getOptions();
    for(WebElement z:option){
        System.out.println(z.getText());
 }
    driver.findElement(By.id("vfb-14")).sendKeys("srikantheslavath6@gmail.com");
    }
}


