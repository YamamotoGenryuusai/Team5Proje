package tests.mustafa;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_34_TC_01 {

    @Test
    void TC_01() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasinda email kutucuguna admin emaili girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

        //04-Login sayfasinda password kutucuguna admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        //05-Login butonuna tiklanir.
        homePage.loginButonu.click();

        //06-front cms tıklanır
        homePage.Front_CMS.click();
        ReusableMethods.wait(2);
        //07- subscribeers tıklanır ve haber aboneleri görüntülenir
        homePage.subscribeers.click();
        ReusableMethods.wait(3);



        //08-admin haber abonelerini silebildiğini doğrulamalı


        //08-Browser kapatilir.
        Driver.closeDriver();

    }
}
