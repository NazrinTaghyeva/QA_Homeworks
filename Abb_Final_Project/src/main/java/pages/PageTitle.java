package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class PageTitle extends AbsBasePage {
    public PageTitle(WebDriver driver) {
        super(driver);
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void pageTitleShouldBeSameAs(String title) {
        System.out.println(driver.getTitle());
        Assert.assertEquals(
                title,
                pageTitle(),
                String.format("Title should be %s", title));
    }
}
