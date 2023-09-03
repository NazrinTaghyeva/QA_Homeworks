import data.CardsName;
import driver.DriverFactory;
import driver.exceptions.DriverNotSupported;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CardsPage;
import pages.PageTitle;

public class CardsPageTest {
    private WebDriver driver;

    @BeforeMethod
    public void init() throws DriverNotSupported {
        this.driver = new DriverFactory().getDriver();
    }


    @Test
    public void checkCardsPageTitle(){
        new CardsPage(driver).openURL("");
        new CardsPage(driver).cardsTitleShouldBeSameAs("Online Kart Sifarişi - Debet və Kredit kart- ABB Bank Kartları");
    }

    @Test
    public void checkCardIsSelected(){
     new CardsPage(driver).openURL("");
     new CardsPage(driver).cardsNameShouldBeAs(CardsName.CARD1);
    }

//    @AfterMethod
//    public void close() {
//        if (this.driver != null) {
//            this.driver.close();
//            this.driver.quit();
//        }
//
//    }
}
