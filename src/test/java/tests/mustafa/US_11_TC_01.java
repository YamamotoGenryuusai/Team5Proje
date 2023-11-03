package tests.mustafa;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US_11_TC_01 {

    @Test void TC_01() {
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasinda email kutucuguna kullanıcı emaili girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scKullaniciEmail"));

        //04-Login sayfasinda password kutucuguna kullanıcı password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scKullaniciPassword"));

        //05-Login butonuna tiklanir.
        homePage.loginButonu.click();

        //06-kullanıcı sanal arka planlar menüsüne clik yapabilmeli

        homePage.VirtualBackgrounds.click();
        ReusableMethods.wait(2);

        //07-kullanıcı sanal arka plan kartlarından birini seçebilmeli
        homePage.sarkaplan.click();
        ReusableMethods.wait(2);

       /* ReusableMethods.wait(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//div[@class='flip-box-back'])[2]"))).pause(Duration.ofSeconds(3000)).build().perform();
        actions.click(Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div[2]/a/img"))).build().perform();*/

        //08-kullanıcı ilgili bilgileri girebilmeli
        homePage.S_Vcardname.click();
        homePage.S_VcardTextBox.click();
        homePage.S_VcardTextBox.sendKeys("mustafa"+ Keys.ENTER);
        Faker faker=new Faker();
        String firstname=faker.name().name();
        homePage.VcardFirstname.sendKeys(firstname);
       String lastname=faker.name().lastName();
       homePage.Vcardlastname.sendKeys(lastname);
       String email=faker.internet().emailAddress();
       homePage.VcardmailBox.sendKeys(email);
       String occupation=faker.job().title();
       homePage.Vcardmeslekname.sendKeys(occupation);
       String location=faker.address().city();
       homePage.Vcardkonum.sendKeys(location);
       String tlpohone=faker.phoneNumber().phoneNumber();
       homePage.Vcardtelefon.sendKeys(tlpohone);
       String websitesiURL="https://www."+faker.internet().domainName();
       homePage.VcardWebsiteURL.sendKeys(websitesiURL);
       ReusableMethods.wait(2);
       homePage.Vcard_Add.click();ReusableMethods.wait(2);
       String fileinput="C:\\Users\\pc\\OneDrive\\Masaüstü\\kuzgun.jpeg";
       ReusableMethods.wait(2);
       homePage.Vcard_Add.sendKeys(fileinput);
       ReusableMethods.wait(5);


        //09-kullanıcı sanal kart kaydını tamamlayabilmeli
      //  homePage.Vcardsave.click();
       // ReusableMethods.wait(5);

        //10-Browser kapatilir.
        Driver.closeDriver();

    }
}
