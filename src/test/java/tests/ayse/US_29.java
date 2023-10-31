package tests.ayse;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_29 {
    //TC01: Kullanıcı, gecerli admin bilgileriyle admin paneline erisip, para
    // birimleri menüsü görüntüleyebilmelidir.

    @Test
    public void TC01(){
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasinda email kutucuguna admin emaili girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

        //04-Login sayfasinda password kutucuguna admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        //05-Login butonuna tiklanir.
        homePage.loginButonu.click();

        //06-Menü listesinde para birimleri menüsünün görünür oldugu dogrulanır.
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.paraBirimleriElementi.click(); //locate de hata mı var?

        Driver.closeDriver();





    }


}
