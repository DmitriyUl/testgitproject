package Lessons.Students;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPageObjectBasics {

    WebDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkLoginURL() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        navigateEatStreet();
        closeCookiesWarning();
        clickSignIn();
        navigteSearchFiel();
//      Assert.assertEquals(getURL(), "https://qa2.eatstreet.com/signin");
    }
    private String getURL() {
        return driver.getCurrentUrl();
    }

    @Test
    public void checkSignInButton() {
        navigateEatStreet();
        closeCookiesWarning();
        clickSignIn();
        Assert.assertTrue(isSignInButtonDisplayed());
    }

    private boolean isSignInButtonDisplayed() {
        return driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed();
    }

    private void navigateEatStreet() {
        driver.get("https://qa2.eatstreet.com");
    }

    private void clickSignIn() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
    }

    private void closeCookiesWarning() {
        driver.findElement(By.xpath("//button[contains(text(), 'Got it')]")).click();
    }
    private void navigteSearchFiel(){
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Address\"]")).sendKeys("New Orleans, Луїзіана, Сполучені Штати Америки");
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}