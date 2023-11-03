package tests.tugce;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_27_TC_06 extends TestBaseRapor {

    @Test(priority = 1)
    public void kayitliKullaniciParaCekmeTesti() {
        extentTest = extentReports.createTest("kayitliKullaniciParaCekmeTesti", "Unlimited Subscription'a sahip kullanici para cekme istegi gonderir");

        extentTest.info("1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("2- Kayitli kullanici girisi yapilir");
        HomePage homePage = new HomePage();
        homePage.signInButton.click();
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("kayitliKullaniciEmail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("kayitliKullaniciSifre"));
        homePage.loginButonu.click();

        extentTest.info("3- Affiliations sekmesine ardindan withdrawal butonuna tiklanir");
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.affiliationsSekmesi.click();
        userDashboard.withdrawalSekmesi.click();

        userDashboard.withdrawAmountButonu.click();

        extentTest.info("4- Acilan pencerede gerekli alanlar doldurulup save butonuna tiklanir");
        userDashboard.enterAmountKutusu.sendKeys(ConfigReader.getProperty("withdrawAmount"));
        userDashboard.paypalEmailKutusu.sendKeys(ConfigReader.getProperty("paypalMail"));
        userDashboard.saveButonu.click();

    }


    @Test(priority = 2)
    public void affiliationTransactionsApprovalStatusTesti() {
        extentTest = extentReports.createTest("affiliationTransactionsApprovalStatusTesti", "Yeni kullanicinin tabloda gorundugu dogrulanir");

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

        extentTest.info("5- Yeni kullanicinin tabloda gorundugu kontrol edilir");
        Assert.assertEquals(adminDashboard.affTransactionKullaniciIsimElementi.getText(), ConfigReader.getProperty("affIsimElementi"), "isimler eslesmiyor");


    }
}