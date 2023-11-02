package tests.ozgur;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;


public class US_025_001 extends TestBaseRapor{


    @Test
    public void test_01()
{
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


    extentTest.info("Plan Sekmesine tıkla");
    homePage.planSekmesi.click();

    ReusableMethods.wait(2);

    extentTest.pass("İlk üyelik planı görünür");

    Assert.assertTrue(homePage.uyelikPlani.isDisplayed());








}




}
