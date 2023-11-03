package tests.tugce;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.*;

import javax.swing.*;

public class US_26_TC_07 extends TestBaseRapor {

    @Test(priority = 1)
    public void affiliationDavetTesti() {

        extentTest = extentReports.createTest("affiliationDavetTesti", "Kullanici hesabiyla davet linkine ulasildigi dogrulanir");

        extentTest.info("1- Browser acilir ve istenen URL (https://qa.smartcardlink.com/) yazilarak test sayfasina gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("2- Kayitli kullanici girisi yapilir");
        HomePage homePage = new HomePage();
        homePage.signInButton.click();
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("kayitliKullaniciEmail"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("kayitliKullaniciSifre"));
        homePage.loginButonu.click();

        extentTest.info("3- Affiliations sekmesine tiklanir");
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.affiliationsSekmesi.click();

        extentTest.info("4- Copy link butonuna tiklanir link kaydedilir");
        userDashboard.copyLinkUrl.click();

    }

    @Test(priority = 2)
    public void yeniKullaniciOlusturmaTesti() {
        extentTest = extentReports.createTest("yeniKullaniciOlusturmaTesti", "Davet linkiyle yeni kullanici hesabi olusturulur");

        UserDashboard userDashboard = new UserDashboard();

        extentTest.info("1- Davet linki urlsine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("copyLinkUrl"));

        extentTest.info("2- Bos alanlar doldurulur ve checkboxa ve sonra submit butonuna tiklanir");
        ReusableMethods.wait(2);

        userDashboard.firstNameElementi.sendKeys(ConfigReader.getProperty("yeniIsim"));
        userDashboard.lastNameElementi.sendKeys(ConfigReader.getProperty("yeniSoyIsim"));
        userDashboard.emailElementi.sendKeys(ConfigReader.getProperty("yeniMail"));
        userDashboard.passwordElementi.sendKeys(ConfigReader.getProperty("sifre"));
        userDashboard.passwordConfirmationElementi.sendKeys(ConfigReader.getProperty("sifreOnay"));

        userDashboard.privacyPolicyCheckboxElementi.click();
        userDashboard.submitButonu.click();

        extentTest.info("3- Yeni acilan sayfada olusturulan kullanici ismiyle giris yapilir");

        ReusableMethods.wait(2);
        userDashboard.emailElementi.sendKeys(ConfigReader.getProperty("yeniMail"));
        userDashboard.passwordElementi.sendKeys(ConfigReader.getProperty("sifre"));
        userDashboard.submitButonu.click();

        extentTest.info("4- Sinirsiz kullanici islemi icin odeme yapilir");

        userDashboard.userDropDown.click();
        userDashboard.manageSubscriptionSekmesi.click();
        userDashboard.upgradePlanbutonu.click();
        ReusableMethods.wait(2);
        userDashboard.unlimitedButonu.click();
        ReusableMethods.wait(2);

        JSUtilities.scrollToElement(Driver.getDriver(), userDashboard.unlimitedOption);
        ReusableMethods.wait(2);

        userDashboard.unlimitedOption.click();
        ReusableMethods.wait(2);

        HomePage homePage = new HomePage();
        ReusableMethods.wait(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        homePage.StripDropdown.click();
        ReusableMethods.wait(3);

        homePage.Striptext.click();
        ReusableMethods.wait(2);
        homePage.paySwitchPlanbutton.click();

        homePage.credicardnumber.sendKeys(ConfigReader.getProperty("credicardnumber"));
        homePage.date.sendKeys(ConfigReader.getProperty("day.year"));
        homePage.cvc.sendKeys(ConfigReader.getProperty("cvc"));
        homePage.cardname.sendKeys(ConfigReader.getProperty("cardname"));
        ReusableMethods.wait(2);
        homePage.pay.click();
        homePage.backtoSubscriptionsbutton.click();

    }

    @Test(priority = 3)
    public void yeniKullaniciEklendiMiTesti() {
        extentTest = extentReports.createTest("yeniKullaniciEklendiMiTesti", "Yeni kullanicinin user basligi altinda gorundugu dogrulanir");
        SoftAssert softAssert = new SoftAssert();

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

        extentTest.info("5- User basligi altinda eklenen kullanici ismi eslestigi dogrulanir");
        softAssert.assertEquals(adminDashboard.affUsersKullaniciIsimElementi.getText(), ConfigReader.getProperty("affUsersIsimElementi"), "isimler eslesmiyor");

        softAssert.assertAll();

    }
}
