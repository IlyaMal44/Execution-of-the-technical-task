package test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.BasicPageSettings;
import pages.PersonalAccountPage;
import pages.WelcomePage;

import static constant.Сonstant.*;
public class SettingsTest {
    protected WebDriver driver = BasicPageSettings.settingsDriver();
    protected BasicPageSettings basicPageSettings = new BasicPageSettings(driver);
    protected WelcomePage welcomePage = new WelcomePage(driver);
    protected PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);


    @AfterTest
    public void clearСookiesАndСache(){
        if (CLEAR_COOKIES_CACHE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterSuite (alwaysRun = true)
    public  void close () {
        if (OPEN_BROWSER) {
            driver.quit();
        }
    }
}


