package HomeWorkWait;

import org.testng.annotations.Test;

public class TestEatStreet extends TestInit {

    @Test
    public void navEatStreet() {
        navigateEatStreet();

    }

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
        checkResultSumma();
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

}
