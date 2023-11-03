package tests.tugce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_27_TC_08_TC_09_TC_10 extends TestBaseRapor {

    @Test
    public void TC_08() {
        extentTest = extentReports.createTest("viewButonuGorunurluguTesti", "Action basligi altinda View butonlarinin gorunur oldugu kontrol edilir");

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

        extentTest.info("5- Action basligi altinda View butonlarinin gorunur oldugu kontrol edilir");

        List<WebElement> viewButonu = Driver.getDriver().findElements(By.xpath("//*[@class='svg-inline--fa fa-eye text-info']"));
        for (WebElement each : viewButonu) {
            Assert.assertTrue(each.isDisplayed());
        }

    }

    @Test
    public void TC_09() {
        extentTest = extentReports.createTest("viewButonuTiklanabilirlikTesti", "Action basligi altinda View butonlarinin tiklanir oldugu kontrol edilir");

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

        extentTest.info("5- Action basligi altinda View butonlarinin tiklanir oldugu kontrol edilir");
        List<WebElement> viewButonu = Driver.getDriver().findElements(By.xpath("//*[@class='svg-inline--fa fa-eye text-info']"));
        for (WebElement each : viewButonu) {
            Assert.assertTrue(each.isEnabled());
        }

    }

    @Test
    public void TC_10() {
        extentTest = extentReports.createTest("pop-upPencereTesti", "Action basligi altinda View butonlarinin tiklandiginda, pop-up pencere acildigi dogrulanir");

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

        extentTest.info("5- View butonlarindan birine tiklanir, pencerenin gorundugu kontrol edilir");
        List<WebElement> actionViewListesi = Driver.getDriver().findElements(By.xpath("//*[@class='svg-inline--fa fa-eye text-info']"));
        ReusableMethods.wait(2);

        Actions actions = new Actions(Driver.getDriver());

        boolean pencereGorunuyor = false;

        for (WebElement eachView : actionViewListesi) {
            actions.keyDown(Keys.ARROW_DOWN).perform();
            eachView.click();
            ReusableMethods.wait(2);
            Assert.assertTrue(adminDashboard.affiliationTransactionsViewDetails.isDisplayed());
            pencereGorunuyor = true;
            if (pencereGorunuyor){
                adminDashboard.affiliationTransactionsKapamaButonu.click();
            }
            ReusableMethods.wait(2);
        }

    }


}
