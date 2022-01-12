import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends TestInit{


    @Test
    public void check(){

        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

    }
    @Test
    public void checkTwo(){

        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

    }
    @Test
    public void checkThree(){

        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

}
