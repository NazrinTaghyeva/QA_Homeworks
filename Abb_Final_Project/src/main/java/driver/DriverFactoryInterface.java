package driver;

import driver.exceptions.DriverNotSupported;
import org.openqa.selenium.WebDriver;

public interface DriverFactoryInterface {
    WebDriver getDriver() throws DriverNotSupported;

}
