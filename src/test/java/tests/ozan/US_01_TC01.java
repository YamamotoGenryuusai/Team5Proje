package tests.ozan;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_01_TC01 extends TestBaseRapor {

    //Bir ziyaretçi olarak siteyi kullanabilmek icin web sitesine erişebildiğimi doğrulayabilmeliyim
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Website home page accessibility test.","The user should be able to access the main page of the site.");
        extentTest.info("The browser opens and the user navigates to the url.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("It is checked that the website can be accessed.");
        String expectedUrl="https://qa.smartcardlink.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Site home page could not be accessed.");
        extentTest.pass("Access to the main page can be provided.");
        extentTest.info("Browser is closed.");



    }
}