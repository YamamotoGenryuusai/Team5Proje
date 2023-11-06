package tests.ozgur;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_19_003 extends TestBaseRapor {

    @Test
    public void test1903(){
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

        homePage.changePasswordButton.click();
        ReusableMethods.wait(2);
        homePage.userspasswordTextBox.click();
        homePage.userspasswordTextBox.sendKeys("123123123");
        homePage.usersconfirmPasswordTextBox.click();
        homePage.usersconfirmPasswordTextBox.sendKeys("123123123");

        homePage.passwordSaveButton.click();

        ReusableMethods.wait(5);

        Assert.assertTrue(homePage.successText.isDisplayed());

        ReusableMethods.wait(4);
    }
}
