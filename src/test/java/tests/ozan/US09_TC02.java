package tests.ozan;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class US09_TC02 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Düzenlenen VCard görüntüleme testi","Kullanıcı düzenlediği vcardı görebilmeli.Fonksiyonlar görünür ve aktif olmalıdır.");
        extentTest.info("Tarayıcı açılır ana sayfaya gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String smartCardLink = Driver.getDriver().getWindowHandle();
        extentTest.info("Sign In butonuna tıklar.");
        homePage.signInButton.click();
        extentTest.info("Kullanıcı username ve password ile login olur");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPassword"));
        homePage.loginButonu.click();
        extentTest.info("Kullanıcı Dasboard bölümünde VCard butonuna tıklar");
        homePage.vcardButton.click();
        extentTest.info("Kullanıcı Preview Url'ine tıklar.");
        homePage.previewUrlButton.click();
        List<String> windowsList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("Windows Handle Değerleri =" + windowsList );
        Driver.getDriver().switchTo().window(windowsList.get(1));
        ReusableMethods.wait(3);
        extentTest.info("Fonksiyonların görünür ve aktif oldugunu test eder.");
        Assert.assertTrue(homePage.twitterButton.isDisplayed(),"Twitter butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.twitterButton.isEnabled(),"Twitter butonu aktif değil.");
        Assert.assertTrue(homePage.youtubeButton.isDisplayed(),"Youtube butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.youtubeButton.isEnabled(),"Youtube butonu aktif değil.");
        Assert.assertTrue(homePage.linkedinButtonOK.isDisplayed(),"Linkedin butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.linkedinButtonOK.isEnabled(),"Linkedin butonu aktif değil.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.youtubeButton);
        Assert.assertTrue(homePage.mailButtonOK.isDisplayed(),"Mail butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.mailButtonOK.isEnabled(),"Mail butonu aktif değil.");
        Assert.assertTrue(homePage.phoneButtonOK.isDisplayed(),"Telefon butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.phoneButtonOK.isEnabled(),"Telefon butonu aktif değil.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.hizmetlerimizText);
        Assert.assertTrue(homePage.hizmetButton.isDisplayed(),"Hizmet butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.hizmetButton.isEnabled(),"Hizmet butonu aktif değil.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.sartlarButton);
        Assert.assertTrue(homePage.sartlarButton.isDisplayed(),"Şartlar ve politikalar butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.sartlarButton.isEnabled(),"Şartlar ve politikalar butonu aktif değil.");
        extentTest.pass("Kullanıcı bütün fonksiyonları görebiliyor ve fonksiyonlanlar aktiftir.");
        Driver.quitDriver();



    }
}
