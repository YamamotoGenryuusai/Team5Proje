package tests.ozan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.*;

public class US03_TC03 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    @Test
    public void test01(){
        extentTest = extentReports.createTest("Ana sayfa Contact Us bölümü Mail textbox testleri","Mail textboxı görünür ve aktif olmalıdır.");
        SoftAssert softAssert=new SoftAssert();
        extentTest.info("Tarayıcı açılır ve site ana sayfaya gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Ana sayfada Contact Us bölümüne gidilir.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.contactUsText);
        ReusableMethods.wait(2);
        extentTest.info("Mail adresinin görünür ve aktif olduğu test edilir.");
        softAssert.assertTrue(homePage.contactUsMailText.isDisplayed(),"Maid adresi görüntülenemiyor.");
        softAssert.assertTrue(homePage.contactUsMailText.isEnabled(),"Mail adresi aktif değil.");

        extentTest.pass("Mail adres yazısı görünür ve aktiftir.");
        extentTest.info("Tarayıcı kapatılır.");
        softAssert.assertAll();


    }
    @Test
    public void test02(){
        extentTest = extentReports.createTest("Ana sayfa Contact Us telefon yazı elementi testi.","Telefon görünür ve aktif olmalıdır.");
        SoftAssert softAssert=new SoftAssert();
        extentTest.info("Tarayıcı açılır site ana sayfaya gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Contact Us bölümüne gidilir.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.contactUsText);
        ReusableMethods.wait(1);
        extentTest.info("Telefon numarasının görünülürlük ve aktiflik testi yapılır.");
        softAssert.assertTrue(homePage.contactUsPhoneText.isDisplayed(),"Telefon numarası görünmüyor.");
        softAssert.assertTrue(homePage.contactUsPhoneText.isEnabled(),"Telefon numarası aktif değil.");
        extentTest.pass("Telefon numarası görünüyor ve aktif.");
        extentTest.info("Tarayıcı kapatılır.");
        softAssert.assertAll();
    }
}
