import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lib.CoreTestCase;
import lib.ui.MainPageObject;
import lib.ui.SearchPageObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstSearch extends CoreTestCase {

    public MainPageObject mainPageObject;

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        mainPageObject = new MainPageObject(driver);
    }

    @After
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

//    @Test
//    public void firstSearch() throws Exception{
//        By locator = By.xpath("//*[contains(@text, 'Поиск по Википедии')]");
//        mainPageObject.waitForElementAndClick(locator,
//                "Не удаётся нажать на поиск", 15);
//
//        mainPageObject.waitForElementAndSendKeys(locator, "DNS", "Не удаётся найти поле для ввода",
//                5);
//
//
//        By dnsLocator = By.xpath("//*[@class='android.view.ViewGroup']//*[@text='российская торговая" +
//                " сеть по продаже бытовой техники и электроники']");
//
//        mainPageObject.waitForElementAndClick(dnsLocator, "Не удалось найти DNS", 15);
//
//
//        By descriptionByIdLocator = By.id("pcs-edit-section-title-description");
//
//        WebElement descriptionElement = mainPageObject.waitForElementPresent(descriptionByIdLocator, "Не удалось " +
//                "найти описание", 15);
//
//        String description = descriptionElement.getText();
//
//        Assert.assertEquals("Найдено совпадение в описании статьи", "российская торговая" +
//                " сеть по продаже бытовой техники и электроники", description);
//
//    }

    @Test
    public void testSearchElement() {
        SearchPageObject searchPageObject = new SearchPageObject(driver);

        searchPageObject.initSearchInput();
        searchPageObject.typeSearchLine("DNS");
        searchPageObject.waitForSearchResult("российская торговая сеть по продаже бытовой техники " +
                "и электроники");
    }
}
