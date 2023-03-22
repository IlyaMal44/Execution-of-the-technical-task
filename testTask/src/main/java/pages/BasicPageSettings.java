package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;


import java.time.Duration;

import static constant.Сonstant.*;

public class BasicPageSettings {
    protected WebDriver driver;

    public BasicPageSettings(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public WebElement waitPresenceOfElementLocated(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.
                cssSelector(String.valueOf(element))));
        return element;
    }


    @BeforeTest
    public static WebDriver settingsDriver() {
        WebDriver driver = null;
        ChromeOptions options = null;
        switch (BROWSER_USED) {
            case "windows_chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver(options);
                options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                break;
            default:
                Assert.fail("Запуск отсутствует ");
        }
        driver.manage().window().maximize();
        return driver;
    }


    public void open(String url) {
        if (CLOSE_BROWSER) {
            driver.get(url);
        }
    }

}