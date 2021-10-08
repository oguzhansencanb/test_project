import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_Urun_Ekleme extends BasePage{
    AnaSayfa anaSayfa;
    UrunSayfasi urunSayfasi;
    UrunDetaySayfasi urunDetaySayfasi;
    SepetSayfasi sepetSayfasi;

    public Test_Urun_Ekleme(WebDriver driver) {
        super(driver);
    }

    @Order(1)
    @Test
    public void search_urun(){
        anaSayfa = new AnaSayfa(driver);
        urunSayfasi = new UrunSayfasi(driver);
        anaSayfa.searchBox().search("pantolan");
        Assertions.assertTrue(urunSayfasi.isOnurunSayfasi() ,
                "Ürün sayfasında değilsiniz.");

    }
    @Order(2)
    @Test
    public void select_urun(){
        urunDetaySayfasi = new UrunDetaySayfasi(driver);
        urunSayfasi.selectUrun(3);
        Assertions.assertTrue(urunDetaySayfasi.isOnUrunDetaySayfasi(),
                "Ürün detay sayfasında değilsiniz.");

    }
    @Order(3)
    @Test
    public void add_urun_to_sepet(){
        urunDetaySayfasi.addToSepet();
            Assertions.assertTrue(anaSayfa.isUrunSayisiUp(),
                "Ürün eklenmemiştir.");

    }
    @Order(4)
    @Test
    public void go_to_sepet(){
        sepetSayfasi = new SepetSayfasi(driver);
        anaSayfa.goToSepet();
        Assertions.assertTrue(sepetSayfasi.checkIfUrunEklenirse(),
                "Ürün sepete eklenmedi.");


    }
}

