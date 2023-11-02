package tests.ozan;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

public class US03_TC06 extends TestBaseRapor {
    HomePage homePage=new HomePage();

    @Test
    public void test01(){
        extentTest=extentReports.createTest("Stories From Our Customers bölümü buton testi","bölümdeki butonlar görüntülenebilir ve aktif olup işlevlerini yerine getirebilmelidir.");
        extentTest.info("Tarayıcı açılır ana sayfaya gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Ana sayfada Stories From Our Customers bölümüne gidilir");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.storiesFOCText);
        extentTest.info("Butonların testini yapar.");
        homePage.storiesTabButton2.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.storiesYorumText1.isDisplayed(),"Tıklanılan yorum satırı görüntülenemiyor.");
        homePage.storiesTabButton3.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.storiesYorumText2.isDisplayed(),"Tıklanılan yorum satırı görüntülenemiyor.");
        extentTest.pass("Butonlar aktif,görüntülenebilir ve işlevini yerine getirir.");
        extentTest.info("Tarayıcı kapatılır.");
    }
}
