package HomeWorkTestInit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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

    @AfterMethod
    private void after() {
        driver.quit();
    }

    public WebElement explicitWaitToBeClickable(String xpath) {
        WebElement element = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return element;
    }

    public void navigateEatStreet() {
        driver.get("https://qa2.eatstreet.com");
    }

    public void closeCookiesWarning() {
        driver.findElement(By.xpath("//button[contains(text(), 'Got it')]")).click();
    }

    public void implicitWait(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);

    }

    public void explicityWaitNumberTwoWindows() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

//    public boolean explicityWaitContainsText(String text) {
//            return new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.textToBePresentInElement(locator, text));
//
//
//    }
//    public void explicityWaitr(){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.attributeContains())
//    }



    public void explicityWaitUrlContains(String url) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.getCurrentUrl();
        wait.until(ExpectedConditions.urlContains(url));
    }

    public void explicityWaitElementToBeVisible(String xpath){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public void explicityWaitElementSelected(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));
    }


    @AfterTest
    private void afterTest() {
        driver.quit();
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
