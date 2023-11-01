package tests.ozan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_03_TC01 extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Ana sayfa Get Started buton testi","Get Started butonu görünür,aktif ve ilgili sayfaya yönlendirmelidir.");
        SoftAssert softAssert=new SoftAssert();
        HomePage homePage=new HomePage();
        extentTest.info("Tarayıcı açılır site ana sayfasına gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Get Started butonunun görünülürlüğü test eder.");
        softAssert.assertTrue(homePage.getStartedButton.isDisplayed(),"Get Started butonu görünmüyor.");
        extentTest.pass("Get Started butonu görünürlülük testi başarılı.");
        extentTest.info("Get Started butonunun aktifliğini test eder.");
        homePage.getStartedButton.click();
        String expectedUrl="https://qa.smartcardlink.com/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Buton aktif değil ilgili sayfaya yönlendirmiyor.");
        extentTest.pass("Get Started butonu görülebilir,aktif ve ilgili sayfaya yönlendirir.");
        softAssert.assertAll();
    }

}
