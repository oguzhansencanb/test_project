import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrunDetaySayfasi extends BasePage{

    By sepeteEkleButtonLocator = By.id("pd_add_to_cart");

    public UrunDetaySayfasi(WebDriver driver) {
        super(driver);
    }

    public void addToSepet() {
        click(sepeteEkleButtonLocator);
    }

    public boolean isOnUrunDetaySayfasi(){
        return isDisplayed(sepeteEkleButtonLocator);

    }
}
