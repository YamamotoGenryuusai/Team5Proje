package tests.gulay.US_32;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.*;

public class US_32_TC_05 extends TestBaseRapor {
    SoftAssert softAssert= new SoftAssert();
    UserDashboard userDashboard = new UserDashboard();
    HomePage homePage= new HomePage();
    AdminDashboard adminDashboard= new AdminDashboard();
    JSUtilities jsUtilities= new JSUtilities();
    @Test
    public void US_32_TC_05 (){
        extentTest=extentReports.createTest("Coupon Code Aktif Etme Testi");
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

        adminDashboard.couponCodesStatusButonugg.click();
        ReusableMethods.wait(1);
        extentTest.info("Status bölümünü tıklar.");

       softAssert.assertTrue(adminDashboard.couponCodeStatusUpdatedMessage_gg.isDisplayed());
       extentTest.pass("Coupon Codes status updates succesfully yazisinin görüntülendiğini dogrulandi.");

    }
}
