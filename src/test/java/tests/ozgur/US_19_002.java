package tests.ozgur;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_19_002 extends TestBaseRapor {



    @Test
    public void test1902()
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

        extentTest.info("Users butonuna tıkla");
        homePage.usersButton.click();

        extentTest.info("İlk Kullanıcıya tıkla");
        homePage.users01.click();

        extentTest.pass("Kullanıcı ismi görüntülendi");
        Assert.assertTrue(homePage.usernametest.isDisplayed());

        extentTest.info("Edite tıkla");
        homePage.editButton.click();

        Faker faker = new Faker();
        String fakername = faker.name().firstName();
        extentTest.info("Name girdi");
        homePage.editnameTextBox.sendKeys(fakername);
        extentTest.info("LastName girdi");
        homePage.editLastnameTextBox.sendKeys(fakername);

        extentTest.info("email sildi ve girdi");
        for (int i = 0; i < 20; i++) {
            homePage.editemailTextBox.sendKeys(Keys.DELETE);
        }

        homePage.editemailTextBox.sendKeys("tinkiwinki@hotmail.com");
        extentTest.info("Contact no girdi");
        homePage.editcontactNo.sendKeys("123131231");
        extentTest.info("Save buttona tıklad");
        homePage.editSaveButton.click();

        ReusableMethods.wait(5);
        extentTest.pass("Değiştirme başarılı");
        Assert.assertTrue(homePage.alertYazisi.isDisplayed());










    }
}
