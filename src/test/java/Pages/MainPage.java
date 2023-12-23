package Pages;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    // final variable does not change in other pages
    public final String myAccount ="myAccount";//girisyapbutton on mainpage myAccount
    public final String login ="login";  // girisyap button dropdown menu

    public final String search =".searchBoxOld-M1esqHPyWSuRUjMCALPK"; //search button CSS selector

    public final String enterText ="[placeholder='Ürün, kategori veya marka ara']"; //CSS selector

    public final String searchButton= ".searchBoxOld-yDJzsIfi_S5gVgoapx6f";  //arabutton CSS selector


    public MainPage(WebDriver driver) {
        super(driver);
    }
}
