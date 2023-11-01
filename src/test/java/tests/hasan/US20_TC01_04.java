package tests.hasan;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.*;

public class US20_TC01_04 extends TestBaseRapor {

    //Admin bilgileri ile 'https://qa.smartcardlink.com/' sitesine başarılı bir şekilde giriş yapılabilmelidir.
    @Test
    public void test01(){
        HomePage homePage=new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Admin pozitif login testi", "Admin, doğru email ve password ile giriş yapabilmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Browser acilir ve kullanıcı anasayfaya gider.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.signInButtonHC);
        ReusableMethods.wait(2);

        //02_Anasyafada bulunan 'Sign In' butonuna tıklanır.

        homePage.signInButtonHC.click();
        extentTest.info("Signin butonu tıklanır.");

        //03_'Email' olarak  geçerli 'admin_email' girilir.
        homePage.emailTextBoxHC.click();
        homePage.emailTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Email kutusuna geçerli admin email girilir.");

        //04_'Password' olarak geçerli 'admin_password' girilir.
        homePage.passwordTextBoxHC.click();
        homePage.passwordTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Password kutusuna geçerli admin password girilir.");

        //05_'Login' butonu tıklanır ve admin olarak giriş yapılır.
        homePage.loginButtonHC.click();
        extentTest.info("Login butonu tıklanır.");

        //06_Başarılı giriş yapıldığı doğrulanır.
        Assert.assertTrue(homePage.adminUsersElementHC.isDisplayed());
        extentTest.pass("Admin bilgileri ile başaralı bir şekilde giriş yapıldı.");

