import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class AnaSayfa extends BasePage {

    SearchBox searchBox;
    By sepetCountLocator = By.className("spanCart cart-item-count header-cart-quantity");
    By sepetContainerLocator = By.className("header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims");

    public AnaSayfa(WebDriver driver) {
        super(driver);
        searchBox= new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isUrunSayisiUp(){
        return getSepetSayisi()>0;


    }

    public void goToSepet() {
        click(sepetContainerLocator);
    }
    private int getSepetSayisi(){
        String sayi = find(sepetCountLocator).getText();
        return Integer.parseInt(sayi);
    }
}
