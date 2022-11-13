package pages.yandex_smartphones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

public class YandexSmartphonesPage extends BasePage {

    public YandexSmartphonesPage(WebDriver driver) {
        super(driver);
    }

    private By allFiltersButton = By.xpath("//a[@data-auto='allFiltersButton']");
    private By listOfSmartphones = By.xpath("//div[@class = '_2C8uu']");

    public YandexSmartphonesPage goToAllFilters() {
        driver.findElement(allFiltersButton).click();
        return this;
    }

    public Integer checkQuantityOfElements() {
        List<WebElement> getListOfSmartphones = driver.findElements(listOfSmartphones);
        int elementsCount = getListOfSmartphones.size();
        System.out.println("Total Number of Elements : " + elementsCount);

        return elementsCount;
    }

    public WebElement collectTextValueFirstElement() {
        List<WebElement> getListOfSmartphones = driver.findElements(listOfSmartphones);
        WebElement firstElement = getListOfSmartphones.get(0);

        return firstElement;
    }
}
