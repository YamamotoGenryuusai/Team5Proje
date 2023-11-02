package tests.ozan;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

public class US03_TC04 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    Faker faker=new Faker();
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Home page Subscribe here textbox ve buton testi","Subscribe here kısmındaki email text box ve Subscribe butonlarının görünür ve işlevsel olduğu test edilir.");
        extentTest.info("Tarayıcı açılır site ana sayfasına gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Ana sayfadaki Subscribe here bölümüne gidilir.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.contactUsPhoneText);
        extentTest.info("Mail textbox'ının görünür ve aktif olduğunu test eder.");
        Assert.assertTrue(homePage.subscribeHereMailBox.isDisplayed(),"Mail textbox görüntülenemiyor.");
        Assert.assertTrue(homePage.homePageSubjectTextBox.isEnabled(),"Mail textbox aktif değildir.");
        extentTest.pass("Mail textbox görünür ve aktiftir.");
        extentTest.info("Subscribe butonunun görünür ve aktif oldugunu test eder.");
        Assert.assertTrue(homePage.subscribeHereSubscribeButton.isDisplayed(),"Subscribe butonu görüntülenemiyor.");
        Assert.assertTrue(homePage.subscribeHereSubscribeButton.isEnabled(),"Subscribe butonu aktif değil.");
        extentTest.pass("Subscribe butonu görünür ve aktiftir.");
        extentTest.info("Mail gönderim testini yapar.");
        homePage.subscribeHereMailBox.sendKeys(faker.internet().emailAddress());
        homePage.subscribeHereSubscribeButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.subscribeHereBildirim.isDisplayed());
        extentTest.pass("Mail gönderim testi başarılı.");
        extentTest.info("Tarayıcı kapatılır.");



    }
}
