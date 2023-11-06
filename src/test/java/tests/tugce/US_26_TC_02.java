package tests.tugce;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_26_TC_02 extends TestBaseRapor {

    @Test
    public void US_26_TC_02(){
        extentTest = extentReports.createTest("affiliateUsersSekmesiTesti", "Affiliate Users bolumunun tiklanabilir ve ulasilabilir oldugu dogrulanir");

        extentTest.info("1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("2- Login butonuna tiklanir");
        HomePage adminHomePage = new HomePage();
        adminHomePage.adminSigninButonu.click();

        extentTest.info("3- Gecerli bilgilerle admin girisi yapilir");
        adminHomePage.adminEmailBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        adminHomePage.adminPasswordBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        adminHomePage.adminLoginButonu.click();

        extentTest.info("4- Dashboard bolumunden 'Affiliate Users' sekmesinin tiklanabilir oldugu kontrol edilir");
        AdminDashboard adminDashboard = new AdminDashboard();
        Assert.assertTrue(adminDashboard.affiliateUsersSekmesi.isEnabled());

        extentTest.info("5- Dashboard bolumunden 'Affiliate Users' sekmesine tiklanir");
        adminDashboard.affiliateUsersSekmesi.click();

        extentTest.info("6- 'Affiliate Users' bolumunun ulasilabilir oldugu kontrol edilir");
        Assert.assertTrue(adminDashboard.affiliateUserYaziElementi.isDisplayed());

    }
}
