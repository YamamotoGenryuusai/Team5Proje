package tests.gulay.US_05;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_05_TC_03 extends TestBaseRapor {
    @Test
    public void US_05_TC_03 () {
        extentTest=extentReports.createTest("yeni hesap olusturma testi");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        extentTest.info("Browser acilir, Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir. Sitenin ana sayfasina gidilir");

        HomePage homePage= new HomePage();
        homePage.signInButton.click();
        extentTest.info("Sign in butonuna tıklanır");

        homePage.createAnAccountLinkgg.click();
        extentTest.info("Create an account butonu tıklanır");

        Faker faker= new Faker();
       String  password= faker.internet().password(9,12,true,true);

        homePage.cAfirstNameAlanigg.sendKeys(faker.name().firstName());
        extentTest.info("First name alanı doldurulur");

        homePage.cAlastNameAlanigg.sendKeys(faker.name().lastName());
        extentTest.info("Last name alanı doldurulur");

        homePage.cAEMailalanigg.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email alanı doldurulur");

        homePage.cAPasswordAlanigg.sendKeys(password);
        extentTest.info("Password alanı doldurulur");

        homePage.cAConfirmPasswordAlanigg.sendKeys(password);
        extentTest.info("Confirm Password alanı doldurulur");

        homePage.cABySigningUpgg.click();
        extentTest.info("By signing up you agree to our Terms & Conditions & Privacy Policy” butonu tıklanır");

        homePage.cASubmitButonugg.click();
        extentTest.info("Submit butonu tıklanır.");

        Assert.assertTrue(homePage.basarliCreatAccountSignInText_gg.isDisplayed());
        extentTest.pass("Sign in yazısının göründüğünü doğrulandi.");







    }
}
