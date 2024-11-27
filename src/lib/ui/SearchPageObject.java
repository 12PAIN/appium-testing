package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchPageObject extends MainPageObject{

    public final static String
    SEARCH_INIT_ELEMENT = "//*[contains(@text, 'Поиск по Википедии')]",
    SEARCH_INPUT = "//*[contains(@text, 'Поиск')]",
    SEARCH_RESULT = "//*[@class='android.view.ViewGroup']//*[@text='{SUBSTRING}']";

    public SearchPageObject(AppiumDriver driver) {
        super(driver);
    }

    public void initSearchInput(){
        this.waitForElementAndClick(By.xpath(SEARCH_INIT_ELEMENT),
                "Не удаётся нажать на поиск", 15);

        this.waitForElementPresent(By.xpath(SEARCH_INPUT), "Элемент ввода поиска не найден",
                5);
    }


    public void typeSearchLine(String searchLine) {
        this.waitForElementAndSendKeys(By.xpath(SEARCH_INPUT), searchLine, "Невозможно ввести в " +
                "поле ввода", 15);
    }

    public static String getResultSearchElement(String substring) {
        return SEARCH_RESULT.replace("{SUBSTRING}", substring);
    }

    public void waitForSearchResult(String substring) {
        String searchResultXpath = getResultSearchElement(substring);

        this.waitForElementPresent(By.xpath(searchResultXpath), "Невозможно найти", 15);
    }

    public void clickOnSearchResult(String substring) {
        String searchResultXpath = getResultSearchElement(substring);
        this.waitForElementAndClick(By.xpath(searchResultXpath), "Невозможно найти", 15);
    }
}
