package tests.ozgur;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_19_001 extends TestBaseRapor {

    @Test
    public void test1901(){
        extentTest=extentReports.createTest("Test1","The user should be able to access the main page of the site.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("//1-Sign in butonuna tıkla");

        HomePage homePage = new HomePage();
        homePage.signInButton.click();

        extentTest.info("2-Email gir");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));


        extentTest.info("3-Password gir");
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        extentTest.info("Login Butonuna tıkla");
        homePage.loginButonu.click();

        extentTest.info("Users butonuna tıkla");
        homePage.usersButton.click();

        extentTest.pass("Kayıtlı kullanıcılar görüntülendi");
        Assert.assertTrue(homePage.users01.isDisplayed());
        extentTest.pass("Toplam kullanıcı sayısı görüntülendi");
        Assert.assertTrue(homePage.toplamkullaniciSayisi.isDisplayed());
        extentTest.pass("Aktif durumu görüntülendi");
        Assert.assertTrue(homePage.activeCheckbox.isDisplayed());
    }
}
