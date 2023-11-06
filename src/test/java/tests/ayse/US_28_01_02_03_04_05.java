package tests.ayse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_28_01_02_03_04_05 extends TestBaseRapor {
    //AC: Admin bilgileri ile giriş yaptıktan sonra para çekme işlemleri bölümünde
    // ödeme yapılan kullanıcıyı, ödeme tutarını, ödeme tipini ve ödeme tarihini
    // görüntüleyebildiğimi doğrulayabilmeliyim

    HomePage homePage=new HomePage();
    @Test
    public void T01(){
        //TC01: Kullanıcı, gecerli admin bilgileriyle admin paneline erisip,
        // para cekme islemleri  menüsünü goruntuleyebileli, erisebilmeli dogrulamalidir.
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Withdraw Transactions menüsü erisilebilirlik testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(4);
        extentTest.info("Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.");

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();
        extentTest.info("Kullanici Sign in butonuna tiklar");

        //03-Login sayfasında kullanici emaili olarak gecerli admin email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Kullanici gecersiz admin emailini emailtextboxa girer.");

        //04-Login sayfasında kullanici password olarak gecerli password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Kullanici gecersiz admin passwordu passwordtextboxa girer.");

        //05-Login butonuna basarak basarili bir sekilde login olamadıgı dogrulanir.
        homePage.loginButonu.click();
        extentTest.info("Gecerli admin bilgileriyle giris yapilir.");

        //06-Menü listesinde User menüsünün gorunur, erisilebilir oldugu dogrulanır.
        softAssert.assertTrue(homePage.paraCekmeIslemleriElementiANT.isDisplayed());
        softAssert.assertTrue(homePage.paraCekmeIslemleriElementiANT.isEnabled());
        extentTest.pass("Withdraw Transactions menüsü gorunur ve erisilebilirdir.");

        softAssert.assertAll();
    }

    @Test
    public void TC02(){
        //TC02: Kullanıcı ödeme yapılan kullanıcıları goruntuleyebilmelidir.
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Withdraw Transactions odeme yapilan kullanicilari goruntuleme testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

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

        //05-Login olunur
        homePage.loginButonu.click();
        extentTest.info("Login olunur");

        //06-Menü listesinde para cekme islemleri menüsüne tiklanir.
        homePage.paraCekmeIslemleriElementiANT.click();
        extentTest.info("Withdraw Transactions menusune tiklanir.");

        //07- Acilan sayfada kullanicilar listesini goruntuledigi dogrulanir.
        List<WebElement> odemeYapilanKullanicilar = Driver.getDriver().findElements(By.xpath("//a[@class='mb-1 text-decoration-none fs-6']"));
        for (WebElement each: odemeYapilanKullanicilar
             ) {
            System.out.println(each.getText());
        }
        softAssert.assertTrue(odemeYapilanKullanicilar.size()>0);
        extentTest.pass("Withdraw Transactions menüsü kullanicilar listesi goruntulenebilir.");

        Driver.closeDriver();

        softAssert.assertAll();
    }

    @Test
    public void TC03(){
        //TC03: Kullanıcı, ödeme tutarını görüntüleyebilmelidir.
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Withdraw Transactions odeme tutari goruntuleme testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

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

        //05-Login olunur
        homePage.loginButonu.click();
        extentTest.info("Login olunur");

        //06-Menü listesinde para cekme islemleri menüsüne tiklanir.
        homePage.paraCekmeIslemleriElementiANT.click();
        extentTest.info("Withdraw Transactions menusune tiklanir.");

        //07- Acilan sayfada odeme tutari goruntuledigi dogrulanir.
        List<WebElement> odemeTutari = Driver.getDriver().findElements(By.xpath("//span[@class='badge bg-success me-2']"));
        for (WebElement each: odemeTutari
             ) {
            System.out.println(each.getText());
        }
        softAssert.assertTrue(odemeTutari.size()>0);
        extentTest.pass("Withdraw Transactions odeme tutari goruntulenebilir.");

        Driver.closeDriver();

        softAssert.assertAll();
    }

    @Test
    public void TC04(){
        //TC04: Kullanıcı, ödeme tipini görüntüleyebilmelidir.
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Withdraw Transactions odeme tipi goruntuleme testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

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

        //05-Login olunur
        homePage.loginButonu.click();
        extentTest.info("Login olunur");

        //06-Menü listesinde para cekme islemleri menüsüne tiklanir.
        homePage.paraCekmeIslemleriElementiANT.click();
        extentTest.info("Withdraw Transactions menusune tiklanir.");

        //07- Acilan sayfada odeme tipi goruntuledigi dogrulanir.
        List<WebElement> odemeTipi = Driver.getDriver().findElements(By.xpath("//span[@class='badge bg-primary me-2']"));
        int size= odemeTipi.size();
        System.out.println(size);
        softAssert.assertTrue(odemeTipi.size()>0);
        extentTest.pass("Withdraw Transactions odeme tipi goruntulenebilir.");

        Driver.closeDriver();

        softAssert.assertAll();

    }

    @Test
    public void TC05(){
        //TC05: Kullanıcı, ödeme tarihini görüntüleyebilmelidir.
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Withdraw Transactions odeme tarihi goruntuleme testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

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

        //05-Login olunur
        homePage.loginButonu.click();
        extentTest.info("Login olunur");

        //06-Menü listesinde para cekme islemleri menüsüne tiklanir.
        homePage.paraCekmeIslemleriElementiANT.click();
        extentTest.info("Withdraw Transactions menusune tiklanir.");

        //07- Acilan sayfada odeme tarihi goruntuledigi dogrulanir.
        List<WebElement> odemeTarihi = Driver.getDriver().findElements(By.xpath("//span[@class='badge bg-secondary me-2']"));
        int size= odemeTarihi.size();
        System.out.println(size);

        for (WebElement each: odemeTarihi
             ) {
            System.out.println(each.getText());;
        }

        softAssert.assertTrue(odemeTarihi.size()>0);
        extentTest.pass("Withdraw Transactions odeme tarihi goruntulenebilir.");

        Driver.closeDriver();
        softAssert.assertAll();
    }








    }






