package tests.hasan;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.*;

import java.util.Set;

public class US04_TC01_09 extends TestBaseRapor {

    //Homepage footer menüsündeki '© 2023 Copyright by Smart Card Link' metni, ziyaretçiler tarafından görünür olmalıdır.
    @Test
    public void test01() {
        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "'© 2023 Copyright by Smart Card Link' metni görünür olmalıdır.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");

        //02_Homepage footer menüsünde '© 2023 Copyright by Smart Card Link' metninin görünür olduğu doğrulanır.
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.CopyrightElementHC);
        Assert.assertTrue(homePage.CopyrightElementHC.isDisplayed());
        extentTest.info("© 2023 Copyright by Smart Card Link metninin görünür olduğu doğrulanır.");
        extentTest.pass("'© 2023 Copyright by Smart Card Link' metni görünür.");

        // 03_Browser kapatılır.
        extentTest.info("Browser kapatılır.");

    }

    //Homepage footer menüsündeki 'Facebook,' 'Twitter/X,' 'Instagram,' 'Linkedin,' ve 'Pinterest' ikonları görünür ve tıklanabilir durumda olmalıdır.
    // Ayrıca, her bir ikona tıklama işlemi ilgili sosyal medya platformunun doğru sayfasına yönlendirmelidir.

    @Test
    public void test02() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "Facebook ikonu aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Facebook' ikonu tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(),homePage.facebookElementHC);
        extentTest.info("'Facebook' ikonu tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();


        String facebookWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                facebookWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(facebookWhd);
        String expectedUrlIcerik="facebook";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url facebook içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }

    @Test
    public void test03() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "X ikonu aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'X' ikonu tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(), homePage.xElementHC);
        extentTest.info("'X' ikonu tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String XWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                XWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(XWhd);
        String expectedUrlIcerik="twitter";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertFalse(actualUrl.contains(expectedUrlIcerik));
        extentTest.fail("Buton doğru sayfaya yönlendirmiyor. Yönlendirdiği sayfa= "+actualUrl);

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }

    @Test
    public void test04() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "Instagram ikonu aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Instagram' ikonu tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(), homePage.instagramElementHC);
        extentTest.info("'Instagram' ikonu tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String instagramWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                instagramWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(instagramWhd);
        String expectedUrlIcerik="instagram";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url instagram içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }

    @Test
    public void test05() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "Linkedin ikonu aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Linkedin' ikonu tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(), homePage.linkedinElementHC);
        extentTest.info("'Linkedin' ikonu tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String linkedinWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                linkedinWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(linkedinWhd);
        String expectedUrlIcerik="linkedin";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url 'linkedin' içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }

    @Test
    public void test06() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "Pinterest ikonu aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Pinterest' ikonu tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(),homePage.pinterestElementHC);
        extentTest.info("'Pinterest' ikonu tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String pinterestWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                pinterestWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(pinterestWhd);
        String expectedUrlIcerik="pinterest";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url 'pinterest' içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }

    //Homepage  footer menüsündeki "Terms & Conditions" bağlantısı görünür ve tıklanabilir durumda olmalıdır. Ayrıca, tıklama işlemi doğru sayfaya yönlendirmelidir.

    @Test
    public void test07() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "Terms & Conditions bağlantısı aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Terms & Conditions' bağlantısı tıklanır.
       JSUtilities.clickWithJS(Driver.getDriver(), homePage.termsConditonsElementHC);
        extentTest.info("'Terms & Conditions' bağlantısı tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String termsWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                termsWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(termsWhd);
        String expectedUrlIcerik="terms-conditions";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url 'terms-conditions' içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }


    //Homepage  footer menüsündeki "Privacy Policy" bağlantısı görünür ve tıklanabilir durumda olmalıdır. Ayrıca, tıklama işlemi doğru sayfaya yönlendirmelidir.
    @Test
    public void test08() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "Privacy Policy bağlantısı aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Privacy Policy' bağlantısı tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(), homePage.privacyPolicyElementHC);
        extentTest.info("'Privacy Policy' bağlantısı tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String privacyWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                privacyWhd = each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(privacyWhd);
        String expectedUrlIcerik="privacy-policy";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url 'privacy-policy' içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }

    //Homepage  footer menüsündeki "Privacy Policy" bağlantısı görünür ve tıklanabilir durumda olmalıdır. Ayrıca, tıklama işlemi doğru sayfaya yönlendirmelidir.
    @Test
    public void test09() {
        HomePage homePage = new HomePage();
        SoftAssert softAssert=new SoftAssert();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("com.SmartCardLink footer testi", "FAQ bağlantısı aktif olmalı ve doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        String sclWhd=Driver.getDriver().getWindowHandle();
        extentTest.info("Browser acilir ve ziyaretci anasayfaya gider.");


        //02_Homepage footer menüsündeki 'Privacy Policy' bağlantısı tıklanır.
        JSUtilities.clickWithJS(Driver.getDriver(),homePage.faqElementHC);
        extentTest.info("'FAQ' bağlantısı tıklanır.");

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        String faqyWhd ="";

        for (String each : whdSeti
        ) {
            if (!each.equals(sclWhd)) {
                faqyWhd= each;
            }
        }

        //03_Click yapıldıktan sonra doğru sayfaya yönlendiriliği doğrulanır.
        Driver.getDriver().switchTo().window(faqyWhd);
        String expectedUrlIcerik="faq";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik),"Url 'faq' içeriyor.");
        extentTest.pass("Click işlemi doğru sayfaya yönlendiriyor.");

        // 03_Browser kapatılır.
        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Browser kapatılır.");

    }
}




