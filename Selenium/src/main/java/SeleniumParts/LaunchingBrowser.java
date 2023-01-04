package SeleniumParts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LaunchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath Velupula\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        int titleLength = driver.getTitle().length();
        System.out.println("lenght of the title is :"+titleLength);
        String title = driver.getTitle();
        System.out.println("the title of web page :" + title);
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actual ur is :"+actualUrl);


        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Total length of the Page Source is : " + pageSourceLength);

        WebElement uname = driver.findElement(By.xpath("//input[@id =\"email\"]"));
        WebElement pswd = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        WebElement logbtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));

        uname.sendKeys("srikanth143.tornando@gmail.com");
        pswd.sendKeys("Eslavath@4455");
        logbtn.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            WebElement logoutBtn = driver.findElement(By.xpath(""));

            if (logbtn.isDisplayed()) {
                logoutBtn.click();
                System.out.println("logout succesful");
            }
        }
        catch(Exception e){
                System.out.println("incorrect login details");
            }
        driver.quit();
        }
    }



