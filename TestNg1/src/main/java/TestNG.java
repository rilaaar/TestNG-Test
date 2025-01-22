import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNG {
    WebDriver driver ;
     @Test
    public void openSauceDemo() {
        // open browser
        String baseUrl = "https://www.saucedemo.com/";


        System.out.println("Launching Google Chrome browser");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String testTitle = "Swag Labs";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);


        // login
       System.out.println("Input Username");
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       System.out.println("Input Password");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       System.out.println("Click Login");
       driver.findElement(By.id("login-button")).click();

       //add oneside to cart
       System.out.println("Add backpack to cart");
       driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
       System.out.println("Add oneside to cart");
       driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();

       // go to cart list
       System.out.println("Click Shopping cart");
       driver.findElement(By.className("shopping_cart_container")).click();

    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Test saucedemo.com");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
        System.out.println("Finished Test saucedemo.com");
    }


}