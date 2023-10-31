package tests.gulay.US_05;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_02 {
    @Test
    public void TC_05_02 () {

        //1-	Browser acilir
        //2-	Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir.3-Sitenin ana sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        //4-	Sign in butonuna tıklanır
        HomePage homePage= new HomePage();
        homePage.signInButton.click();
        //5-	Create an account butonu tıklanır
        homePage.createAnAccountLinkgg.click();
        // 6-	Create an account sayfasına ulasildigi dogrulanir
        Assert.assertTrue(homePage.createAnAccountTextgg.isDisplayed());
        ReusableMethods.wait(2);
        Driver.closeDriver();

    }
}
