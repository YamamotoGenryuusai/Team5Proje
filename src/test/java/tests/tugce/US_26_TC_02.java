package tests.tugce;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_26_TC_02 {

    @Test
    public void affiliateUsersSekmesiTesti(){
        // 1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        // 2- Login butonuna tiklanir
        HomePage adminHomePage = new HomePage();
        adminHomePage.adminSigninButonu.click();

        // 3- Gecerli bilgilerle admin girisi yapilir
        adminHomePage.adminEmailBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        adminHomePage.adminPasswordBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        adminHomePage.adminLoginButonu.click();

        // 4- Dashboard bolumunden 'Affiliation Transactions' sekmesinin tiklanabilir oldugu kontrol edilir
        AdminDashboard adminDashboard = new AdminDashboard();
        Assert.assertTrue(adminDashboard.affiliationTransactionsSekmesi.isEnabled());

        // 5- Dashboard bolumunden 'Affiliation Transactions' sekmesine tiklanir
        adminDashboard.affiliationTransactionsSekmesi.click();

        // 6- 'Affiliation Transactions' bolumunun ulasilabilir oldugu kontrol edilir
        Assert.assertTrue(adminDashboard.affiliationTransactionsYaziElementi.isDisplayed());

        // 7- Browser kapatilir
        Driver.closeDriver();
    }
}
