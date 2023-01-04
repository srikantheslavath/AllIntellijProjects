import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckBoxes {
    @Test
    public void Test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
                "SeleniumFirstClass\\src\\main\\resources\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.manage().window().maximize();
        driver.findElement(By.id("vfb-5")).sendKeys("Srikanth");
        driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("Eslavath");
        driver.findElement(By.xpath("//input[@id='vfb-8-1']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@name='vfb-13[country]']")));
        if (select.isMultiple()) {
            select.selectByIndex(4);
            select.selectByValue("india");

            System.out.println(  select.getOptions());

        }
        WebElement date=driver.findElement(By.xpath("//input[@id='vfb-18']"));
        date.click();


    }
}
