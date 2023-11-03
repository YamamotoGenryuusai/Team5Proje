package tests.mustafa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_TC_01_02_03_04_05 {

    //TC_01-Ziyaretçi anasayfa header bölümündeki “HOME” menüsünü görebilmeli ve tıkladığında çalışmalı
    @Test void TC_01(){
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        //02- HOME butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.homeButonu.isDisplayed());
        //03-HOME butonuna tiklanir.
        homePage.homeButonu.click();
        ReusableMethods.wait(2);
        //05-Browser kapatilir.
        Driver.closeDriver();

    }
    //TC_02-Ziyaretçi anasayfa header bölümündeki “FEATURES” menüsünü görebilmeli ve tıkladığında çalışmalı
    @Test void TC_02(){
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Features butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.featuresButonu.isDisplayed());
        //03-Features butonuna tiklanir.
        homePage.featuresButonu.click();
        ReusableMethods.wait(2);
       //04-Browser kapatilir.
        Driver.closeDriver();

    }
    //TC_03-Ziyaretçi anasayfa header bölümündeki “ABOUT” menüsünü görebilmeli ve tıkladığında çalışmalı
    @Test void TC_03() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-ABOUT butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.aboutButonu.isDisplayed());
        //03-ABOUT butonuna tiklanir.
        homePage.aboutButonu.click();
        ReusableMethods.wait(2);
        //04-Browser kapatilir.
        Driver.closeDriver();

    }
    //TC_04-Ziyaretçi anasayfa header bölümündeki “PRİCİNG” menüsünü görebilmeli ve tıkladığında çalışmalı
    @Test void TC_04() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-PRİCİNG butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.pricingButonu.isDisplayed());
        //03-PRİCİNGs butonuna tiklanir.
        homePage.pricingButonu.click();
        ReusableMethods.wait(2);
        //04-Browser kapatilir.
        Driver.closeDriver();

    }
    //TC_05-Ziyaretçi anasayfa header bölümündeki “CONTACT” menüsünü görebilmeli ve tıkladığında çalışmalı
    @Test void TC_05() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-CONTACT butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.contactButonu.isDisplayed());
        //03-CONTACT butonuna tiklanir.
        homePage.contactButonu.click();
        ReusableMethods.wait(2);
        //04-Browser kapatilir.
        Driver.closeDriver();

    }
}
