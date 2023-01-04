package SeleniumParts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath Velupula\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
//signin
        WebElement signin = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a"));
        signin.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"userid\"]"));
        email.sendKeys("srikanthinnovapath1@gmail.com");
        WebElement conti = driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]"));
        conti.click();
        WebElement pswd = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        pswd.sendKeys("Eslavath@66");
        WebElement signinn = driver.findElement(By.xpath("//*[@id=\"sgnBt\"]"));
        signinn.click();


    }
}
