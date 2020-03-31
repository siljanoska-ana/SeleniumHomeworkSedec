import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomework2 {
    @Test
    public void name() {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Drivers\\ChromeDrivers\\chromedriver 80.0.3987.16.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.className("login")).click();
        driver.findElement(By.name("SubmitCreate")).click();
        driver.findElement(By.id("contact-link")).click();
        driver.findElement(By.tagName("img")).click();
//        driver.findElement(By.className("logo")).click();
        driver.quit();

    }
}
