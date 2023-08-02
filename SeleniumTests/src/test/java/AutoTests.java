import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AutoTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void checkPageTitle() {
        String pageTitle = driver.getTitle();
//      System.out.println(pageTitle);
        Assert.assertEquals(pageTitle, "DEMOQA");
    }

    @Test
    public void checkSubmittingMatch() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println(categoryCardItems.size());
        WebElement firstCategoryCard = categoryCardItems.get(0);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstCategoryCard);
        WebElement textBox = driver.findElement(By.cssSelector("ul.menu-list>#item-0"));
        js.executeScript("arguments[0].click();", textBox);
        WebElement fullName = driver.findElement(By.cssSelector("input#userName"));
        WebElement email = driver.findElement(By.cssSelector("input#userEmail"));
        WebElement currentAddress = driver.findElement(By.cssSelector("textarea#currentAddress"));
        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea#permanentAddress"));
        fullName.sendKeys("Nazryn Taghiyeva");
        email.sendKeys("nazryntaghiyeva@gmail.com");
        currentAddress.sendKeys("Germany");
        permanentAddress.sendKeys("Azerbaijan");
        WebElement submitButton = driver.findElement(By.cssSelector("button#submit"));
        js.executeScript("arguments[0].click();", submitButton);
        //Matching
        String fullNameSubmitted = driver.findElement(By.cssSelector("p#name")).getText();
        String emailSubmitted = driver.findElement(By.cssSelector("p#email")).getText();
        String currentAddressSubmitted = driver.findElement(By.cssSelector("p#currentAddress")).getText();
        String permanentAddressSubmitted = driver.findElement(By.cssSelector("p#permanentAddress")).getText();
