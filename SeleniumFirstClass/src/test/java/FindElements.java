import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {

    @Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath Velupula\\IdeaProjects\\" +
                "SeleniumFirstClass\\src\\main\\resources\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://whiteboxqa.com/login.php");
        List<WebElement> inputele = driver.findElements(By.tagName("input"));

        if (inputele.size() != 0) {
            System.out.println(inputele.size() + " Elements found by TagName as input \n");

            for (WebElement inputElement : inputele) {
                System.out.println(inputElement.getAttribute("placeholder"));
            }
        }
    }
}
