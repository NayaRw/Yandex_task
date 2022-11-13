package tests.base;

import pages.common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.yandex_all_filters.YandexAllFiltersPage;
import pages.yandex_market_home.YandexMarketHomePage;
import pages.yandex_smartphones.YandexSmartphonesPage;
import static pages.common.Config.CLEAR_COOKIES_AND_STORAGE;
import static pages.common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected YandexMarketHomePage yandexMarketHomePage = new YandexMarketHomePage(driver);
    protected YandexSmartphonesPage yandexSmartphonesPage = new YandexSmartphonesPage(driver);
    protected YandexAllFiltersPage yandexAllFiltersPage = new YandexAllFiltersPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true)
    public void closeBrowser() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
