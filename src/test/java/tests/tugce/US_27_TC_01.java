package tests.tugce;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_27_TC_01 {

    @Test
    public void adminLoginTesti() {
        // 1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        // 2- Login butonuna tiklanir
        HomePage adminHomePage = new HomePage();
        adminHomePage.adminSigninButonu.click();

        // 3- Gecerli bilgilerle admin girisi yapilir, admin girisinin basarili oldugu dogrulanir
        adminHomePage.adminEmailBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        adminHomePage.adminPasswordBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        adminHomePage.adminLoginButonu.click();

        // Admin girisinin basarili oldugunu anlamamiz icin, kullanici isminde 'admin' yazisi gecmeli
        Actions actions = new Actions(Driver.getDriver());
        actions.click(adminHomePage.adminKullaniciDropDown).perform();
        String expectedAdminYaziIcerik = "admin";
        String actualAdminYazisi = adminHomePage.adminUserName.getText();
        Assert.assertTrue(actualAdminYazisi.contains(expectedAdminYaziIcerik));

        // 4- Dashboard butonunun goruldugu ve tiklanabildigi dogrulanir
        Assert.assertTrue(adminHomePage.dashboardButonu.isDisplayed());
        Assert.assertTrue(adminHomePage.dashboardButonu.isEnabled());

        // 5- Admin dashboard sayfasinin acildigi dogrulanir
        String expectedAdminDashboardYaziIcerik = "Dashboard";
        String actualAdminDashboardYaziElementi = adminHomePage.dashboardButonu.getText();
        Assert.assertEquals(expectedAdminDashboardYaziIcerik, actualAdminDashboardYaziElementi);

        // 6- Browser kapatilir
        Driver.closeDriver();
    }
}
