package tests.ayse;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_06_TC01_03 {


    //TC_01: Kullanıcı anasayfada Sıgn In butonunu görebilmeli ve tıkladığında sayfaya erişebilmelidir.
    @Test
    public void loginTesti(){
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonu gorunurlugu dogrulanir.
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.signInButton.isDisplayed());

        //03-Sign In butonuna tiklanir.
        homePage.signInButton.click();

        //04-Login sayfasının acildigi dogrulanir.
        Assert.assertTrue(homePage.loginButonu.isDisplayed());

        //05-Browser kapatilir.
        Driver.closeDriver();
    }





}
