package HomePage.pages;

import HomePage.shared.Actions;
import HomePage.shared.FindElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartFlow {
    private static ShoppingCartFlow shoppingCartFlowInstance;
    private final FindElements findElements;
    private final Actions actions;


    public ShoppingCartFlow(WebDriver driver) {
        this.findElements = FindElements.getInstance(driver);
        this.actions = Actions.getActionsObject(driver);
    }

    public static ShoppingCartFlow getInstance(WebDriver driver) {
        if (shoppingCartFlowInstance == null) {
            shoppingCartFlowInstance = new ShoppingCartFlow(driver);
        }
        return shoppingCartFlowInstance;
    }

    public List<WebElement> navigate(){

        WebElement men = findElements.ByCSS("#accordian > div:nth-child(2) > div.panel-heading > h4 > a");
        actions.scrollWindow(men);
        actions.clickElement(men);
        WebElement shirt = findElements.ByXPath("//*[@id=\"Men\"]/div/ul/li[1]/a");
        actions.clickElement(shirt);

        return findElements.getElementsByClass("col-sm-4");
    }

}
