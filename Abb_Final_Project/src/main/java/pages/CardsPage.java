package pages;

import data.CardsName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CardsPage extends AbsBasePage {
    public CardsPage(WebDriver driver) {
        super(driver);
    }
   JavascriptExecutor javascriptExecutor;
    @FindBy(css = "#js-header-s3>.pr-4")
    List<WebElement> cards;
    @FindBy(css = ".row.py-5>.col-lg-4.mb-3.mb-lg-0")
    List<WebElement> cardsNames;

    public void cardsTitleShouldBeSameAs(String cardsPageTitle) {
        cards.get(3).click();
        Assert.assertEquals(cardsPageTitle,
                driver.getTitle());
    }

    public void cardsNameShouldBeAs(CardsName cardsData) {
        cards.get(3).click();
        System.out.println("Enum :" + cardsData.getName());
        for (WebElement card : cardsNames) {
            System.out.println(card.getText());
            if (card.getText().trim().equalsIgnoreCase(cardsData.getName().trim())) {
                System.out.println(card.getText());
                javascriptExecutor = (JavascriptExecutor) driver;
                javascriptExecutor.executeScript("arguments[0].click()", card);
                String name = cardsData.getName();
                break;
            }else {
                System.out.println("false");
            }
        }
        Assert.assertEquals(cardsData.getName(), "TamKart MasterCard Debet");

    }

}
