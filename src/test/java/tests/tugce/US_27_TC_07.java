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

public class US_27_TC_07 extends TestBaseRapor {

    @Test
    public void US_27_TC_07() {
        extentTest = extentReports.createTest("affiliationTransactionsDateTesti", "Date basligi altinda ortaklik tarihlerinin gorunur oldugu dogrulanir");

        extentTest.info("1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("2- Login butonuna tiklanir");
        HomePage adminHomePage = new HomePage();
        adminHomePage.adminSigninButonu.click();

        extentTest.info("3- Gecerli bilgilerle admin girisi yapilir");
        adminHomePage.adminEmailBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        adminHomePage.adminPasswordBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        adminHomePage.adminLoginButonu.click();

        extentTest.info("4- Dashboard bolumunden 'Affiliation Transactions' sekmesine tiklanir");
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.affiliationTransactionsSekmesi.click();

        extentTest.info("5- 'Date' basliginin gorunur oldugu kontrol edilir");
        Assert.assertTrue(adminDashboard.affiliationTransactionsDateElementi.isDisplayed());

        extentTest.info("6- Date basligi altinda ortaklik tarihlerinin gorunur oldugu kontrol edilir");
        Select select = new Select(adminDashboard.perPageItemi);
        select.selectByIndex(2);

        ReusableMethods.wait(3);

        List<WebElement> ortaklikTarihListesi = Driver.getDriver().findElements(By.xpath("//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white text-center']"));
        for (WebElement eachDate:ortaklikTarihListesi) {
            Assert.assertTrue(eachDate.isDisplayed());
        }

    }
}
