package tests.ozgur;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_025_003 extends TestBaseRapor {

    @Test
    public void test_3() {

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //1-Sign in butonuna tıkla

        HomePage homePage = new HomePage();
        homePage.signInButton.click();

        //2-Email'i gir
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

        //3-Password gir

        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        //4-Login Butonuna tıkla
        homePage.loginButonu.click();

        //5- Plans sekmesine tıkla
        ReusableMethods.wait(2);
        homePage.planSekmesi.click();


        //6-actiondan delete basarak sil

        homePage.deleteButton.click();

        //7-Yes'e tıklayarak onayla

        homePage.deleteYesButton.click();





    }

}
