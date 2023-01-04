import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandling {
@Test
    public void window(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();

        String mainWindow = driver.getWindowHandle();

        Set<String> a =driver.getWindowHandles();

    Iterator<String> i = a.iterator();

    //we will check if child window is present or not

    while(i.hasNext()) {
        String childwindow = i.next();
        if (!mainWindow.equalsIgnoreCase(childwindow)) {
            driver.switchTo().window(childwindow);
            driver.close();
        }
    }
        driver.switchTo().window(mainWindow);
        driver.quit();
    }

}

