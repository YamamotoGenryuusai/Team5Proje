package tests.ozan;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseRapor;

import javax.swing.*;

public class US_03_TC06 extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Ana sayfa Contact Us bölümü textbox'ları ve Send Mesaage buton testi","Textbox'lar ve Send Message butonu görünür ver aktif olmalıdır.");
        HomePage homePage=new HomePage();
        extentTest.info("Tarayıcı açılır ve ana sayfaya gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Contact Us bölümüne gidilir.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.contactUsText);
        extentTest.info("Textboxların görünülürlüğü ve aktifliğini test eder.");
        Assert.assertTrue(homePage.homePageNameTextbox.isDisplayed());
        Assert.assertTrue(homePage.homePageEmailTextBox.isDisplayed());
        Assert.assertTrue(homePage.homePageSubjectTextBox.isDisplayed());
        Assert.assertTrue(homePage.homePageMessageTextBox.isDisplayed());
        Assert.assertTrue(homePage.homePageNameTextbox.isEnabled());
        Assert.assertTrue(homePage.homePageEmailTextBox.isEnabled());
        Assert.assertTrue(homePage.homePageSubjectTextBox.isEnabled());
        Assert.assertTrue(homePage.homePageMessageTextBox.isEnabled());
        extentTest.pass("Textbox'lar görünür ve aktiftir.");
        extentTest.info("Send Message butonunun görünülürlüğünü ve aktifliğini test eder.");
        Assert.assertTrue(homePage.homePageSubmitButton.isDisplayed());
        Assert.assertTrue(homePage.homePageSubmitButton.isEnabled());
        extentTest.pass("Send Message butonu görünür ve aktiftir.");
        extentTest.info("Tarayıcı kapatılır.");


    }
}
