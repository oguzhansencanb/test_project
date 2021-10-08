import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UrunSayfasi extends BasePage {

    By filtreLocator = By.id("filter-label");
    By urunBaslikLocator = By.className("title");

    public UrunSayfasi(WebDriver driver) {
        super(driver);
    }

    public boolean isOnurunSayfasi() {
        return isDisplayed(filtreLocator);
    }

    public void selectUrun(int i) {
        getAllUrunler().get(3).click();

    }
    private List<WebElement> getAllUrunler(){
        return findAll(urunBaslikLocator);
    }
}
