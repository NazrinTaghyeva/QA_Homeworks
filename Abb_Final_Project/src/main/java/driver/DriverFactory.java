package driver;

import driver.exceptions.DriverNotSupported;
import driver.implmnts.ChromeWebDriver;
import org.openqa.selenium.WebDriver;


public class DriverFactory implements DriverFactoryInterface{
    private String browserType = System.getProperty("browser").toLowerCase();

    @Override
    public WebDriver getDriver() throws DriverNotSupported {
        switch(this.browserType) {
            case "chrome": {
                return new ChromeWebDriver().newDriver();
            }
            default:
                throw new DriverNotSupported(this.browserType);
        }

    }
}
