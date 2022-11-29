package helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.remote.CapabilityType.ACCEPT_INSECURE_CERTS;

public class Driver {
    public static WebDriver initDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/20242141/IdeaProjects/qa/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
        options.setCapability(ACCEPT_INSECURE_CERTS, true);
        options.addArguments("--lang=ru");


        return null;
    }
}
