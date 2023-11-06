package tests.ayse;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_29_01_02 extends TestBaseRapor {
    HomePage homePage = new HomePage();
    AdminDashboard adminDashboard = new AdminDashboard();

    //TC01: Kullanici, gecerli admin bilgileriyle admin paneline erisip,
    // menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli dogrulamalidir.
    @Test
    public void TC01() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        extentTest=extentReports.createTest("Currencies menusu erisebilirlik testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli dogrulamalidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasinda email kutucuguna admin emaili girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

        //04-Login sayfasinda password kutucuguna admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

        //05-Login butonuna tiklanir.
        homePage.loginButonu.click();
        extentTest.info("Login butonuna tiklar.");

        //06-Menü listesinde para birimleri menüsünün görünür oldugu dogrulanır.
        adminDashboard.paraBirimleriElementiANT.isDisplayed();
        extentTest.pass("Currencies menusu aktif ve erisilebilirdir.");

        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");
    }

        //TC02: Kullanıcı para birimleri listesinin sonuc yazisini goruntuleyebilmelidir.
    @Test
        public void TC02(){
            extentTest=extentReports.createTest("Para birimi sayisi testi","Kullanıcı para birimleri listesinin sonuc yazisini goruntuleyebilmelidir.");
            //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            ReusableMethods.wait(4);
            extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

            //02-Sign In butonuna tiklanir.
            homePage.signInButton.click();
            extentTest.info("Kullanici Sign in butonuna tiklar");

            //03-Login sayfasinda email kutucuguna admin emaili girilir.
            homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
            extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

            //04-Login sayfasinda password kutucuguna admin password girilir.
            homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
            extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

            //05-Login butonuna tiklanir.
            homePage.loginButonu.click();
            extentTest.info("Login butonuna tiklar.");

            //06-Menü listesinde para birimleri menüsüne tiklanir.
            adminDashboard.paraBirimleriElementiANT.click();
            extentTest.info("Currencies menusune tiklar.");


            //07- Acilan sayfada sonuc yazisinin gorunur oldugu dogrulanir.
            String expectedParaBirimleriSayisi= "135";
            String actualParaBirimleriSayisi=adminDashboard.paraBirimleriSayisiElementiANT.getText();
            Assert.assertEquals(expectedParaBirimleriSayisi, actualParaBirimleriSayisi);
            extentTest.pass("Para birimleri sayısı goruntelenir ve dogrudur.");

            //06-Browser kapatilir.
            Driver.closeDriver();
            extentTest.info("Browser kapatilir.");
        }


    }


