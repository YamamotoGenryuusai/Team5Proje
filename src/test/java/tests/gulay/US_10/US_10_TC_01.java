package tests.gulay.US_10;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_10_TC_01 {
    SoftAssert softAssert= new SoftAssert();

    @Test
    public void US10_TC_01 (){

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

        // 7- Dashboard yazısının  görüntülendiği dogrulanır


     softAssert.assertTrue(homePage.adminDashboardText_gg.isDisplayed());

       Driver.closeDriver();


        // NOT: Dogru kullanici adı ve sifre ile giris yapilsa da bazen kullanici bulunamadıgına dair hata veriyor.
        // Uyelik işlemini yenileyince düzeliyor.




    }




}
