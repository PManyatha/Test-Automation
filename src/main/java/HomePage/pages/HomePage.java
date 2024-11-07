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

    public List<WebElement> getCarouselSlides() {
        return findElements.getElementsByXPath("//div[@class='item']");
    }

    public List<WebElement> getCategory(){
        return findElements.getElementsByXPath("//div[@class='panel panel-default']");
    }

    public List<WebElement> getBrands(){
        return findElements.getElementsByXPath("//ul[@class='nav nav-pills nav-stacked']/li");
    }

    public List<WebElement> getFeaturedItems() {
        return findElements.getElementsByXPath("//div[@class='product-image-wrapper']");
    }

    public void scroll(){
        WebElement element = findElements.ByCSS("#footer > div.footer-widget > div > div > div.col-sm-3.col-sm-offset-1 > div > h2");
        actions.scrollWindow(element);
    }

    public WebElement getSubscriptionTextbox() {
        return findElements.ByCSS("#susbscribe_email"); // Adjust selector as needed
    }

    public WebElement getSubmitButton() {
        return findElements.ByCSS("#subscribe"); // Adjust selector as needed
    }



}
