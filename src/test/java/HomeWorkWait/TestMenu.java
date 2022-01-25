package HomeWorkWait;

import org.testng.annotations.Test;

public class TestMenu extends TestEatStreet {

    @Test
    public void testBackMenuButton() {
        navigateEatStreet();
        closeCookiesWarning();
        chooseCity();
        chooseTypeFood();
        clickTakeOut();
        chooseRestaurant();
        choseFood();
        clickBackMenuButton();
        checkVisibleSearchMenu();
    }
    @Test
    public void testMenuMinusButton() {
        navigateEatStreet();
        closeCookiesWarning();
        chooseCity();
        chooseTypeFood();
        clickTakeOut();
        chooseRestaurant();
        choseFood();
        clickAdd();
        clickAdd();
        clickMinusBuuton();
        clickMinusBuuton();
        checkResultMinusBuuton();



    }

    private void checkResultMinusBuuton() {
        explicitWaitVisible("//div[contains(text(), '1')][@title=\"1\"]");

    }

    private void clickMinusBuuton() {
        explicitWait("//button[@ng-click=\"1 < product.qty && changeQuantity(product, -1)\"]").click();
    }

    private void checkVisibleSearchMenu() {
        explicitWaitVisible("//input[@placeholder=\"Search Menu\"]");
    }

    private void clickBackMenuButton() {
        explicitWait("//a[@id=\"back-to-menu\"]").click();
    }

}
