package tests.hasan;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

import java.io.IOException;

public class US_24_TC01_08 extends TestBaseRapor {


    // Admin bilgileri ile 'https://qa.smartcardlink.com/' sitesine başarılı bir şekilde giriş yapılabilmelidir.
    @Test
    public void test01() {

        HomePage homePage = new HomePage();

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
        extentTest.info("Browser kapatılır.");
    }



    //Admin bilgileri ile giriş yaptıktan sonra 'Users' sekmesi görünür ve tıklanabilir olmalıdır. Ayrıca, tıklama işlemi doğru sayfaya yönlendirmelidir.
    @Test
    public void test02() {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "'Users' sekmesi görünür ve tıklanabilir olmalıdır. Ayrıca, tıklama işlemi doğru sayfaya yönlendirmelidir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır ve doğru sayfaya yönlendirdiği doğrulanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        String expectedUrlIcerik = "subscribedPlans";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        extentTest.pass("Click işlemi doğru sayfaya yönlendirdi.");

        // 07_Browser kapatılır.
        extentTest.info("Browser kapatılır.");

    }

    //Subscribed User Plans sayfasına geçildiğinde, 'User name' sütun başlığı altında kayıtlı kullanıcı adının görülebilmesi gerekmektedir.
    @Test
    public void test03() {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "'User name' sütun başlığı altında kayıtlı kullanıcı adının görülebilmesi gerekmektedir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        //07_'Subscribed User Plans' sayfasında 'User name' sütun başlığının görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.supUserNameElementHC.isDisplayed());
        extentTest.pass("User name sütun başlığı görünür.");

        //08_’Subscribed User Plans' sayfasında 'User name' başlığı altında kullanıcı adı olduğu doğrulanır.
        Assert.assertTrue(homePage.supIlkKullaniciAdElementHC.isDisplayed());
        extentTest.pass("Kayıtlı kullanıcı adı görünür. Kayıtlı kullanıcı adı: "+ homePage.supIlkKullaniciAdElementHC.getText());

        // 09_Browser kapatılır.
        extentTest.info("Browser kapatılır.");
    }

