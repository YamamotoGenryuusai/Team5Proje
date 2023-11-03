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
import utilities.TestBaseRapor;

import java.util.List;

public class US_26_TC_06 extends TestBaseRapor{

    @Test
    public void US_26_TC_06(){
        extentTest = extentReports.createTest("affiliationDateTesti", "'Affiliated By' basliginin altinda ortaklik miktarlarinin gorunur oldugu dogrulanir");

        extentTest.info("1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("2- Login butonuna tiklanir");
        HomePage adminHomePage = new HomePage();
        adminHomePage.adminSigninButonu.click();

        extentTest.info("3- Gecerli bilgilerle admin girisi yapilir");
        adminHomePage.adminEmailBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        adminHomePage.adminPasswordBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        adminHomePage.adminLoginButonu.click();

        extentTest.info("4- Dashboard bolumunden 'Affiliate Users' sekmesine tiklanir");
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.affiliateUsersSekmesi.click();

        extentTest.info("5- 'Date' basliginin gorunur oldugu kontrol edilir.");
        Assert.assertTrue(adminDashboard.affiliationDateBaslikElementi.isDisplayed());

        extentTest.info("'Affiliated By' basliginin altinda ortaklik miktarlarinin gorunur oldugu kontrol edilir");
        Select select = new Select(adminDashboard.perPageItemi);
        select.selectByIndex(2);

        ReusableMethods.wait(3);

        List<WebElement> ortaklikTarihleriListesi = Driver.getDriver().findElements(By.xpath("//*[@class='badge bg-secondary me-2']"));
        for (WebElement eachTutar:ortaklikTarihleriListesi) {
            Assert.assertTrue(eachTutar.isDisplayed());
        }

    }
}
