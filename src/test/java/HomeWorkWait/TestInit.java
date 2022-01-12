package HomeWorkWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public WebElement explicitWait(String xpath) {
        WebElement element = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        waitForSomeTime(1);
        return element;
    }

    public void waitForSomeTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public WebElement explicitWaitVisible(String xpath) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        waitForSomeTime(1);
        return element;


    }

    public void implicitWait(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);

    }

    public void navigateEatStreet() {
        driver.get("https://qa2.eatstreet.com");
    }

    public void closeCookiesWarning() {
        driver.findElement(By.xpath("//button[contains(text(), 'Got it')]")).click();
    }


    @AfterMethod
    public void after() {
        driver.quit();
    }

}
