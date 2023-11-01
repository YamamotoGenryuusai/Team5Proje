package tests.ayse;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_29 {
    HomePage homePage = new HomePage();
    AdminDashboard adminDashboard = new AdminDashboard();

    //TC01: Kullanıcı, gecerli admin bilgileriyle admin paneline erisip, para
    // birimleri menüsü görüntüleyebilmelidir.
    @Test
    public void TC01() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();

        //03-Login sayfasinda email kutucuguna admin emaili girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

        //04-Login sayfasinda password kutucuguna admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        //05-Login butonuna tiklanir.
        homePage.loginButonu.click();

        //06-Menü listesinde para birimleri menüsünün görünür oldugu dogrulanır.
        adminDashboard.paraBirimleriElementiANT.isDisplayed();

        Driver.closeDriver();
    }

        //TC02: Kullanıcı para birimleri listesinin sonuc yazisini goruntuleyebilmelidir.

        @Test
        public void TC02(){
            //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            ReusableMethods.wait(4);

            //02-Sign In butonuna tiklanir.
            homePage.signInButton.click();

            //03-Login sayfasinda email kutucuguna admin emaili girilir.
            homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

            //04-Login sayfasinda password kutucuguna admin password girilir.
            homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

            //05-Login butonuna tiklanir.
            homePage.loginButonu.click();

            //06-Menü listesinde para birimleri menüsüne tiklanir.
            adminDashboard.paraBirimleriElementiANT.click();

            //07- Acilan sayfada sonuc yazisinin gorunur oldugu dogrulanir.
            String expectedParaBirimleriSayisi= "135";
            String actualParaBirimleriSayisi=adminDashboard.paraBirimleriSayisiElementiANT.getText();
            Assert.assertEquals(expectedParaBirimleriSayisi, actualParaBirimleriSayisi);

            //06-Browser kapatilir.
            Driver.closeDriver();
        }


    }

