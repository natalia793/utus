import helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.MainPage;

import static net.bytebuddy.matcher.ElementMatchers.is;

public class Main extends MainPage{

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = Driver.initDriver();

        assert driver != null;
        driver.get("https://otus.ru/");

        Thread.sleep(3000);  // Let the user actually see something!

        driver.findElement(By.xpath("//div[@class='transitional-main__event-button']/div")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Каталог']")).getText().contains("Каталог"));
        driver.quit();


    }

}
