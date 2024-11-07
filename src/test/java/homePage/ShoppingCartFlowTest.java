package homePage;

import HomePage.pages.ShoppingCartFlow;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingCartFlowTest extends BaseTest {

    @Test
    public void listOfShirts(){
        ShoppingCartFlow shoppingCartFlow = ShoppingCartFlow.getInstance(driver);
        shoppingCartFlow.navigate();
        List<WebElement> items=shoppingCartFlow.navigate();
        int minProductCount = 1;
        Assert.assertTrue(items.size()>= minProductCount);
        System.out.println("Featured items Size:" + items.size());

    }


}