        // 07_Browser kapatılır.
        Driver.closeDriver();
        extentTest.info("Browser kapatılır.");

    }

    @Test
    public void test02(){
        HomePage homePage=new HomePage();


        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("User sekmesi testi", "Admin, users sekmesine tıkladığında, tıklama işlemi doğru sayfaya yönlendirmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Browser acilir ve kullanıcı anasayfaya gider.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.signInButtonHC);
        ReusableMethods.wait(2);

        //02_Anasyafada bulunan 'Sign In' butonuna tıklanır.

        homePage.signInButtonHC.click();
        extentTest.info("Signin butonu tıklanır.");

        //03_'Email' olarak  geçerli 'admin_email' girilir.
        homePage.emailTextBoxHC.click();
        homePage.emailTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Email kutusuna geçerli admin email girilir.");

        //04_'Password' olarak geçerli 'admin_password' girilir.
        homePage.passwordTextBoxHC.click();
        homePage.passwordTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Password kutusuna geçerli admin password girilir.");

        //05_'Login' butonu tıklanır ve admin olarak giriş yapılır.
        homePage.loginButtonHC.click();
        extentTest.info("Login butonu tıklanır.");

        //06_'Users' sekmesi tıklanır ve doğru sayfaya yönlendirdiği doğrulanır.
        homePage.usersElementHC.click();
        extentTest.info("Users sekmesi tıklanır.");

        String expectedUrlIcerik="users";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        extentTest.pass("Click işlemi doğru sayfaya yönlendirdi.");

        // 07_Browser kapatılır.
        Driver.closeDriver();
        extentTest.info("Browser kapatılır.");

    }

    //Users sayfasını açtıktan sonra, var olan kayıtlı kullanıcıların abonelik planları görüntülenebilmelidir.
    @Test
    public void test03(){
        HomePage homePage=new HomePage();
        AdminDashboard adminDashboard=new AdminDashboard();


        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Abonelik planı görüntüleme testi", "Admin, users sekmesini açtıktan sonra kayıtlı kullanıcıların abonelik planlarını görüntüleyebilmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Browser acilir ve kullanıcı anasayfaya gider.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.signInButtonHC);
        ReusableMethods.wait(2);

        //02_Anasyafada bulunan 'Sign In' butonuna tıklanır.

        homePage.signInButtonHC.click();
        extentTest.info("Signin butonu tıklanır.");

        //03_'Email' olarak  geçerli 'admin_email' girilir.
        homePage.emailTextBoxHC.click();
        homePage.emailTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Email kutusuna geçerli admin email girilir.");

        //04_'Password' olarak geçerli 'admin_password' girilir.
        homePage.passwordTextBoxHC.click();
        homePage.passwordTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Password kutusuna geçerli admin password girilir.");

        //05_'Login' butonu tıklanır ve admin olarak giriş yapılır.
        homePage.loginButtonHC.click();
        extentTest.info("Login butonu tıklanır.");

        //06_'Users' sekmesi tıklanır.
        homePage.usersElementHC.click();
        extentTest.info("Users sekmesi tıklanır.");

        //07_'User' sekmesinde kayıtlı kullanıcıların abonelik planının görüntülendiği doğrulanır.
        Assert.assertTrue(adminDashboard.currentPlanElementHC.isDisplayed());
        extentTest.pass("Kayıtlı kullanıcıların abonelik planı görüntülenebiliyor.");

        // 07_Browser kapatılır.
        Driver.closeDriver();
        extentTest.info("Browser kapatılır.");

    }

    //Admin olarak, kayıtlı kullanıcıların hesaplarına başarılı bir şekilde giriş yapılabilmeli ve giriş yaptıktan sonra admin hesabına geri dönülebilmelidir.
    @Test
    public void test04(){
        HomePage homePage=new HomePage();
        AdminDashboard adminDashboard=new AdminDashboard();


        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Kayıtlı kullanıcı hesabına geçiş testi", "Admin olarak, kayıtlı kullanıcıların hesaplarına başarılı bir şekilde giriş yapılabilmeli ve giriş yaptıktan sonra admin hesabına geri dönülebilmelidir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Browser acilir ve kullanıcı anasayfaya gider.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.signInButtonHC);
        ReusableMethods.wait(2);

        //02_Anasyafada bulunan 'Sign In' butonuna tıklanır.

        homePage.signInButtonHC.click();
        extentTest.info("Signin butonu tıklanır.");

        //03_'Email' olarak  geçerli 'admin_email' girilir.
        homePage.emailTextBoxHC.click();
        homePage.emailTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminEmail"));
        extentTest.info("Email kutusuna geçerli admin email girilir.");

        //04_'Password' olarak geçerli 'admin_password' girilir.
        homePage.passwordTextBoxHC.click();
        homePage.passwordTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminPassword"));
        extentTest.info("Password kutusuna geçerli admin password girilir.");

        //05_'Login' butonu tıklanır ve admin olarak giriş yapılır.
        homePage.loginButtonHC.click();
        extentTest.info("Login butonu tıklanır.");

        //06_'Users' sekmesi tıklanır.
        homePage.usersElementHC.click();
        extentTest.info("Users sekmesi tıklanır.");
        String expectedKullaniciAdi=adminDashboard.ilkKullaniciAdElementHC.getText();

        // 07_En son kayıt olan kullanıcının hesabına geçiş yapmak için 'Impersonate' butonu tıklanır.
        adminDashboard.impersonateElementHC.click();
        extentTest.info("İmpersonate butonu tıklanır.");

        // 08_Kayıtlı kullanıcının hesabına giriş yapıldığı doğrulanır.
        String actualKullaniciAdi=adminDashboard.kullaniciHesapAdielementHC.getText();
        Assert.assertEquals(actualKullaniciAdi,expectedKullaniciAdi);
        extentTest.pass("Kayıtlı kullanıcı hesabına başarılı bir şekilde giriş yapıldı.");

        //09_Kayıtlı kullanıcının hesabından çıkış yapılır.
        adminDashboard.adminedDonusElementiHC.click();
        extentTest.info("Kayıtlı kullanıcı hesabından çıkış yapılır.");

        //10_Admin hesabına geçiş yapıldığı doğrulanır.
        Assert.assertTrue(adminDashboard.adminHesapAdiElementi.isDisplayed());
        extentTest.pass("Admin hesabından kayıtlı kullanıcı hesabına geçiş yapılıp, başarılı bir şekilde admin hesabına geri dönüş yapıldı.");

        // 11_Browser kapatılır.
        Driver.closeDriver();
        extentTest.info("Browser kapatılır.");

    }
}
