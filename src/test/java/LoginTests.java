import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private MainPage mainPage; // make object
    private LoginPage loginPage; //make object
    @BeforeEach
    void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        mainPage =new MainPage(driver);
        loginPage =new LoginPage(driver);
        driver.get("https://www.hepsiburada.com/");
    }
    @Test
    void hepsiburadaLoginTest () {
        // clik login button on main page
        mainPage.waitId(mainPage.myAccount); //girisyapbutton on mainpage
        mainPage.clickId(mainPage.myAccount);
        //driver.findElement(By.id("login")).click();
        mainPage.waitId(mainPage.login); // girisyap button dropdown menu
        mainPage.clickId(mainPage.login);

        //enter email adress in login page
        loginPage.waitId(loginPage.emailAdress);
        loginPage.sendkeys(loginPage.emailAdress, "test2212223@gmail.com");
        //click enter Login button
        loginPage.waitId(loginPage.enterButton);
        loginPage.clickId(loginPage.enterButton);

    }

    @Test

    void searchProductTest(){

        //click search button main page
        mainPage.waitCcs(mainPage.search);
        mainPage.clickCss(mainPage.search);

        //sent text: araba in search button
        mainPage.waitCcs(mainPage.enterText);
        mainPage.sendText(mainPage.enterText,"araba");

         //click ARA button in main page
        mainPage.waitCcs(mainPage.searchButton);

        //press enter on keyboard , it works the same as ARA button on search area
        //mainPage.clickEnterKeyboard(mainPage.search, Keys.ENTER);

        mainPage.clickCss(mainPage.searchButton);

    }
    @AfterEach
    void tearDown(){
        driver.close();
    }



}
