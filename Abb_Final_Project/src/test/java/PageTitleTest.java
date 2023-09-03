import driver.DriverFactory;
import driver.exceptions.DriverNotSupported;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageTitle;

public class PageTitleTest {
    private WebDriver driver;

    @BeforeMethod
    public void init() throws DriverNotSupported {
        this.driver = new DriverFactory().getDriver();
    }

    @Test
    public void checkPageTitle() {
        new PageTitle(driver).openURL("");
        new PageTitle(driver).pageTitleShouldBeSameAs("ABB - Müasir, Faydalı, Universal");
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
