package tests.gulay.US_10;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_10_TC_01 extends TestBaseRapor {
    SoftAssert softAssert= new SoftAssert();

    @Test
    public void US10_TC_01 (){
        extentTest=extentReports.createTest("gecerli kullanici bilgileri ile giris yapabilme");

        Driver.getDriver().get(ConfigReader.getProperty("scLoginUrl_gg"));
        extentTest.info("Browser acilir, Adres çubuğuna log in URL girilir, Enter tusuna tiklanir. Log in gidilir");

        UserDashboard userDashboard = new UserDashboard();
        HomePage homePage= new HomePage();


       homePage.emailtextBox.sendKeys(ConfigReader.getProperty("gecerliEMail_gg"));
       extentTest.info(" Email alanına geçerli email girilir");


      homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("gecerliSifre_gg"));
       extentTest.info("Password alanına gecerli password girilir");


           homePage.loginButonu.click();
           extentTest.info("Log in butonuna tiklanir");


     softAssert.assertTrue(homePage.adminDashboardText_gg.isDisplayed());
     extentTest.pass("Dashboard yazısının  görüntülendiği dogrulandi");

        // NOT: Dogru kullanici adı ve sifre ile giris yapilsa da bazen kullanici bulunamadıgına dair hata veriyor.
        // Uyelik işlemini yenileyince düzeliyor.




    }




}
