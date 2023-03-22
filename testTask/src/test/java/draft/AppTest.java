/*
package draft;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.time.Duration;



*/
/**
 * Unit test for simple App.
 *//*

public class AppTest extends MainTest {
    @Test
    public void appTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element1 = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='enter-mail-primary']")));
        element1.click();
        WebElement iframe = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']")));
        driver.switchTo().frame(iframe);
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='username']")));
        element2.sendKeys("example-2024@mail.ru");
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='next-button']")));
        element3.click();
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='password']")));
        element4.sendKeys("Example44_rus");
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='submit-button']")));
        element5.click();

        WebElement el1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class^='compose-button']")));
        el1.click();
        WebElement el2 = wait
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(" div[class^='container--ItIg4']>div>input[class^='container--H9L5q']")));
        el2.sendKeys("example-2024@mail.ru");
        WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class^='container--3QXHv']>div>input[class^='container--H9L5q']")));
        el3.sendKeys("Выполнение тестовго задания");
        WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class*='cke_editable_inline']>div")));
        el4.sendKeys("Я сделал тестовое задание, спасибо за возможность");

        WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='send']")));
        el5.click();

        WebElement el6 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[class='layer__link']")));
        Assert.assertEquals("Письмо отправлено", el6.getText());
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}*/
