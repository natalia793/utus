package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {



    private static final String CHOISE_KURS = "//div[@class='transitional-main__event-button']/div";

    @FindBy(xpath = CHOISE_KURS)
    public static WebElement choiseKurs;





}
