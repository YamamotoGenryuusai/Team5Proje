package tests.US_001_003_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_01_TC01 extends TestBaseRapor {

    //Bir ziyaretçi olarak siteyi kullanabilmek icin web sitesine erişebildiğimi doğrulayabilmeliyim
    @Test
    public void TC01(){
        extentTest=extentReports.createTest("Website home page accessibility test.","The user should be able to access the main page of the site.");
        //Browser açılır
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //Web sitesine erişilebildiginin kontrolu yapılır.
        String expectedUrl="https://qa.smartcardlink.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Site home page could not be accessed.");
        extentTest.info("Tests that the site url is correct.");
        extentTest.pass("Access to the main page can be provided.");



    }
}