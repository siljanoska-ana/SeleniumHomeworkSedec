import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class SignInForm {
    @Test
    public void signIn() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Drivers\\ChromeDrivers\\chromedriver 80.0.3987.16.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds (30));
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in"))).click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create"))).sendKeys("username"+ randomInt +"@yahoo.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender2"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname"))).sendKeys("Ana");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname"))).sendKeys("Siljanoska");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd"))).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"days\"]/option[30]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"months\"]/option[12]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"years\"]/option[43]"))).click();
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"optin\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#company"))).sendKeys("ABCDE");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#address1"))).sendKeys("Orce Nikolov");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#address2"))).sendKeys("204");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#city"))).sendKeys("Skopje");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_state\"]/option[7]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#postcode"))).sendKeys("11222");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea#other"))).sendKeys("Personal contact only");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#phone"))).sendKeys("38922354235");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#phone_mobile"))).sendKeys("38970258258");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#alias"))).sendKeys("Ilindenska 78");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitAccount"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.account"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i.icon-heart"))).click();
        driver.quit();
    }
}
