package tests.cemil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US07_TC01 extends TestBaseRapor {

    @Test
    public void test01(){
        //Kayıtlı kullanıcı olarak dashboard sayfasına ulaşabilmeli ve ulasilabildigi dogrulanmalidir.

        HomePage homePage = new HomePage();
        extentTest=extentReports.createTest("Website home page dashboard accessibility test.",
       "As a registered user, It can access the dashboard with a valid e-mail and password on the home page.");

        extentTest.info("Browser opens");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("Click on the login button");
        homePage.signInButton.click();

        extentTest.info("Login with valid email and password");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailCO"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordCO"));
        homePage.loginButonu.click();

        extentTest.info("It is tested that the dashboard can be accessed");
        String expectedUrl="https://qa.smartcardlink.com/admin/dashboard";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Dasboard login failed");
        extentTest.pass("Dashboard verification test successful");

        extentTest.info("Browser closed");


    }
}
