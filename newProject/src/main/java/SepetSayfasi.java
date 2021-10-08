import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SepetSayfasi extends BasePage {

    By urunIsmıLocator = new By.ByClassName("rd-cart-item-code");


    public SepetSayfasi(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfUrunEklenirse() {
        return getUrunler().size() > 0;
    }
    private List<WebElement> getUrunler(){
        return findAll(urunIsmıLocator);
    }
}
