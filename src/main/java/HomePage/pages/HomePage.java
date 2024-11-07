package HomePage.pages;

import HomePage.shared.Actions;
import HomePage.shared.FindElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class HomePage {

    private static HomePage homePageInstance;
    private final FindElements findElements;
    private final Actions actions;

    private HomePage(WebDriver driver) {
        this.findElements = FindElements.getInstance(driver);
        this.actions = Actions.getActionsObject(driver);
    }

    public static synchronized HomePage getInstance(WebDriver driver) {
        if (homePageInstance == null) {
            homePageInstance = new HomePage(driver);
        }
        return homePageInstance;
    }

    public String[] home() {

        List<WebElement> menuItems = findElements.getElementsByXPath("//div[@class='shop-menu pull-right']//ul//a");

        String[] result = new String[menuItems.size()];

        for (int i = 0; i < menuItems.size(); i++) {
            result[i] = menuItems.get(i).getText();
        }
        return result;
    }
}
