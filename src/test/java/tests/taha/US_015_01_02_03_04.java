package tests.taha;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

public class US_015_01_02_03_04 extends TestBaseRapor {
    @Test
    public void TC_01() {
        HomePage homePage = new HomePage();

        extentTest = extentReports.createTest("kullanıcı login testi", "Siteye giris yaptıgı dogrulanır.");
        extentTest.info("Browser acılır Urle gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();
        extentTest.info("kullanıcı hesabı ile giriş yapılır.");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailtaha"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordtaha"));
        homePage.loginButonu.click();

    }
    @Test
    public void TC_02() {
        HomePage homePage = new HomePage();

        extentTest = extentReports.createTest("kullanıcı login testi", "Siteye giris yaptıgı dogrulanır.");
        extentTest.info("Browser acılır Urle gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();
        extentTest.info("kullanıcı hesabı ile giriş yapılır.");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailtaha"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordtaha"));
        homePage.loginButonu.click();

        extentTest.info("Sayfanın header kısmındakı kullanıcı profiline tıklanır");
        homePage.kullaniciProfiliDropdownMenü.click();
        extentTest.info("Manage Subscription elementine tiklanir");
        homePage.ManageSubscriptionbutton.click();
        extentTest.info("Upgrade plan butonuna tıklanır");
        homePage.upgradeplanbutton.click();
        extentTest.info("plan yukseltme için silven plan secimi yapılır.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.Switchplanebutton1);
        homePage.Switchplanebutton1.click();
        extentTest.info("plan satın alım islemi yapılır.");
        ReusableMethods.wait(1);
        homePage.StripDropdown.click();

        homePage.Striptext.click();

        homePage.paySwitchPlanbutton.click();



        homePage.credicardnumber.sendKeys(ConfigReader.getProperty("credicardnumber"));
        homePage.date.sendKeys(ConfigReader.getProperty("day.year"));
        homePage.cvc.sendKeys(ConfigReader.getProperty("cvc"));
        homePage.cardname.sendKeys(ConfigReader.getProperty("cardname"));
        ReusableMethods.wait(2);
        homePage.pay.click();
        homePage.backtoSubscriptionsbutton.click();





    }
}