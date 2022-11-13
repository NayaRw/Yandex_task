package pages.yandex_market_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import pages.yandex_smartphones.YandexSmartphonesPage;

public class YandexMarketHomePage extends BasePage {
    private final By catalogButton = By.xpath("//button[@aria-label = 'Каталог']");
    private final By smartphonesButton = By.xpath("//a[text()='Смартфоны']");

    public YandexMarketHomePage(WebDriver driver) {
        super(driver);
    }

    public YandexSmartphonesPage goToAdvancedSearch() {
        driver.findElement(catalogButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement getSmartphonesButton = driver.findElement(smartphonesButton);
        waitElementIsVisible(getSmartphonesButton);
        waitForClickablility(getSmartphonesButton);
        driver.findElement(smartphonesButton).click();

        return new YandexSmartphonesPage(driver);
    }
}
