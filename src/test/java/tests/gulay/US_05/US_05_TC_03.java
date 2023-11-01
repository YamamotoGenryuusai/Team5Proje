package tests.gulay.US_05;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_03 {
    @Test
    public void US_05_TC_03 () {
        //1-	Browser acilir
        //2-	Adres çubuğuna anasayfa URL girilir, Enter tusuna tiklanir.3-Sitenin ana sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);
        //4-	Sign in butonuna tıklanır
        HomePage homePage= new HomePage();
        homePage.signInButton.click();
        //5-	Create an account butonu tıklanır
        homePage.createAnAccountLinkgg.click();
        //6-	First name alanı doldurulur
        Faker faker= new Faker();
       String  password= faker.internet().password(9,12,true,true);

        homePage.cAfirstNameAlanigg.sendKeys(faker.name().firstName());
        //6-	Last name alanı doldurulur
        homePage.cAlastNameAlanigg.sendKeys(faker.name().lastName());
        // 7-	Email alanı doldurulur
        homePage.cAEMailalanigg.sendKeys(faker.internet().emailAddress());
        //8-	Password alanı doldurulur
        homePage.cAPasswordAlanigg.sendKeys(password);
        // 9-	Confirm Password alanı doldurulur
        homePage.cAConfirmPasswordAlanigg.sendKeys(password);
        //10-	By signing up you agree to our Terms & Conditions & Privacy Policy” butonu tıklanır
        homePage.cABySigningUpgg.click();
        // 11-	Submit butonu tıklanır.
        homePage.cASubmitButonugg.click();
        //12-	Sign in yazısının göründüğünü doğrulanır
        // "You have registered successfully" mesajı cok kısa surede kayboldugu icin
        // basarili giris yapidiginda yonlend,rd,g, sayfadan "Sign In" textinin goruntulendigi test edildi
        Assert.assertTrue(homePage.basarliCreatAccountSignInText_gg.isDisplayed());








    }
}
