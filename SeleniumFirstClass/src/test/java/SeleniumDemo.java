import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class SeleniumDemo {

@Test
    public void Test1(){
    WebDriver driver;
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
               "SeleniumFirstClass\\src\\main\\resources\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://whiteboxqa.com/");
        driver.manage().window().maximize();
      driver.findElement(By.id("loginButton")).click();
      driver.findElement(By.id("loginbyfb")).isEnabled();
    driver.findElement(By.xpath("//*[@id='username']")).sendKeys("srikantheslavath");
      driver.findElement(By.name("pwd")).sendKeys("Innovapath");
      driver.findElement(By.id("login")).click();












    }
}
