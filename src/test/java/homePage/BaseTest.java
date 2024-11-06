package homePage;

import homePage.shared.PageWaits;
import homePage.utils.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static java.lang.Thread.sleep;

public class BaseTest {
    WebDriver driver = DriverCreator.instantiateDriver(ConfigReader.getBrowser());;
    PageWaits waits = null;
    @BeforeSuite
    public void setup() {
        driver.get(ConfigReader.getBaseURL());
        this.waits = PageWaits.getPageWaitsObject(this.driver);
    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
        sleep(3000);
        driver.close();
        driver.quit();
    }
}

