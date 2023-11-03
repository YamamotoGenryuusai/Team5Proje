package tests.ayse;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_06_TC01_03 {

    //TC_01: Kullanıcı anasayfada Sıgn In butonunu görebilmeli ve tıkladığında sayfaya erişebilmelidir.
    @Test
    public void TC01(){
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.signInButton.isDisplayed());

        //03-Sign In butonuna tiklanir.
        homePage.signInButton.click();

        //04-Login sayfasının acildigi dogrulanir.
        Assert.assertTrue(homePage.loginButonu.isDisplayed());

        //05-Browser kapatilir.
        Driver.closeDriver();
    }

    @Test
    public void TC02(){
        //TC02: Kullanıcı email, password kutucuğu ve log ın butonunu görebilmelidir.

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasında email kutucugu görünürlüğü dogrulanir.
        Assert.assertTrue(homePage.emailtextBox.isDisplayed());

        //04-Login sayfasında password kutucugu görünürlügü dogrulanir.
        Assert.assertTrue(homePage.passwordTextBox.isDisplayed());

        //05-Login sayfasında login butonunun görünürlügü dogrulanir.
        Assert.assertTrue(homePage.loginButonu.isDisplayed());

        //06-Browser kapatilir.
        Driver.closeDriver();

    }

    @Test
    public void TC03(){
        //TC03: Kullanıcı gecerli email ve password bilgileriyle basarili giris yapabilmelidir.

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasında kullanici emaili olarak gecerli email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmail"));

        //04-Login sayfasında kullanici password olarak gecerli password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPassword"));

        //05-Login butonuna basarak basarili bir sekilde login oldugu dogrulanir.
        homePage.loginButonu.click();
        Assert.assertTrue(homePage.dashboardHearderText.isDisplayed());

        //06-Browser kapatilir.
        Driver.closeDriver();

    }

    @Test
    public void TC04(){
        //TC04: Kullanıcı gecersiz email ve password bilgileriyle basarili giris yapamalidir.

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasında kullanici emaili olarak gecersiz email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecersizEmail"));

        //04-Login sayfasında kullanici password olarak gecersiz password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecersizPassword"));

        //05-Login butonuna basarak basarili bir sekilde login olamadıgı dogrulanir.
        homePage.loginButonu.click();
        Assert.assertTrue(homePage.basarisizGirisTexti.isDisplayed());

        //06-Browser kapatilir.
        Driver.closeDriver();
    }


}
