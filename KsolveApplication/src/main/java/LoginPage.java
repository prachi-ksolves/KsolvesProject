import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPage {
   public static void main(String[] args) throws InterruptedException {
        WebDriverManager .chromedriver().setup();
       //Launch the browser
        WebDriver driver= new ChromeDriver();

        driver.get("https://store.ksolves.com/");

        //Maximize the Window
        driver.manage().window().maximize();
        //Implicit wait
       // driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();

driver.findElement(By.xpath("//img[@alt='Close']")).click();

driver.findElement(By.xpath("//header[contains(@class,'o_affix_enabled ks-header oe_website_sale')]//img[@alt='bi_person']")).click();
//enter email id
        driver.findElement(By.id("login")).sendKeys("prachi.pandey@ksolves.com");
         //password
driver.findElement(By.name("password")).sendKeys("fbfruz5");
        //Login Button

       driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
       //Drop-down menu

       driver.findElement(By.xpath("//div[@id='top_menu_collapse']//a[@id='dropdownMenuButton']")).click();
       //Click on All button

       driver.findElement(By.xpath("//div[@id='top_menu_collapse']//span[contains(text(),'All')]")).click();

       //click on first product using relative xpath

     driver.findElement(By.xpath("//div[@class='row mx-0']//div[1]//div[2]//div[2]//div[1]//button[1]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//div[@class='grey-bg inner oe_website_sale pt-0 pt-lg-2']//div[2]//div[2]//div[2]//div[1]//button[1]")).click();
     Thread.sleep(3000);
   driver.navigate().to("https://store.ksolves.com/shop/cart");
     //driver.findElement(By.xpath("//header[contains(@class,'o_affix_enabled ks-header oe_website_sale')]//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
        //JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//header[contains(@class,'o_affix_enabled ks-header oe_website_sale')]//img[@alt='Wishlist']")).click();
        driver.quit();

    }
}
