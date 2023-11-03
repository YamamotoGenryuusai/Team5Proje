package tests.gulay.US_05;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_05_TC_01 extends TestBaseRapor {
    //Kullanici Sign in butonuna tıkladığında log in sayfasına ulaşım sağlanabilmelidir.
    @Test
    public void TC01 (){
        extentTest=extentReports.createTest("Log in sayfasi testi", "Kullanici Sign in butonuna tıkladığında log in sayfasına ulaşım sağlanabilmelidir.");

//1-	Browser acilir
//2-	Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir.3-	Sitenin ana sayfasina gidilir

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Browser acilir, Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir. Sitenin ana sayfasina gidilir");
        ReusableMethods.wait(2);
        HomePage homePage= new HomePage();
        homePage.signInButton.click();
        extentTest.info("Sign in butonuna tıklanır");
        Assert.assertTrue(homePage.loginButonu.isDisplayed());
        extentTest.info("Log in sayfasi goruntuleme testi basarili");
        ReusableMethods.wait(2);

    }
}
