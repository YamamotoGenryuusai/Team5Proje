package tests.gulay.US_05;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_01 {
    //Kullanici Sign in butonuna tıkladığında log in sayfasına ulaşım sağlanabilmelidir.
    @Test
    public void TC01 (){

//1-	Browser acilir
//2-	Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir.3-	Sitenin ana sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        //4-	Sign in butonuna tıklanır
        HomePage homePage= new HomePage();
        homePage.signInButton.click();
        //5-	Log in sayfasına ulaşıldığı dogrulanır.
        Assert.assertTrue(homePage.loginButonu.isDisplayed());
        ReusableMethods.wait(2);

        Driver.closeDriver();

    }
}
