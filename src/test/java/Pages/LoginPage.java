package Pages;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public final String emailAdress= "txtUserName"; //email text area
    public final String enterButton ="btnLogin"; // giris yap button

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
