package pages.yandex_all_filters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class YandexAllFiltersPage extends BasePage {

    public YandexAllFiltersPage(WebDriver driver) {
        super(driver);
    }

    private By priceUpToInput = By.xpath("//input[@placeholder = '1 792 000']");
    private By screenDiagonalDropDown = By.xpath("//div[@data-filter-id = '14805766']/div/button");
    private By screenDiagonalFromValue = By.xpath("//input[@placeholder = '1.77']");
    private By appleCheckBox = By.xpath("//input[@value = 'Apple']");
    private By blackViewCheckBox = By.xpath("//input[@value = 'Blackview']");
    private By BQCheckBox = By.xpath("//input[@value = 'BQ']");
    private By samsungCheckBox = By.xpath("//input[@value = 'Samsung']");
    private By infinixCheckBox = By.xpath("//input[@value = 'Infinix']");
    private By manufacturesList = By.xpath("//div[@data-filter-id = '7893318']");
    private By showOffersButtons = By.xpath("//div[@class = '_1Mk5a']/a/following-sibling::a");
    private By yearOfSales = By.xpath("//h4[text()='Год начала продаж']/parent::*");
    private By yearCheckBox = By.xpath("//label[@id = '31697030']/input");

    public YandexAllFiltersPage insertUpToPrice(String price) {
        driver.findElement(priceUpToInput).clear();
        driver.findElement(priceUpToInput).sendKeys(price);

        return this;
    }

    public YandexAllFiltersPage inputScreenDiagonal(String screenDiagonalValue) {
        WebElement getScreenDiagonalDropdown = driver.findElement(screenDiagonalDropDown);
        scrollToElement(getScreenDiagonalDropdown);
        waitForClickablility(getScreenDiagonalDropdown);
        clickViaJsExecutor(getScreenDiagonalDropdown);
        driver.findElement(screenDiagonalFromValue).sendKeys(screenDiagonalValue);

        return this;
    }

    public YandexAllFiltersPage clickFiveManufacturers() {
        WebElement getmanufacturesList = driver.findElement(manufacturesList);
        scrollToElement(getmanufacturesList);
        WebElement getAppleCheckBox = driver.findElement(appleCheckBox);
        WebElement getBlackViewCheckBox = driver.findElement(blackViewCheckBox);
        WebElement getBQCheckBox = driver.findElement(BQCheckBox);
        WebElement getSamsungCheckBox = driver.findElement(samsungCheckBox);
        WebElement getInfinixCheckBox = driver.findElement(infinixCheckBox);

        waitForClickablility(getAppleCheckBox);
        clickViaActionsClass(getAppleCheckBox);
        waitForClickablility(getBlackViewCheckBox);
        clickViaActionsClass(getBlackViewCheckBox);
        waitForClickablility(getBQCheckBox);
        clickViaActionsClass(getBQCheckBox);
        waitForClickablility(getSamsungCheckBox);
        clickViaActionsClass(getSamsungCheckBox);
        waitForClickablility(getInfinixCheckBox);
        clickViaActionsClass(getInfinixCheckBox);

        return this;
    }

    public YandexAllFiltersPage clickShowAllOffers() {
        driver.findElement(showOffersButtons).click();

        return this;
    }

    public YandexAllFiltersPage setStartYear() {
        driver.navigate().back();
        WebElement getYearOfSalesDropdown = driver.findElement(yearOfSales);
        scrollToElement(getYearOfSalesDropdown);
        waitForClickablility(getYearOfSalesDropdown);
        clickViaJsExecutor(getYearOfSalesDropdown);
        WebElement getYearCheckBox = driver.findElement(yearCheckBox);
        clickViaJsExecutor(getYearCheckBox);

        return this;
    }
}
