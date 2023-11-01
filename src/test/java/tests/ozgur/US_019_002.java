package tests.ozgur;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

public class US_019_002 extends TestBaseRapor {
     @Test
     public void test_2(){
         Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

         extentTest = extentReports.createTest("test_2");
         extentTest.info("Sign in butonuna tıkla");
         HomePage homePage = new HomePage();
         homePage.signInButton.click();

         extentTest.info("//2-Email'i gir");
         homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

         extentTest.info("//3-Password gir");
         homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

         extentTest.info("//4-Login Butonuna tıkla");
         homePage.loginButonu.click();

         extentTest.info("//5- Plans sekmesine tıkla");
         homePage.planSekmesi.click();

         extentTest.info("//6-New Plans sekmesine tıkla");
         homePage.newPlanSekmesi.click();
         //Faker olusturma
         Faker faker = new Faker();
         String fname = faker.name().firstName();
         homePage.nameTextbox.sendKeys(fname);
         extentTest.info("Frequency girme");
         homePage.frequencyDropdown.click();

         extentTest.info("dropdown seçme");
         homePage.dropDownSearchBox.sendKeys("Unlimited");
         homePage.dropDownSearchBox.sendKeys(Keys.ENTER);

         homePage.dropDownCurrency.click();

         extentTest.info("dropdown seçme");
         homePage.dropDownSearchBox.sendKeys("USD");
         homePage.dropDownSearchBox.sendKeys(Keys.ENTER);

         homePage.priceTextbox.sendKeys("150");
         homePage.vcardTextbox.sendKeys("4242424242424242");
         homePage.trialdaysTextbox.sendKeys("10");


         JSUtilities.scrollToElement(Driver.getDriver(), homePage.checkbox1);
         ReusableMethods.wait(5);

         extentTest.info("checkbox tıklama");
         homePage.checkbox1.click();


         ReusableMethods.wait(10);

         extentTest.info("save button tıklandı");
         homePage.saveButton.click();









     }

}
