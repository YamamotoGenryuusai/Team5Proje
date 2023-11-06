package tests.gulay.US_05;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_05_TC_02 extends TestBaseRapor {
    @Test
    public void TC_05_02 () {
        extentTest=extentReports.createTest("Create an account sayfasi goruntuleme testi");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("\"Browser acilir, Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir. Sitenin ana sayfasina gidilir\"");
        ReusableMethods.wait(2);

        HomePage homePage= new HomePage();
        homePage.signInButton.click();
        extentTest.info("Sign in butonuna tıklanır");

        homePage.createAnAccountLinkgg.click();
        extentTest.info("Create an account butonu tıklanır");

        Assert.assertTrue(homePage.createAnAccountTextgg.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Create an account sayfasına ulasildi");

    }
}
