package tests.ayse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_16_01 extends TestBaseRapor {
//AC: Sınırsız kayıtlı kullanıcı olarak randevularım sayfasına ulaşabildiğimi ve
// randevuları görüntüleyebildiğimi doğrulayabilmeliyim

    HomePage homePage = new HomePage();

    @Test
    public void TC01() {
        //TC01:Kullanici, gecerli admin bilgileriyle admin paneline erisip,
        // menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir.

        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Users menüsü erisilebilirlik testi", "Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(4);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecerli admin email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecerli password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login olamadıgı dogrulanir.
        homePage.loginButonu.click();
        extentTest.info("Gecerli admin bilgileriyle giris yapilir.");

        //06-Menü listesinde User menüsünün gorunur, erisilebilir oldugu dogrulanır.
        softAssert.assertTrue(homePage.usersElementi.isDisplayed());
        softAssert.assertTrue(homePage.usersElementi.isEnabled());
        extentTest.pass("Users menüsü gorunur ve erisilebilirdir.");

        softAssert.assertAll();
        extentTest.info("Browser kapatilir.");
    }

    //TC02: Kullanici kayıtlı kullanıcılar arasından ilgili sınırsız kayıtlı
    // kullanıyıcı secip, kimligine eristigini dogrulamalıdır.

    @Test
    public void TC02() {
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Imporsonate aktiflik testi", "");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(4);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecerli admin email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecerli  admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login olunur.
        homePage.loginButonu.click();
        extentTest.info("Login butonuna tiklanir.");

        //06-Menü listesinde User menüse tiklanir.
        homePage.usersElementi.click();
        extentTest.info("Users menusune tiklanir.");

        //07-Arama butonuna tiklanir.
        homePage.usersSearchBoxANT.click();
        extentTest.info("Arama butonuna tiklanir.");

        //08-Sinirsiz kullanici adi girilir.
        homePage.usersSearchBoxANT.sendKeys("ayse");
        ReusableMethods.wait(4);
        extentTest.info("Sinirsiz kullanici aranir");

        //09-Ilgili kullanicinin impersonate butonuna tiklanir.
        homePage.impersonate.click();

        //10-Acilan sayfada kullanıcı adinin secilen kullanici adi oldugu dogrulanir.
        String expectedData = "ayse yavas";
        String actualData = homePage.userName.getText();
        softAssert.assertEquals(actualData, expectedData, "Dogru kullanici sayfasi acilamamistir.");
        extentTest.pass("Sinirsiz kayitli kullanici hesabina erisilmistir.");

        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");
    }

    //TC03: Kullanici, sectigi sınırsız kayıtlı kullanıcı panelinde randevular menüsünü görüntüleyip erisebilemelidir.
    @Test
    public void TC03() {
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Appointmen menusu aktiflik testi", "");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(4);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecerli admin email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecerli  admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login olunur.
        homePage.loginButonu.click();
        extentTest.info("Login butonuna tiklanir.");
        //06-Menü listesinde User menüse tiklanir.
        homePage.usersElementi.click();
        extentTest.info("Users menusune tiklanir.");

        //07-Arama butonuna tiklanir.
        homePage.usersSearchBoxANT.click();
        extentTest.info("Arama butonuna tiklanir.");

        //08-Sinirsiz kullanici adi girilir.
        homePage.usersSearchBoxANT.sendKeys("ayse");
        ReusableMethods.wait(4);
        extentTest.info("Sinirsiz kullanici aranir");

        //09-Ilgili kullanicinin impersonate butonuna tiklanir.
        homePage.impersonate.click();

        //10-Acilan kullanıcı panelinde randevular menüsünün goruntulendigi dogrulanir.
        softAssert.assertTrue(homePage.appointmentsElementi.isDisplayed());
        softAssert.assertTrue(homePage.appointmentsElementi.isEnabled());
        extentTest.pass("Kullanici randevu meusu gorunur ve eerisilebilirdir.");

        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");

    }

    //TC04: Kullanici, sectigi sınırsız kayıtlı kullanıcı panelinde randevular listesini görüntüleyebildigini dogrulamalidir.
    @Test
    public void TC04() {
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Appointment list goruntuleme testi", "");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecerli admin email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecerli  admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login olunur.
        homePage.loginButonu.click();
        extentTest.info("Login butonuna tiklanir.");
        //06-Menü listesinde User menüse tiklanir.
        homePage.usersElementi.click();
        extentTest.info("Users menusune tiklanir.");
        //07-Arama butonuna tiklanir.
        homePage.usersSearchBoxANT.click();
        extentTest.info("Arama butonuna tiklanir.");

        //08-Sinirsiz kullanici adi girilir.
        homePage.usersSearchBoxANT.sendKeys("ayse");
        ReusableMethods.wait(4);
        extentTest.info("Sinirsiz kullanici aranir");

        //09-Ilgili kullanicinin impersonate butonuna tiklanir.
        homePage.impersonate.click();

        //10-Acilan kullanıcı panelinde randevular menusune tiklanir.
        homePage.appointmentsElementi.click();

        //11-Randevular listesine erisildigi dogrulanır.
        List<WebElement> appointmentList = Driver.getDriver().findElements(By.xpath("//tbody/tr/td"));
        for (WebElement each : appointmentList
        ) {
            softAssert.assertTrue(homePage.appointmentsWebTable.isDisplayed());
        }

        for (WebElement each : appointmentList
        ) {
            System.out.println(each.getText());
        }
        extentTest.pass("Randuve listesi goruntulenebilir.");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");

    }
}