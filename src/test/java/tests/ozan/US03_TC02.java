package tests.ozan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.*;

public class US03_TC02 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    @Test
    public void test01() {
        extentTest = extentReports.createTest("Ana sayfa Choose Plan butonu testi","Choose Plan butonu aktif,görünür ve ilgili sayfaya yönlendirmelidir.");
        SoftAssert softAssert = new SoftAssert();
        extentTest.info("Site ana sayfasına gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Choose Plan bölümüne gelinir");
        JSUtilities.scrollToElement(Driver.getDriver(), homePage.choosePlan10);
        ReusableMethods.wait(1);
        extentTest.info("Choose paln butonunun gürünülürlüğünü test eder.");
        softAssert.assertTrue(homePage.choosePlan10.isDisplayed(), "Choose Plan butonu görünür değil.");
        extentTest.pass("Choose Plan butonu görünür.");
        ReusableMethods.wait(1);
        homePage.choosePlan10.click();
        ReusableMethods.wait(1);
        extentTest.info("Tıklandığında ilgili sayfaya yönlendirir.");
        String expectedUrl = "https://qa.smartcardlink.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Choose Plan butonu doğru sayfaya yönlendirmiyor.");
        softAssert.assertAll();
        extentTest.pass("Choose Plan butonu görünür,aktif ve ilgili sayfaya yönlendirir.");
    }
    @Test
    public void test02(){
        extentTest=extentReports.createTest("Plan seçim tuş testi","Plan seçim tusları görünür ve aktif olmalıdır.");
        SoftAssert softAssert=new SoftAssert();
        extentTest.info("Tarayıcı açılır site ana sayfasına gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Ana sayfa Choose plan bölümüne kadar gelinir.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.chosePlanStandardText);
        ReusableMethods.wait(1);
        extentTest.info("Plan seçim butonu testleri yapılır.");
        homePage.choosePlanKaydirma.click();
        ReusableMethods.wait(1);
        softAssert.assertTrue(homePage.choosePlanGoldText.isDisplayed());
        extentTest.pass("Plan kaydırma butonu görünür ve aktiftir.");
        softAssert.assertAll();
        extentTest.info("Tarayıcı kapatılır.");
    }
}
