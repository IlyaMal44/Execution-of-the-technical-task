package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class PersonalAccountPage extends  BasicPageSettings{
    public PersonalAccountPage(WebDriver driver) {
        super(driver);
    }
    private final WebElement writeLetterButton = (WebElement) By.cssSelector("a[class^='compose-button']");
    private final WebElement addressSendLetter = (WebElement) By.cssSelector("//iframe[@class='ag-popup__frame__layout__iframe']");
    private final WebElement subjectLetter = (WebElement) By.cssSelector("input[name='username']");
    private final WebElement textInBodyLetter = (WebElement) By.cssSelector("button[data-test-id='next-button']");
    private final WebElement sendLetterButton  = (WebElement) By.cssSelector("input[name='password']");
    private final WebElement textMatchingCheck = (WebElement) By.cssSelector("button[data-test-id='submit-button']");


    public PersonalAccountPage sendLetter (){
        waitElementToBeClickable(writeLetterButton).click();
        waitElementToBeClickable(addressSendLetter).sendKeys("example-2024@mail.ru");
        waitElementToBeClickable(subjectLetter).sendKeys("Выполнение тестового задания");
        waitElementToBeClickable(textInBodyLetter).sendKeys("Я сделал тестовое задание, спасибо за возможность");
        waitElementToBeClickable(sendLetterButton).click();
        waitPresenceOfElementLocated(textMatchingCheck);
        Assert.assertEquals("Письмо отправлено", textMatchingCheck.getText());
        return this;
    }
}