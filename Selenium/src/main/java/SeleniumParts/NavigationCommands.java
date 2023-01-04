package SeleniumParts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {
    public static void main(String[] args) {
        String driverExecutablePath = "C:\\Users\\Sampath Velupula\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecutablePath);
        // Create a new instance of the FireFox driver
        WebDriver driver = new ChromeDriver();


        String appUrl = "https://www.ebay.com/";
        driver.get(appUrl);

        // Click on Registration link
        driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();

        // Go back to Home Page
        driver.navigate().back();

        // Go forward to Registration page
        driver.navigate().forward();

        // Go back to Home page
        driver.navigate().to(appUrl);

        // Refresh browser
        driver.navigate().refresh();

        // Close browser
        driver.close();
    }
}

