package tests.taha;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_018_01_02_03_04_05_06 extends TestBaseRapor {

    @Test
    public void test_karma() {

    //yapılacak olan testlerın hepsı aynı sayfada olması sebebı ıle tek test uzerınde butun testcaselerı yapıcam.
        HomePage homePage = new HomePage();
//test_01
        extentTest = extentReports.createTest("sınırsız kullanıcı send ınvıte buton testi", "send intive butonu görünür ve aktif olmalıdır.");
        extentTest.info("Browser acılır Urle gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();
        extentTest.info("Sınırsız kullanıcı hesabı ile giriş yapılır.");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        homePage.loginButonu.click();
        extentTest.pass("basarili sekilde giris yapıldı.");
        homePage.adminDeshboardtext.isDisplayed();
        //test_02
        extentTest.pass("Total active users element görüntülendi");
        homePage.totalactiveuserselement.isDisplayed();
        //test_03
        extentTest.pass("Total deactive users element görüntülendi");
        homePage.totaldeactiveuserselement.isDisplayed();
        //test_04
        extentTest.pass("total active VCards element görüntülendi");
        homePage.totalactiveVCardselement.isDisplayed();
        //test_05
        extentTest.pass("total deactive VCards element görüntülendi");
        homePage.totaldeactiveVCardselement.isDisplayed();
        //test_06
        extentTest.pass("Income elementi görüntülendi");
        homePage.ıncomeelementi.isDisplayed();
        //test_07
       extentTest.pass(" Recent Users Registration day elementi görüntülendi");
       homePage.day.isDisplayed();
       extentTest.pass("Recent Users Registration week elementi görüntülendi");
       homePage.week.click();
       homePage.week.isDisplayed();
       extentTest.pass("Recent Users Registration> month elementi görüntülendi");
       homePage.month.click();
       homePage.month.isDisplayed();
       extentTest.info("browser kapatilir");



    }
}