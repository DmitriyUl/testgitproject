package SeleniumWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSelenium(){
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rozetka.com.ua/");
        String url = chromeDriver.getCurrentUrl();
        chromeDriver.getCurrentUrl();
        chromeDriver.quit();
        Assert.assertEquals(url, "https://rozetka.com.ua/");
        System.out.println(url);
    }

    @Test
    public void testSeleniumRozetka(){
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.findElement(By.xpath("//input")).click();
        chromeDriver.findElement(By.xpath("//input")).sendKeys("Ноут");
        sleep(5);
        chromeDriver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit ng-star-inserted\"]")).click();
        sleep(2);
        String url = chromeDriver.getCurrentUrl();
        sleep(2);
        chromeDriver.quit();
        Assert.assertEquals(url, "https://rozetka.com.ua/notebooks/c80004/#search_text=ноут");
    }

    @Test
    public void testSeleniumRozetka1() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.findElement(By.xpath("//input")).click();
        chromeDriver.findElement(By.xpath("//input")).sendKeys("Ноут");
        chromeDriver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit ng-star-inserted\"]")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//label[@for=\"Rozetka\"]")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//label[@for=\"Apple\"]")).click();
        sleep(3);
        chromeDriver.findElement(By.xpath("//span[text()=' Ноутбук Apple MacBook Air 13\" M1 256GB 2020 (MGN63) Space Gray ']")).click();
        sleep(4);
        chromeDriver.findElement(By.xpath("//span[text()= ' Купить ']")).click();
        sleep(3);
        chromeDriver.findElement(By.xpath("//a[@class=\"button button_size_medium button_color_gray cart-footer__continue ng-star-inserted\"]")).click();

    //       String url = chromeDriver.getCurrentUrl();
        chromeDriver.quit();
 //       Assert.assertEquals(url, "https://rozetka.com.ua/notebooks/c80004/#search_text=ноут");
    }
    @Test
    public void testSeleniumAllo() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://allo.ua/ru/");
        chromeDriver.findElement(By.xpath("//input[@id=\"search-form__input\"]")).sendKeys("холодильник");
        chromeDriver.findElement(By.xpath("//button[@class=\"search-form__submit-button\"]")).click();
        chromeDriver.findElement(By.xpath("//li[@title=\"новинки\"]")).click();
    }
    @Test
    public void testSeleniumAmazon() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/");
        chromeDriver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("gaming keyboard");
        sleep(3);
        chromeDriver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
        sleep(3);
        chromeDriver.findElement(By.xpath("//i[@class=\"a-icon a-icon-star-medium a-star-medium-4\"]")).click();
        sleep(3);
        chromeDriver.findElement(By.xpath("//span[@class=\"a-dropdown-prompt\"]")).click();
        sleep(5);
        chromeDriver.findElement(By.xpath("//a[@id=\"s-result-sort-select_1\"]")).click();
        sleep(5);
        chromeDriver.findElement(By.xpath("//li[@aria-label=\"ASUS\"]")).click();
        sleep(5);
        chromeDriver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/I/5126axX282L._AC_UY218_.jpg\"]]")).click();
        sleep(5);
        chromeDriver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
        try {
            chromeDriver.wait(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testSeleniumAmazon2() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/");
        chromeDriver.findElement(By.xpath("")).click();
        chromeDriver.findElement(By.xpath("//img[@alt=\"Shop all Holiday Gift Guides\"]")).click();
        chromeDriver.findElement(By.xpath("//img[@alt=\"Gifts Under $30\"]")).click();
        chromeDriver.findElement(By.xpath("//img[@alt=\"Tainbat Solar Power Bank 20000mAh Portable Charger Solar for Cell Phone, Waterproof External Backup Battery USB Charger wi...\"]")).click();
        chromeDriver.findElement(By.xpath("//a[@href=https://www.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Faw%2Fd%2FB09DSVPSZV&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&]")).click();
        chromeDriver.findElement(By.xpath("//input[@id=\"ap_email\"]")).click();
        chromeDriver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
    }
}
