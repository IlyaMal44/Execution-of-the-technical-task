package test;

import org.testng.annotations.Test;

import static constant.Сonstant.PAGE_ADRESS;

public class LogPersonalAccountTest extends SettingsTest {

        @Test
        public void start() {
            basicPageSettings.open(PAGE_ADRESS);
            welcomePage.logPersonalAccount();
            personalAccountPage.sendLetter();
        }
    }
