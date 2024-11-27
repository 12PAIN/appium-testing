import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lib.CoreTestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class FirstSearchFailed extends CoreTestCase {


//    @Before
//    @Override
//    public void setUp() throws Exception {
//        super.setUp();
//    }
//
//    @After
//    @Override
//    public void tearDown() throws Exception{
//        super.tearDown();
//    }
//
//    @Test
//    public void firstSearch() throws Exception{
//        By locator = By.xpath("//*[contains(@text, 'Поиск по Википедии')]");
//        waitForElementAndClick(locator,
//                "Не удаётся нажать на поиск", 15);
//
//        waitForElementAndSendKeys(locator, "DNS", "Не удаётся найти поле для ввода",
//                5);
//
//
//        By dnsLocator = By.xpath("//*[@class='android.view.ViewGroup']//*[@text='российская торговая" +
//                " сеть по продаже бытовой техники и электроники']");
//
//        waitForElementAndClick(dnsLocator, "Не удалось найти DNS", 15);
//
//
//        By descriptionByIdLocator = By.id("pcs-edit-section-title-description");
//
//        WebElement descriptionElement = waitForElementPresent(descriptionByIdLocator, "Не удалось " +
//                "найти описание", 15);
//
//        String description = descriptionElement.getText();
//
//        Assert.assertEquals("Найдено совпадение в описании статьи", "е2е4", description);
//
//    }
//
//    private WebElement waitForElementPresent(By locator, String errorMessage, long timeoutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
//        wait.withMessage(errorMessage + "\n");
//        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//    }
//
//    private WebElement waitForElementAndSendKeys(By locator, String value, String errorMessage, long timeoutInSeconds) {
//        WebElement element = waitForElementPresent(locator, errorMessage, timeoutInSeconds);
//        element.sendKeys(value);
//        return element;
//    }
//
//    private WebElement waitForElementAndClick(By locator, String errorMessage, long timeoutInSeconds) {
//        WebElement element = waitForElementPresent(locator, errorMessage, timeoutInSeconds);
//        element.click();
//        return element;
//    }

}
