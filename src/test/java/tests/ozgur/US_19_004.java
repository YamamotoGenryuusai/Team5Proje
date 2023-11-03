package tests.ozgur;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_19_004 extends TestBaseRapor {

    @Test
    public void test1904(){

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

        extentTest.info("add user butonuna tıkla");
        homePage.addUserButton.click();

        homePage.addUseremailTextBox.sendKeys("tinkiwinki@hotmail.com");
        homePage.addUserPhoneNumber.sendKeys("123123123");
        homePage.addUserpasswordTextBox.sendKeys("123123123");
        homePage.addUserConfirmpasswordTextBox.sendKeys("123123123");
        Faker faker = new Faker();

        homePage.addUserFirstName.sendKeys(faker.name().firstName());
        homePage.addUserLastName.sendKeys(faker.name().lastName());
        homePage.addUserSubmit.click();

        Assert.assertTrue(homePage.alertYazisi.isDisplayed());


    }
}
