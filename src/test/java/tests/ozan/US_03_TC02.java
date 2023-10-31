package tests.ozan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.*;

public class US_03_TC02 extends TestBaseRapor {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("Home page Choose plan visibility and activity test.");
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        JSUtilities.scrollToElement(Driver.getDriver(), homePage.choosePlan10);
        extentTest.info("The visibility of the Choose Plan button is tested.");
        softAssert.assertTrue(homePage.choosePlan10.isDisplayed(), "The Choose Plan button is not visible");
        extentTest.pass("The Choose Plan button visible.");
        ReusableMethods.wait(1);
        homePage.choosePlan10.click();
        ReusableMethods.wait(1);
        String expectedUrl = "https://qa.smartcardlink.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "It does not redirect to the relevant page.");

        extentTest.pass("The Choose Plan button is visible, active and redirects to the relevant page.");
    }
    @Test
    public void test02(){
        extentTest=extentReports.createTest("Activation test of the plan scroll buttons in the Home page Choose plan section.","The plan scroll keys in the Choose plan section must be active");
        HomePage homePage=new HomePage();
        SoftAssert softAssert=new SoftAssert();
        extentTest.info("Open the browser and go to the home page.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Go to choose plan section in home page.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.chosePlanStandardText);
        extentTest.info("Tests that the plan scroll key works.");
        extentTest.info("Click on the plan shift button.");
        ReusableMethods.wait(1);
        homePage.choosePlanKaydirma.click();
        ReusableMethods.wait(1);
        softAssert.assertTrue(homePage.choosePlanGoldText.isDisplayed());
        extentTest.pass("Plan scroll key works");
        softAssert.assertAll();
    }
}
