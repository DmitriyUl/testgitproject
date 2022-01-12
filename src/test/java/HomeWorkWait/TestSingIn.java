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

import java.util.concurrent.TimeUnit;

public class TestSingIn extends TestInit {


    @Test
    public void checkSingInInvalidDataEmail() {
        navigateEatStreet();
        closeCookiesWarning();
        clickSignIn();
        implicitWait(10);
        singInClickWithoutData();
        implicitWait(5);
        checkInvalidDataEmail();
    }

    @Test
    public void checkSingInInvalidDataPasword() {
        navigateEatStreet();
        closeCookiesWarning();
        clickSignIn();
        implicitWait(10);
        singInClickWithoutData();
        implicitWait(5);
        checkInvalidDataParol();
    }

    private void checkInvalidDataParol() {
        driver.findElement(By.xpath("//div[@id=\"password-validation-tag\"]")).click();
    }

    private boolean isSignInButtonDisplayed() {
        return driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed();
    }



    private void clickSignIn() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
    }



    private void checkInvalidDataEmail() {
        driver.findElement(By.xpath("//div[@ng-if=\"validationErrors[name]\"][@id=\"email-validation-tag\"]")).isDisplayed();
    }

    private void singInClickWithoutData() {
        explicitWait("//button[contains(text(), 'Sign In')]").click();
    }


}

