package homePage;

import HomePage.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void homePageTest() {
        HomePage homePage = HomePage.getInstance(driver);
        String[] actualTitle = homePage.home();
        String[] expectedTitle = new String[]{"Home", "\uE8F8 Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us"};
        Assert.assertEquals(actualTitle, expectedTitle);
        for (int i = 0; i < actualTitle.length; i++) {
//                if (actualTitle[i].startsWith(" ")) {
//                    // Remove the first two characters
//                    actualTitle[i] = actualTitle[i].substring(2);
//                }
                System.out.println("Actual title: " + actualTitle[i] + "\nExpected title: " + expectedTitle[i]);
            }
        }
    }
