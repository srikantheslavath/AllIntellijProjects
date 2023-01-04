import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {
@Test
    public void FindElementsTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/");
        driver.findElement(By.id("loginButton")).click();
    List<WebElement> a =driver.findElements(By.tagName("input"));
    if(a.size()!=0){
        System.out.println(a.size() +"elements found");
    }
    for(WebElement b :a){
        System.out.println(b.getAttribute("placeholder"));
    }
    }
}
