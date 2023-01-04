import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.AddRotatable;
import org.testng.annotations.Test;

import javax.swing.*;

public class RightClickAndDoubleClick {
@Test
    public void right(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       /* driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement a = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        action.contextClick(a).perform();*/
    /*driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
    driver.manage().window().maximize();
    Actions b = new Actions(driver);
    WebElement button = driver.findElement(By.xpath("//input[@type='button']"));
    b.doubleClick(button).perform();
    System.out.println("pink colour is displaced "); */

    //drag and drop
    /*driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
    driver.manage().window().maximize();
    Actions actions = new Actions(driver);
    WebElement iframe = driver.findElement(By.xpath("//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==']"));
    driver.switchTo().frame(iframe);
    WebElement from = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
    WebElement to = driver.findElement(By.xpath("//div[@id='trash']"));
    actions.dragAndDrop(from,to).perform();*/

   /* driver.get("https://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");
    driver.manage().window().maximize();
    Actions action1 = new Actions(driver);
    WebElement iframe = driver.findElement(By.xpath("//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==']"));
    driver.switchTo().frame(iframe);
    WebElement recording = driver.findElement(By.id("Multiple Selection"));
    action1.moveToElement(recording).perform();

    WebElement six = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
    action1.moveToElement(six).perform(); */

    //slide

    /*driver.get("https://www.globalsqa.com/demo-site/sliders/");
    driver.manage().window().maximize();
    Actions action2 = new Actions(driver);
    WebElement colourslider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
    action2.moveToElement(colourslider,30,0).perform();
    colourslider.click(); */

    driver.get("https://nxtgenaiacademy.com/demo-site/");
    driver.manage().window().maximize();
    Actions builder = new Actions(driver);
    WebElement address = driver.findElement(By.id("vfb-13-address"));
 address.sendKeys("h.no 2-62/3 hyderabad");

    builder.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
    builder.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
   address.sendKeys(Keys.TAB);


//PASTE THE ADRESS

   WebElement streetadress = driver.findElement(By.id("vfb-13-address-2"));
builder.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

    }
}
