package tests.gulay.US_32;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseRapor;

public class US_32_TC_04 extends TestBaseRapor {
    SoftAssert softAssert= new SoftAssert();
    UserDashboard userDashboard = new UserDashboard();
    HomePage homePage= new HomePage();
    AdminDashboard adminDashboard= new AdminDashboard();
    Faker faker= new Faker();


    JSUtilities jsUtilities= new JSUtilities();

    @Test
    public void US_32_TC_04 (){
        extentTest=extentReports.createTest("Coupon Code olusturma testi");

        extentTest.info("Browser acilir, Adres çubuğuna log in URL girilir, Enter tusuna tiklanir. Log in gidilir");

        Driver.getDriver().get(ConfigReader.getProperty("scLoginUrl_gg"));

        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("adminGecerliEMailgg"));
        extentTest.info(" Email alanına geçerli admin email girilir");

        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminGecerliSifregg"));
        extentTest.info("Password alanına gecerli admin password girilir");

        homePage.loginButonu.click();
        extentTest.info(" Log in butonuna tiklanir");
        softAssert.assertTrue(adminDashboard.sAdminDashboardText.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement goToCouponCode= (adminDashboard.couponCodesButonu_gg);
        js.executeScript("arguments[0].scrollIntoView();", adminDashboard.couponCodesButonu_gg);
        extentTest.info("Sol menüde Coupon Codes butonu görünene kadar aşağı kaydırılır");

        adminDashboard.couponCodesButonu_gg.click();
        extentTest.info("\tCoupon Codes butonuna tıklanır");

        adminDashboard.addCouponCodeButonu_gg.click();
        extentTest.info("Add Coupon Codes butonuna tıklanır");


        adminDashboard.addCouponCodeCouponNameAlanigg.sendKeys(faker.name().name());
        extentTest.info("Coupon Name alani doldurulur.");
        adminDashboard.addCouponCodePercentageCheckBoxgg.click();
        extentTest.info("Percentage alanı secilir");
        adminDashboard.addCouponCodeEnterCouponDiscountgg.sendKeys("10");
        extentTest.info("Dıcount alanı doldurulur");
        adminDashboard.addCouponCodePercentageExprireAtgg.click();
        extentTest.info("Expire At Alanı secilir");
        adminDashboard.addcouponCodeMonths.click();
        extentTest.info("Month alanı secilir");
        adminDashboard.addCouponCodeDate.click();
        extentTest.info("tarih secilir");
        adminDashboard.addCouponCodeSaveButonu.click();
        extentTest.info("add coupon save butonu tiklanir");
        softAssert.assertTrue(adminDashboard.couponCodeCreatedSuccesfullyText.isDisplayed());
        extentTest.pass("Coupon Code created succesfully yazısının görüntülendiğini doğrulandi");







    }

}

