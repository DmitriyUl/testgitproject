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
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestEatStreet2 extends TestInit {

    @Test
    public void testCity() {
        navigateEatStreet();
        closeCookiesWarning();
        navigateApplyNow();
        explicitWait("//select[@onchange=\"location = this.value;\"]").click();
        explicitWait("//option[@value=\"/careers/delivery-driver-dubuque\"]").click();
        explicitWait("//span[@class=\"page-title page-title--dashed ng-binding\"]").isDisplayed();

    }

    @Test
    public void testWhatWeDoText() {
        navigateEatStreet();
        closeCookiesWarning();
        navigateApplyNow();
        explicitWait("//span[contains(text(), 'What we do')]").isDisplayed();


    }


    private void navigateApplyNow() {
        driver.findElement(By.xpath("//a[contains(text(), 'Apply Now')]")).click();

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

}
