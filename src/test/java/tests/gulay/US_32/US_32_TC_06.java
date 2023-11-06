package tests.gulay.US_32;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.*;

public class US_32_TC_06 extends TestBaseRapor {
    SoftAssert softAssert= new SoftAssert();
    UserDashboard userDashboard = new UserDashboard();
    HomePage homePage= new HomePage();
    AdminDashboard adminDashboard= new AdminDashboard();
    Faker faker= new Faker();


    JSUtilities jsUtilities= new JSUtilities();

    @Test

    public void  US_32_TC_06 () {
        extentTest=extentReports.createTest("Coupon Code Updte Testi ");

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
        // 11-	Coupon Name, Coupon Type, Coupon  Discount ve  Expire At bölümlerini doldurur. Save butonuna tıklar.
        adminDashboard.addCouponCodeCouponNameAlanigg.sendKeys(faker.name().name());
        extentTest.info("Add Coupon Code Name alani doldurulur");
        //adminDashboard.addCouponCodeFixedTypeCheckBoxgg.click();
        adminDashboard.addCouponCodePercentageCheckBoxgg.click();
        extentTest.info("Add Coupon Code percentage alanı secilir");
        adminDashboard.addCouponCodeEnterCouponDiscountgg.sendKeys("10");
        extentTest.info("Add Coupon Code Discount alani doldurulur");
        adminDashboard.addCouponCodePercentageExprireAtgg.click();
        extentTest.info("Expire at alanı secilir");
        adminDashboard.addcouponCodeMonths.click();
        extentTest.info("month alanı secilir");
        adminDashboard.addCouponCodeDate.click();
        extentTest.info("date secimi yailir");
        adminDashboard.addCouponCodeSaveButonu.click();
        extentTest.info("save butonuna tiklanir");

        ReusableMethods.wait(4);

        adminDashboard.couponCodesEditButonugg.click();
        extentTest.info("Edit ikonuna tiklar.");

        adminDashboard.editCouponCode_CouponeNamealanigg.sendKeys(faker.name().firstName());
        extentTest.info("Coupon Name alanını değiştirir.");
        adminDashboard.editCouponCode_FixedTypegg.click();
        extentTest.info("Coupon Type alanını değiştirir.");
        adminDashboard.editCouponCode_CouponeDiscountgg.sendKeys("30");
        extentTest.info("Coupon Discount alanını değiştirir.");
        adminDashboard.editCouponCode_ExpireAtgg.click();
        extentTest.info("Expire At alanını değiştirir.");
        adminDashboard.editCouponCode_November10.click();

        adminDashboard.editCouponCodeSaveButonugg.click();
        extentTest.info("Save butonuna tıklar.");
        softAssert.assertTrue(adminDashboard.couponCodesCodesUpdatesSuccesfullyTextgg.isDisplayed());
        extentTest.pass("Coupon Codes updates succesfully yazisinin göründüğünü test edildi.");




    }
}



