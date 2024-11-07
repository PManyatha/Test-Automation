package homePage;

import HomePage.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

       @Test
       public void carouselSlides(){
        HomePage homePage = HomePage.getInstance(driver);
           List<WebElement> carouse = homePage.getCarouselSlides();

           int expectedSize = 3;
           Assert.assertEquals(carouse.size(), expectedSize);
           System.out.println("Carousel slides Size:" + carouse.size());
       }

       @Test
       public void category(){
        HomePage homePage = HomePage.getInstance(driver);
        List<WebElement> category = homePage.getCategory();
        int expectedSize = 3;
        Assert.assertEquals(category.size(), expectedSize);
        System.out.println("Category Size:" + category.size());
       }

       @Test
       public void brands(){
        HomePage homePage = HomePage.getInstance(driver);
        List<WebElement> brands = homePage.getBrands();
        int expectedSize = 8;
        Assert.assertEquals(brands.size(), expectedSize);
           System.out.println("Brands Size:" + brands.size());
       }

       @Test
        public void featuresItems(){
        HomePage homePage = HomePage.getInstance(driver);
        List<WebElement> items = homePage.getFeaturedItems();
        int minProductCount = 1;
        Assert.assertTrue(items.size()>= minProductCount);
        System.out.println("Featured items Size:" + items.size());
       }

    }
