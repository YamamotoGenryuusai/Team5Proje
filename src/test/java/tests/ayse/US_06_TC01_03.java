package tests.ayse;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_06_TC01_03 {


    //TC_01: Kullanıcı anasayfada Sıgn In butonunu görebilmeli ve tıkladığında sayfaya erişebilmelidir.


    @Test
    public void loginTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        ReusableMethods.wait(2);
        Driver.closeDriver();




    }





}
