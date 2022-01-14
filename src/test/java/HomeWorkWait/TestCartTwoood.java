package HomeWorkWait;

import HomeWorkWait.TestInit;
import org.testng.annotations.Test;

public class TestCartTwoood extends TestInit {

    @Test
    public void testCartAdd() {
        navigateEatStreet();
        closeCookiesWarning();
        chooseCity();
        chooseTypeFood();
        clickTakeOut();
        chooseRestaurant();
        choseFood();
        clickAdd();
        clickAdd();
        addToCart();
        explicitWaitVisible("//strong[contains(text(), '$21.75')]");


    }

    @Test
    public void TestCartDelete() {
        navigateEatStreet();
        closeCookiesWarning();
        chooseCity();
        chooseTypeFood();
        clickTakeOut();
        chooseRestaurant();
        choseFood();
        clickAdd();
        clickAdd();
        addToCart();
        delWithCart();
        delWithCart();
        delWithCart();
        checkResultDel();
    }

    private void checkResultDel() {
        explicitWait("//a[contains(text(), 'Order Ahead')]");
    }

    private void delWithCart() {
        explicitWait("//a[@id=\"remove-item\"]").click();
    }

    public void addToCart() {
        explicitWait("//span[contains(text(), 'Add to Cart')]").click();
    }

    public void clickAdd() {
        explicitWait("//button[@title=\"Add copy of this item\"][@id=\"quantity--adds\"]").click();
    }

    public void choseFood() {
        explicitWait("//span[contains(text(), 'BBQ Spare Ribs (4)')]").click();
    }

    public void chooseRestaurant() {
        explicitWait("//a[contains(text(), 'Happy Dragon')]").click();
    }

    public void clickTakeOut() {
        explicitWait("//input[@ng-click='trackMenuFilterDeliveryOrTakeoutClick('Takeout')']").click();
    }

    public void chooseTypeFood() {
        explicitWait("//button[contains(text(), 'View all Asian Food options')]").click();
    }

    public void chooseCity() {
        explicitWait("//a[contains(text(), 'San Antonio, TX')]").click();
    }
}
