package tests.ozan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_03_TC01 extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Home page Get Started button test.","The Get Started button on the home page must be visible and active.");
        SoftAssert softAssert=new SoftAssert();
        HomePage homePage=new HomePage();
        extentTest.info("The browser opens and the user navigates to the url.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Tests that the Get started button is visible.");
        softAssert.assertTrue(homePage.getStartedButton.isDisplayed(),"get started button does not visible");
        extentTest.pass("Get Started button visible");
        extentTest.info("Tests that the get started button is active.");
        homePage.getStartedButton.click();
        String expectedUrl="https://qa.smartcardlink.com/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"did not redirect to the relevant page after clicking");
        extentTest.pass("The Get Started button is active and redirects to the correct page.");
        softAssert.assertAll();
    }

}