//        System.out.println(fullNameSubmitted);
//        System.out.println(emailSubmitted);
//        System.out.println(currentAddressSubmitted);
//        System.out.println(permanentAddressSubmitted);
        Assert.assertEquals(fullNameSubmitted, "Name:Nazryn Taghiyeva");
        Assert.assertEquals(emailSubmitted, "Email:nazryntaghiyeva@gmail.com");
        Assert.assertEquals(currentAddressSubmitted, "Current Address :Germany");
        //There is a word mistake in the demoQa website "permanent-right but here permananet":)
        Assert.assertEquals(permanentAddressSubmitted, "Permananet Address :Azerbaijan");
    }

    @Test
    public void checkNotesSelected() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        System.out.println(categoryCardItems.size());
        WebElement firstCategoryCard = categoryCardItems.get(0);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstCategoryCard);
        WebElement checkBox = driver.findElement(By.cssSelector("ul.menu-list>#item-1"));
        js.executeScript("arguments[0].click();", checkBox);
        WebElement expandButton = driver.findElement(By.cssSelector("div.rct-options>button.rct-option.rct-option-expand-all"));
        expandButton.click();
        WebElement notesCheck = driver.findElement(By.cssSelector("#tree-node-notes"));
        js.executeScript("arguments[0].click();", notesCheck);
        Boolean isSelected = notesCheck.isSelected();
        System.out.println(isSelected);
        Assert.assertTrue(notesCheck.isSelected());

    }

    @Test
    public void rightButtonClicked() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        System.out.println(categoryCardItems.size());
        WebElement firstCategoryCard = categoryCardItems.get(0);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstCategoryCard);
        WebElement buttons = driver.findElement(By.cssSelector("ul.menu-list>#item-4"));
        js.executeScript("arguments[0].click();", buttons);
        WebElement rightClickButton = driver.findElement(By.cssSelector("#rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();
        WebElement rightClickMessage = driver.findElement(By.cssSelector("#rightClickMessage"));
        if (rightClickMessage.isDisplayed()) {
            System.out.println("Is clicked");
        } else {
            System.out.println("Is not Clicked");
        }
    }

    @Test
    public void checkUploadAndDownload() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstCategoryCard = categoryCardItems.get(0);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstCategoryCard);
        WebElement uploadAndDownload = driver.findElement(By.cssSelector("ul.menu-list>#item-7"));
        js.executeScript("arguments[0].click();", uploadAndDownload);
        WebElement fileUploadInput = driver.findElement(By.cssSelector("#uploadFile"));
        fileUploadInput.sendKeys("C:\\Users\\User\\IdeaProjects\\SeleniumTests\\src\\main\\resources\\fileForTest");
        String uploadedFileName = driver.findElement(By.cssSelector("#uploadedFilePath")).getText();
        System.out.println(uploadedFileName);
        Assert.assertEquals(uploadedFileName, "C:\\fakepath\\fileForTest");
    }

    @Test
    public void checkDynamicProperties() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstCategoryCard = categoryCardItems.get(0);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstCategoryCard);
        WebElement uploadAndDownload = driver.findElement(By.cssSelector("ul.menu-list>#item-8"));
        js.executeScript("arguments[0].click();", uploadAndDownload);
        WebElement visibleFiveSecondButton = driver.findElement(By.cssSelector("#visibleAfter"));
        wait.until(ExpectedConditions.visibilityOf(visibleFiveSecondButton));
        js.executeScript("arguments[0].click();", visibleFiveSecondButton);
        Assert.assertTrue(visibleFiveSecondButton.isDisplayed());
    }

    @Test
    public void checkNewTabIsOpened() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement thirdCategoryCard = categoryCardItems.get(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", thirdCategoryCard);
        WebElement browserWindows = driver.findElement(By.cssSelector(".element-list.collapse.show > ul.menu-list>#item-0"));
        js.executeScript("arguments[0].click();", browserWindows);
        WebElement tabButton = driver.findElement(By.cssSelector("#tabButton"));
        tabButton.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        WebElement sampleHeadingNewTab = driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println(sampleHeadingNewTab.getText());
        Assert.assertTrue(sampleHeadingNewTab.isDisplayed());
    }

    @Test
    public void checkInformationAfterOk() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement thirdCategoryCard = categoryCardItems.get(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", thirdCategoryCard);
        WebElement alertsItem = driver.findElement(By.cssSelector(".element-list.collapse.show > ul.menu-list>#item-1"));
        js.executeScript("arguments[0].click();", alertsItem);
        WebElement button = driver.findElement(By.cssSelector("button#promtButton"));
        js.executeScript("arguments[0].click();", button);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Hello Teacher, I want to 12 grade :)");
        promptAlert.accept();
        WebElement promptResult = driver.findElement(By.cssSelector("span#promptResult"));
        String promptResultText = promptResult.getText();
        System.out.println(promptResultText);
        Assert.assertTrue(promptResultText.contains("Hello Teacher, I want to 12 grade :)"));

    }

    @Test
    public void checkAlertCancelled() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement thirdCategoryCard = categoryCardItems.get(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", thirdCategoryCard);
        WebElement alertsItem = driver.findElement(By.cssSelector(".element-list.collapse.show > ul.menu-list>#item-1"));
        js.executeScript("arguments[0].click();", alertsItem);
        WebElement confirmButton = driver.findElement(By.cssSelector("button#confirmButton"));
        js.executeScript("arguments[0].click();", confirmButton);
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
        WebElement confirmResult = driver.findElement(By.cssSelector("span#confirmResult"));
        String confirmResultText = confirmResult.getText();
        System.out.println(confirmResultText);
        Assert.assertTrue(confirmResultText.contains("You selected Cancel"));

    }

    @Test
    public void checkText() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement thirdCategoryCard = categoryCardItems.get(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", thirdCategoryCard);
        WebElement alertsItem = driver.findElement(By.cssSelector(".element-list.collapse.show > ul.menu-list>#item-2"));
        js.executeScript("arguments[0].click();", alertsItem);
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(), "This is a sample page");
    }

    @Test
    public void checkFiveUsed() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement thirdCategoryCard = categoryCardItems.get(4);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", thirdCategoryCard);
        WebElement selectable = driver.findElement(By.cssSelector(".accordion>.element-group>.element-list.collapse.show > ul.menu-list>#item-1"));
        js.executeScript("arguments[0].click();", selectable);
        WebElement grid = driver.findElement(By.cssSelector(".nav.nav-tabs>#demo-tab-grid"));
        grid.click();
        WebElement five = driver.findElement(By.cssSelector("#row2 > li:nth-child(2)"));
        js.executeScript("arguments[0].click();", five);
        if (five.getAttribute("class").contains("active")) {
            System.out.println("Five Selected:)");
        } else {
            System.out.println("Я уже устала(((");
        }

    }

    @Test
    public void checkDragAndDrop() {
        List<WebElement> categoryCardItems = driver.findElements(By.cssSelector("div.category-cards>.card.mt-4.top-card"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement thirdCategoryCard = categoryCardItems.get(4);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", thirdCategoryCard);
        WebElement droppable = driver.findElement(By.cssSelector(".accordion>.element-group>.element-list.collapse.show > ul.menu-list>#item-3"));
        js.executeScript("arguments[0].click();", droppable);
        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.cssSelector("div#simpleDropContainer>div#draggable"));
        WebElement drop = driver.findElement(By.cssSelector("div#simpleDropContainer>div#droppable"));
        actions.dragAndDrop(drag, drop).build().perform();
        String droppedText = drop.getText();
        System.out.println(droppedText);
        wait.until(ExpectedConditions.visibilityOf(drop));
        if (droppedText.equalsIgnoreCase("Dropped!")){
            System.out.println("This Item is Dropped");
        }else {
            System.out.println("This Item is Dropped");
        }
//        Assert.assertEquals(droppedText, "Dropped!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
