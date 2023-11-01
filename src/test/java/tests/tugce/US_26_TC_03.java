package tests.tugce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class US_26_TC_03 {

    @Test
    public void affiliatedByTesti() {
        // 1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        // 2- Login butonuna tiklanir
        HomePage adminHomePage = new HomePage();
        adminHomePage.adminSigninButonu.click();

        // 3- Gecerli bilgilerle admin girisi yapilir
        adminHomePage.adminEmailBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        adminHomePage.adminPasswordBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        adminHomePage.adminLoginButonu.click();

        // 4- Dashboard bolumunden 'Affiliate Users' sekmesine tiklanir
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.affiliateUsersSekmesi.click();

        // 5- 'Affiliated By' basliginin gorunur oldugu kontrol edilir.
        Assert.assertTrue(adminDashboard.affiliatedByBaslikElementi.isDisplayed());

        // 6- 'Affiliated By' basliginin altinda ortaklik kaydi yapan yetkili kullanicilarin isimlerinin gorunur oldugu kontrol edilir
        Select select = new Select(adminDashboard.perPageItemi);
        select.selectByIndex(2);

        ReusableMethods.wait(3);

        List<WebElement> affiliateYapanKullanicilarListesi = Driver.getDriver().findElements(By.xpath("//*[@class='mb-1 text-decoration-none fs-6']"));
        for (int i = 0; i <affiliateYapanKullanicilarListesi.size() ; i++) {
            if (i%2==0){
                Assert.assertTrue(affiliateYapanKullanicilarListesi.get(i).isDisplayed());
            }
        }

        // 7- Browser kapatilir
        Driver.closeDriver();
    }
}
