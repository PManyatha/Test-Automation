package HomePage.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements {
    private static FindElements elements = null;
    WebDriver driver;


    public FindElements(WebDriver driver) {
        this.driver = driver;
    }

    public static FindElements getInstance(WebDriver driver) {
        if (FindElements.elements == null) {
            FindElements.elements = new FindElements(driver);
        }
        return FindElements.elements;
    }
    public WebElement ByCSS(String cssLocator) {
        return driver.findElement(By.cssSelector(cssLocator));
    }
    public WebElement ByID(String elementId) {
        return driver.findElement(By.id(elementId));
    }
    public WebElement ByName(String elementName) {
        return driver.findElement(By.name(elementName));
    }

    public WebElement ByClass(String className) {
        return driver.findElement(By.className(className));
    }

    public WebElement ByXPath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public List<WebElement> getElementsByCSS(String cssLocator) {
        return driver.findElements(By.cssSelector(cssLocator));
    }

    public List<WebElement> getElementsByXPath(String xpathLocator) {
        return driver.findElements(By.xpath(xpathLocator));
    }

    public List<WebElement> getElementsByClass(String classLocator) {
        return driver.findElements(By.className(classLocator));
    }



    public WebElement ByPartialLinkText(String text) {
        return driver.findElement(By.partialLinkText(text));
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
    public Boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public Boolean isElementEnabled(WebElement element){
        return element.isEnabled();
    }
}