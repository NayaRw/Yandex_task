package tests.market_yandex;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import static constants.Constant.Prices.DIAGONAL_SCREEN_FROM;
import static constants.Constant.Prices.PRICE_UP_TO;
import static constants.Constant.Urls.YANDEX_MARKET_HOME_PAGE;

public class MarketYandexTest extends BaseTest {

    @Test
    public void yandexMarketTest() {
        basePage.open(YANDEX_MARKET_HOME_PAGE);
        yandexMarketHomePage.goToAdvancedSearch();
        yandexSmartphonesPage.goToAllFilters();
        yandexAllFiltersPage
                .insertUpToPrice(PRICE_UP_TO)
                .inputScreenDiagonal(DIAGONAL_SCREEN_FROM)
                .clickFiveManufacturers()
                .clickShowAllOffers();

        Assert.assertEquals((Integer) 10, yandexSmartphonesPage.checkQuantityOfElements());

        yandexAllFiltersPage
                .setStartYear()
                .clickShowAllOffers();

        System.out.println(yandexSmartphonesPage.collectTextValueFirstElement().getText());
    }
}
