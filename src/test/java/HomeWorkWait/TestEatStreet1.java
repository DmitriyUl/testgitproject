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

public class TestEatStreet1 extends TestInit {

    @Test
    public void testCity() {
        navigateEatStreet();
        closeCookiesWarning();
        navigatePaloAlto();
        driver.findElement(By.xpath("//p[contains(text(), 'Palo Alto, CA')]")).isDisplayed();


    }


    @Test
    public void testCart() {
        navigateEatStreet();
        closeCookiesWarning();
        navigatePaloAlto();
        clickRestaurant();
        implicitWait(3);
        chooseTypeOfFood();
        implicitWait(5);
        choseRestaurant();
        implicitWait(3);
        chooseFood();
        implicitWait(4);
        addIngredients();
        implicitWait(5);
        addToCard();
        implicitWait(8);
        checkResultIsDispayed();


    }

    private void checkResultIsDispayed() {
        driver.findElement(By.xpath("//a[contains(text(), 'Triple Cheese Omelet')]")).isDisplayed();
    }

    private void addToCard() {
        explicitWait("//span[contains(text(), 'Add to Cart')]").click();
    }

    private void addIngredients() {
        explicitWait("//input[@id=\"78615805\"]").click();
    }

    private void chooseFood() {
        explicitWait("//span[contains(text(), 'Triple Cheese Omelet')]").click();
    }

    private void choseRestaurant() {
        explicitWait("//a[contains(text(), 'Franklin Street Caffe')]").click();
    }

    private void chooseTypeOfFood() {
        explicitWait("//a[contains(text(), 'Franklin Street Caffe')]").click();
    }

    private void clickRestaurant() {
        driver.findElement(By.xpath("//button[contains(text(), 'View all American Food options')]")).click();
    }

    private void navigatePaloAlto() {
        driver.findElement(By.xpath("//a[contains(text(), 'Palo Alto, CA')]")).click();
        implicitWait(2);

    }

    public void implicitWait(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);

    }




}
