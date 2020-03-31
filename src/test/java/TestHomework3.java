import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomework3 {

    @Test
    public void test() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Drivers\\ChromeDrivers\\chromedriver 80.0.3987.106.exe");

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
//        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.partialLinkText("Sign")).click();
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[title^=View")).click();
//        driver.findElement(By.cssSelector("a[title$=cart")).click();
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[starts-with(@title,'View')]")).click();
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[text()='Women']")).click();
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}


