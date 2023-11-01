package tests.gulay.US_10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_10_TC_09 {
    SoftAssert softAssert= new SoftAssert();
    @Test
    public void US_10_09 () {


        //1-	Browser acilir
        //2-	Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir.
        // 3-	Sitenin log in  sayfasina gidilir

        Driver.getDriver().get(ConfigReader.getProperty("scLoginUrl_gg"));

        UserDashboard userDashboard = new UserDashboard();
        HomePage homePage= new HomePage();
        // 4-	 Email alanına geçerli email girilir

        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("gecerliEMail_gg"));


        // 5-   Password alanına gecerli password girilir

        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("gecerliSifre_gg"));


        // 6- Log in butonuna tiklanir

        homePage.loginButonu.click();

        // 7 	Enquiries butonuna tıklanır

        homePage.adminEnquiriesText_gg.click();

        // 8-	Enquries sayfasında delete ikonuna tıklanır
        homePage.enquiriesSayfasiDeleteIkonu_gg.click();

        ReusableMethods.wait(1);
        //9- Yes Delete Butonuna tiklar
        homePage.deletePenceresiYesDeleteButonu.click();

        //10- Mesajın silindigini dogrular

        softAssert.assertTrue(homePage.deletePenceresiYesDeleteButonu.isDisplayed());
        Driver.closeDriver();

    }


}
