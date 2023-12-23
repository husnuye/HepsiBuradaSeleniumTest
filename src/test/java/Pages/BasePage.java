package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class BasePage {

    WebDriver driver;

    public  BasePage(WebDriver driver) {
        this.driver=driver;
    }
    public void waitId(String elementId){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
    }
    public void waitCcs(String elementCcs){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementCcs)));
    }



    /*public void waitXpath(String elementXpath){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
    }*/

    public void clickId(String clickId){
        driver.findElement(By.id(clickId)).click();
    }

    public void clickCss(String clickCss){
        driver.findElement(By.cssSelector(clickCss)).click();
    }
    /*public void clickXpath(String clickXpath){
        driver.findElement(By.xpath(clickXpath)).click();
    }
    /*public void clickXpath(String clickXpath){
        driver.findElement(By.xpath(clickXpath)).click();
    }

*/
    public void sendkeys(String elementId,String emailAdress){
        driver.findElement(By.id(elementId)).sendKeys(emailAdress);

    }
    public void sendText(String elementCss,String enterText){
        driver.findElement(By.cssSelector(elementCss)).sendKeys(enterText);

    }


    //press enter on the keyboard selenium
    /*public void clickEnterKeyboard(String elementCss, Keys klavyeTusu){
        driver.findElement(By.cssSelector(elementCss)).sendKeys(klavyeTusu);

    }

     */

}

