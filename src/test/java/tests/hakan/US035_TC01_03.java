package tests.hakan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;

public class US035_TC01_03 extends TestBaseRapor {

    //TC01: Gecerli admin bilgileri ile admin paneline erisip, Front CMS butonuna tiklamali ve gorusler ile sorulari goruntuleyebilmelidir.

    @Test
    public void TC01() {

        extentTest=extentReports.createTest("Gorusler ve Sorular sayfasi dogrulama testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna admin emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scAdminEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna admin password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scAdminPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Front CMS butonuna tiklanir.");
        homePage.frontCMSButonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Gorusler ve sorularin gorunurlugu dogrulanir.");
        homePage.testimonialsButonu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.testimonialsactiveButonu.isDisplayed());
        extentTest.pass("Gorusler sayfasi basariyla dogrulandi.");

        Driver.getDriver().navigate().back();

        homePage.enquiriesButonu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.enquiriesactiveButonu.isDisplayed());
        extentTest.pass("Sorular sayfasi basariyla dogrulandi.");


        extentTest.info("Tarayici kapatilir.");

    }

    //TC02: Admin yeni gorus ekleyebildigini dogrulayabilmelidir.

    @Test
    public void TC02() throws AWTException {

        extentTest=extentReports.createTest("Yeni gorus ekleyebilme testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna admin emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scAdminEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna admin password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scAdminPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Front CMS butonuna tiklanir.");
        homePage.frontCMSButonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Testimonials butonuna tiklar.");
        homePage.testimonialsButonu.click();

        extentTest.info("Add testimonials butonuna tiklar.");
        homePage.addTestimonialsButonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Gorus icin isim girer");
        homePage.testimonialsName.sendKeys(ConfigReader.getProperty("NameHT"));
        ReusableMethods.wait(1);

        extentTest.info("Gorus icin aciklama girer");
        homePage.testimonialsDescription.sendKeys(ConfigReader.getProperty("DescriptionHT"));
        ReusableMethods.wait(1);

        extentTest.info("Dosya yukleme islemi");
        homePage.image.click();
        ReusableMethods.wait(5);

        extentTest.info("Dosya seçme işlemi için robot kullanma");
        StringSelection stringSelection = new StringSelection("C:\\Users\\USER\\Desktop\\logo.jpg"); //
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        ReusableMethods.wait(2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ReusableMethods.wait(2);

        extentTest.info("Degisiklikleri kaydeder.");
        homePage.testimonialSaveButonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Gorusun eklendigini dogrular.");
        Assert.assertTrue(homePage.successMessage.isDisplayed());
        extentTest.pass("Gorus basariyla eklendi.");


        extentTest.info("Tarayici kapatilir.");

    }

    //TC03: Admin goruslerin icerigini goruntuleyip,düzenleyip ve silebildigini dogrulamalidir

    @Test
    public void TC03() throws AWTException {

        extentTest=extentReports.createTest("Goruslerin iceriginin düzenlendigini dogrulama testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna admin emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scAdminEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna admin password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scAdminPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Front CMS butonuna tiklanir.");
        homePage.frontCMSButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("Testimonials butonuna tiklanir.");
        homePage.testimonialsButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("View butonuna tiklanir.");
        homePage.viewButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("Testimonial Details yazisinin goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.testimonialDetails.isDisplayed());
        extentTest.pass("Testimonial Details yazisi basariyla goruntulendi.");

        extentTest.info("Acilan sayfayi kapatir.");
        homePage.closeDetails.click();

        extentTest.info("Edit butonuna tiklanir.");
        homePage.editButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("İsim düzenlenir.");
        homePage.editName.sendKeys(ConfigReader.getProperty("editName"));
        ReusableMethods.wait(1);

        extentTest.info("Description düzenlenir.");
        homePage.editDescription.clear();
        homePage.editDescription.sendKeys(ConfigReader.getProperty("editDescription"));
        ReusableMethods.wait(1);

        extentTest.info("Dosya yükleme işlemi");
        homePage.editimage.click();
        ReusableMethods.wait(5);

        extentTest.info("Dosya seçme işlemi için robot kullanma");
        StringSelection stringSelection = new StringSelection("C:\\Users\\USER\\Desktop\\1477351915tqCzo.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        ReusableMethods.wait(2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ReusableMethods.wait(2);

        extentTest.info("Save butonuna tiklanir.");
        homePage.testimonialUpdate.click();
        ReusableMethods.wait(1);

        extentTest.info("Onay mesajinin goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.successMessage.isDisplayed());
        extentTest.pass("Onay mesaji basarili sekilde goruntulendi.");

        extentTest.info("Delete butonuna tiklanir.");
        homePage.deleteButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("'Yes,Delete' butonuna tiklanir.");
        homePage.yesDeletebutton.click();
        ReusableMethods.wait(1);

        extentTest.info("Silindigini onaylayan mesajin goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.deletedHT.isDisplayed());
        extentTest.pass("Onay mesaji basarili sekilde dogrulandi.");

        extentTest.info("Tarayici kapatilir");


    }


}