    //Subscribed User Plans sayfasına geçildiğinde, 'Plan name' sütun başlığı altında kullanıcının plan adının görülebilmesi gerekmektedir.
    @Test
    public void test04() {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "Plan name' sütun başlığı altında kullanıcının plan adının görülebilmesi gerekmektedir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        //07_'Subscribed User Plans' sayfasında ‘Plan name' sütun başlığının görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.supPlanNameElementHC.isDisplayed());
        extentTest.pass("Plan name sütun başlığı görünür.");

        //08_’Subscribed User Plans' sayfasında 'Plan name' başlığı altında kullanıcıya ait planın olduğu doğrulanır.
        Assert.assertTrue(homePage.supIlkKullaniciPlanDetayElementHC.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Kayıtlı kullanıcı plan adı görünür. Kullanıcıya ait plan : "+ homePage.supIlkKullaniciPlanElementHC.getText());

        // 09_Browser kapatılır.
        extentTest.info("Browser kapatılır.");
    }

    //Subscribed User Plans sayfasına geçildiğinde, 'Start Date' sütun başlığı altında kullanıcının üyelik başlangıç tarihinin görülebilmesi gerekmektedir.
    @Test
    public void test05() {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "'Start Date' sütun başlığı altında kullanıcının üyelik başlangıç tarihinin görülebilmesi gerekmektedir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        //07_'Subscribed User Plans' sayfasında ‘Start date’ sütun başlığının görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.supStartDateElementHC.isDisplayed());
        extentTest.pass("Start date sütun başlığı görünür.");

        //08_’Subscribed User Plans' sayfasında 'Star date' başlığı altında kullanıcı plan başlagıç tarihi yer aldığı doğrulanır.
        Assert.assertTrue(homePage.supIlkKullaniciStartDateElementHC.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Kayıtlı kullanıcı plan başlangıç tarihi görünür. Kullanıcı plan başlangıç tarihi : "+ homePage.supIlkKullaniciStartDateElementHC.getText());

        // 09_Browser kapatılır.
        extentTest.info("Browser kapatılır.");
    }

    //Subscribed User Plans sayfasına geçildiğinde, 'End Date' sütun başlığı altında kullanıcının üyelik bitiş tarihinin görülebilmesi gerekmektedir.
    @Test
    public void test06() {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "'End Date' sütun başlığı altında kullanıcının üyelik bitiş tarihinin görülebilmesi gerekmektedir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        //07_'Subscribed User Plans' sayfasında ‘End date’ sütun başlığının görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.supEndDateElementHC.isDisplayed());
        extentTest.pass("End date sütun başlığı görünür.");

        //08_’Subscribed User Plans' sayfasında 'End date' başlığı altında kullanıcı plan bitiş tarihi yer aldığı doğrulanır.
        Assert.assertTrue(homePage.supIlkKullaniciEndDateElementHC.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Kayıtlı kullanıcı plan bitiş tarihi görünür. Kullanıcı plan bitiş tarihi : "+ homePage.supIlkKullaniciEndDateElementHC.getText());

        // 09_Browser kapatılır.
        extentTest.info("Browser kapatılır.");
    }

    //Subscribed User Plans sayfasına geçildiğinde, kayıtlı kullanıcının plan ayrıntılarının görüntülenebilmesi gerekmektedir.
    @Test
    public void test07() throws IOException {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "'End Date' sütun başlığı altında kullanıcının üyelik bitiş tarihinin görülebilmesi gerekmektedir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        //07_'Subscribed User Plans' sayfasında kayıtlı kullanıcı plan ayrıntılarını görmek için 'Action' altında göz ikonu tıklanır.
        homePage.supIlkKullaniciPlanDetayElementHC.click();
        ReusableMethods.wait(2);
        extentTest.info("kullanıcı plan ayrıntılarını görmek için 'Action' altında göz ikonu tıklanır.");

        //08_Açılan popup’ın plan detaylarını gösterdiği doğrulanır ve popup kapatılır.
        Assert.assertTrue(homePage.subPlanDetailsElementHC.isDisplayed());
        ReusableMethods.wait(2);
        ReusableMethods.getScreenshot("Subs Plain Details");
        extentTest.pass("Kullanıcı plan detayları görüntülenebiliyor.");

        homePage.spdCikisElementHC.click();
        extentTest.info("Açılan popup kapatılır.");

        //09_Browser kapatılır.
        extentTest.info("Browser kapatılır.");
    }

    //Subscribed User Plans sayfasına geçildiğinde, kayıtlı kullanıcının üyelik bitiş tarihinin başarılı bir şekilde değiştirilebilmesi gerekmektedir.
    @Test
    public void test08() {

        HomePage homePage = new HomePage();

        //01_Browser açılır ve ziyaretçi https://qa.smartcardlink.com anasayfasına gider.
        extentTest = extentReports.createTest("Subscribed User Plans sekmesi testi", "'End Date' sütun başlığı altında kullanıcının üyelik bitiş tarihinin görülebilmesi gerekmektedir.");
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

        //06_'Subscribed User Plans' sekmesi tıklanır.
        homePage.subsUserPlansElementHC.click();
        extentTest.info("Subscribed User Plans sekmesi tıklanır.");

        //07_'Subscribed User Plans' sayfasında kayıtlı kullanıcı plan ayrıntılarını görmek için 'Action' altında düzenleme ikonu tıklanır.
        homePage.supEditButtonHC.click();
        ReusableMethods.wait(2);
        extentTest.info("Kayıtlı kullanıcı plan ayrıntılarını görmek için 'Action' altında düzenleme ikonu tıklanır.");

        //08_Düzenleme popup’ının açıldığı doğrulanır.
        Assert.assertTrue(homePage.espAdElementHC.isDisplayed());
        extentTest.pass("Düzenleme popup'ı görüntülenebiliyor.");
        //Kullanıcı plan bitiş tarihi kaydedilir.
        String expectedTarih=homePage.supIlkKullaniciEndDateElementHC.getText();

        //09_Açılan popup'da kayıtlı kullanıcının üyelik bitiş tarihi değiştirilir.
        homePage.espEndDateTextBoxElementHC.click();
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.espYillementHC);
        homePage.espArrowUplementHC.click();
        homePage.espGunElement.click();
        extentTest.info("Kullanıcıya ait üyelik bitiş tarihi değiştirildi.");

        //10_Save butonu tıklanır ve popup kapatılır.
        homePage.espSaveElementHC.click();
        extentTest.info("Üyelik bitiş tarih değişikliği kaydedilir.");
        ReusableMethods.wait(2);

        //11_Üyelik bitiş tarihinin değiştirildiği doğrulanır.
        String actualTarih=homePage.supIlkKullaniciEndDateEditElementHC.getText();
        Assert.assertNotEquals(actualTarih,expectedTarih);
        extentTest.pass("Kullanıcı plan bitiş tarihi başarıyla değiştirildi.");

        //12_Browser kapatılır.
        extentTest.info("Browser kapatılır.");
    }
}
