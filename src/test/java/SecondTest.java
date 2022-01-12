import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends TestInit{


    @Test
    public void check(){

        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

    }    @Test
    public void checkTwo(){

        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

    }    @Test
    public void checkThree(){

        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }
}
