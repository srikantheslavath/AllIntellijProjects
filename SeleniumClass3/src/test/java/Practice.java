import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice {
@Test
    public void click1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/draggableboxes/");
        Actions action = new Actions(driver);
      //  WebElement a= driver.findElement(By.xpath("//iframe[@src=\"data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"]"));
        //driver.switchTo().frame(a);

        WebElement from = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
   //     WebElement to = driver.findElement(By.xpath("//div[@id='trash']"));
       // action.dragAndDrop(from,to).perform();
    action.dragAndDropBy(from,100,200).build().perform();

        System.out.println("right click menu displayed");

    }
}
