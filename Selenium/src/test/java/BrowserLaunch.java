import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserLaunch {
@Test
    public void SeleniumLaunch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
                "Selenium\\src\\main\\resources\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        String title= driver.getTitle();
    System.out.println(title);
    String current =driver.getCurrentUrl();
    System.out.println(current);
    driver.navigate().to("https://www.facebook.com/");
   /* String pages =driver.getPageSource();
    System.out.println(pages);*/
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.navigate().refresh();



    }
}
