package HomeWorkTestInit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestExplicityWaitMethod extends TestInit {
    @Test
    public void testCity2() {
        navigateEatStreet();
        closeCookiesWarning();
        navigateApplyNow();
        explicitWaitToBeClickable("//select[@onchange=\"location = this.value;\"]").click();
        explicitWaitToBeClickable("//option[@value=\"/careers/delivery-driver-dubuque\"]").click();
        explicitWaitToBeClickable("//span[@class=\"page-title page-title--dashed ng-binding\"]").isDisplayed();

    }


    @Test
    public void testWhatWeDoText() {
        navigateEatStreet();
        closeCookiesWarning();
        navigateApplyNow();
        explicityWaitUrlContains("https://qa2.eatstreet.com/driver-careers");


    }

    @Test
    public void testCityPalto() {
        navigateEatStreet();
        closeCookiesWarning();
        navigatePaloAlto();
        explicityWaitElementToBeVisible("//span[contains(text(), 'Palo Alto, CA')]");



    }


    @Test
    public void testCityNewOrleanOrderForTakeOut() {
        navigateEatStreet();
        closeCookiesWarning();
        navigateNewOrleansCity();
        clickNewOrleansCity();
        explicitWaitToBeClickable("//input[@id=\"filters-checkbox-takeout\"]").click();
        explicityWaitElementSelected("//input[@id=\"filters-checkbox-takeout\"]");


    }

    @Test
    public void testLiveChat() {
        navigateEatStreet();
        closeCookiesWarning();
        clickLiveChat();
        explicityWaitNumberTwoWindows();
    }


    private void navigateApplyNow() {
        driver.findElement(By.xpath("//a[contains(text(), 'Apply Now')]")).click();

    }

    private void navigatePaloAlto() {
        explicitWaitToBeClickable("//a[contains(text(), 'Palo Alto, CA')]").click();

    }

    public void navigateNewOrleansCity() {
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Address\"]")).sendKeys("New Orleans, Луїзіана, Сполучені Штати Америки");
        implicitWait(10);
        driver.findElement(By.xpath("//li[contains(text(),'New Orleans, Луизиана, США')]")).click();
        implicitWait(10);
    }

    private void clickNewOrleansCity() {
        driver.findElement(By.xpath("//a[@id=\"find-restaurants\"]")).click();
    }

    private void checkResult() {
        driver.findElement(By.xpath("//h1[contains(text(),'New Orleans Restaurants That Deliver & Takeout')]")).isDisplayed();
    }

    private void clickLiveChat() {
        explicitWaitToBeClickable("//span[contains(text(), 'Live Chat')]").click();
    }

}

