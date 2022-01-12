package HomeWorkWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestEatstreetWait extends TestInit {


    @Test
    public void testCity() {
        navigateEatStreet();
        closeCookiesWarning();
        navigateNewOrleansCity();
        clickNewOrleansCity();
        implicitWait(5);
        checkResult();

    }


    @Test
    public void testLogoNavigateToHomePage() {
        navigateEatStreet();
        String url = driver.getCurrentUrl();
        closeCookiesWarning();
        implicitWait(5);
        navigateNewOrleansCity();
        implicitWait(5);
        clickNewOrleansCity();
        implicitWait(5);
        clickLogoEatStreet().click();
        implicitWait(5);
        Assert.assertEquals(url, ("https://qa2.eatstreet.com/"));

    }


    private WebElement clickLogoEatStreet() {
        return explicitWait("//img[@alt=\"EatStreet Logo\"]");

    }


    public void navigateNewOrleansCity() {
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Address\"]")).sendKeys("New Orleans, Луїзіана, Сполучені Штати Америки");
        implicitWait(10);
        driver.findElement(By.xpath("//li[contains(text(),'New Orleans, Луизиана, США')]")).click();
        implicitWait(10);
    }

    private void checkResult() {
        driver.findElement(By.xpath("//h1[contains(text(),'New Orleans Restaurants That Deliver & Takeout')]")).isDisplayed();
    }

    private void clickNewOrleansCity() {
        driver.findElement(By.xpath("//a[@id=\"find-restaurants\"]")).click();
    }


    public void implicitWait(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);

    }

    public WebElement explicitWait(String locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }



}
