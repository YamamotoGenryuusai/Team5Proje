package tests.ayse;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_06_TC01_03 extends TestBaseRapor {

    HomePage homePage=new HomePage();

    //TC_01: Kullanici anasayfada Sıgn In butonunu gorebilmeli ve tikladiginda login sayfasina erisebilmelidir.
    @Test
    public void TC01(){

        extentTest=extentReports.createTest("Sing in butonu erisilebilirlik testi","Kullanici anasayfada Sıgn In butonunu gorebilmeli ve tikladiginda login sayfasina erisebilmelidir.");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonu gorunurlugu dogrulanir.
        Assert.assertTrue(homePage.signInButton.isDisplayed());
        extentTest.pass("Sign in butonu gorunurdur.");

        //03-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //04-Login sayfasının acildigi dogrulanir.
        Assert.assertTrue(homePage.loginButonu.isDisplayed());
        extentTest.pass("Login sayfasina erisildigi dogrulanır.");

        //05-Browser kapatilir.
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");
    }

    @Test
    public void TC02(){
        //TC02: Kullanıcı email, password textbox ve log ın butonunu görebilmelidir.
        extentTest=extentReports.createTest("Login butonu ve email, password textbox erisilebilirlik testi","Kullanıcı email, password kutucuğu ve log ın butonunu görebilmelidir.");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında email kutucugu görünür ve aktif dogrulanir.
        Assert.assertTrue(homePage.emailtextBox.isDisplayed());
        Assert.assertTrue(homePage.emailtextBox.isEnabled());
        extentTest.pass("Emailtextbox gorunur ve aktifdir.");

        //04-Login sayfasında password kutucugu görünürlügü dogrulanir.
        Assert.assertTrue(homePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(homePage.passwordTextBox.isEnabled());
        extentTest.pass("Passwordtextbox gorunur ve aktifdir.");

        //05-Login sayfasında login butonunun görünürlügü dogrulanir.
        Assert.assertTrue(homePage.loginButonu.isDisplayed());
        Assert.assertTrue(homePage.loginButonu.isEnabled());
        extentTest.pass("Login butonu gorunur ve aktifdir.");

        //06-Browser kapatilir.
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");

    }

    @Test
    public void TC03(){
        //TC03: Kullanıcı gecerli email ve password bilgileriyle basarili giris yapabilmelidir.
        extentTest=extentReports.createTest("Basarili login testi","Kullanici gecerli email ve password bilgileriyle basarili giris yapabilmelidir.");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecerli email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmail"));
        extentTest.info("Kullanici gecerli admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecerli password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPassword"));
        extentTest.info("Kullanici gecerli admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login oldugu dogrulanir.
        homePage.loginButonu.click();
        extentTest.info("Login butonuna tiklar.");
        Assert.assertTrue(homePage.dashboardHearderTextANT.isDisplayed());
        extentTest.pass("Kullanici dashboard acildigi dogrulanir.");

        //06-Browser kapatilir.
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");

    }

    @Test
    public void TC04(){
        //TC04: Kullanıcı gecersiz email ve password bilgileriyle basarili giris yapamalidir.
        extentTest=extentReports.createTest("Basarisiz login testi","Kullanici gecersiz email ve password bilgileriyle basarili giris yapamalidir.");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecersiz email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecersizEmail"));
        extentTest.info("Kullanici gecersiz admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecersiz password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecersizPassword"));
        extentTest.info("Kullanici gecersiz admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login olamadıgı dogrulanir.
        homePage.loginButonu.click();
        extentTest.info("Login butonuna tiklar.");
        Assert.assertTrue(homePage.basarisizGirisTextiANT.isDisplayed());
        extentTest.pass("Kullanici login olamadigi dogrulanir.");

        //06-Browser kapatilir.
        Driver.closeDriver();
        extentTest.info("Browser kapatilir.");
    }


}
