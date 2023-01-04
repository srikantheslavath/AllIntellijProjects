package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver=null;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("browser is opened");
        WebDriverManager.chromedriver().setup();

        // create a driver object for Chrome browser
        driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/");
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("user enters username and pass")
    public void user_enters_username_and_password() {

        driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("srikantheslavath");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Innovapath");




    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is in home page ");
        driver.getPageSource().contains("LogOut");
        driver.close();

    }
}
