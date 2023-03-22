package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WelcomePage extends BasicPageSettings {
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    private final WebElement LoginButtonOnWelcomePage = (WebElement) By.cssSelector("button[data-testid='enter-mail-primary']");
    private final WebElement iframe = (WebElement) By.cssSelector("iframe[class='ag-popup__frame__layout__iframe']");
    private final WebElement accountName = (WebElement) By.cssSelector("input[name='username']");
    private final WebElement enterPasswordButton = (WebElement) By.cssSelector("button[data-test-id='next-button']");
    private final WebElement accountPassword = (WebElement) By.cssSelector("input[name='password']");
    private final WebElement logInButton = (WebElement) By.cssSelector("button[data-test-id='submit-button']");


    public WelcomePage logPersonalAccount() {
        waitElementToBeClickable(LoginButtonOnWelcomePage).click();
        waitPresenceOfElementLocated(iframe);
        driver.switchTo().frame(iframe);
        waitElementToBeClickable(accountName).sendKeys("example-2024@mail.ru");
        waitElementToBeClickable(enterPasswordButton).click();
        waitElementToBeClickable(accountPassword).sendKeys("Example44_rus");
        waitElementToBeClickable(logInButton).click();
        return this;
    }

}