package tests.mustafa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22_TC_01 {

    @Test void TC_01(){
        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        //03-Login sayfasinda email kutucuguna admin emaili girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

        //04-Login sayfasinda password kutucuguna admin password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        //05-Login butonuna tiklanir.
        homePage.loginButonu.click();

        //06-admin templatelerin bulunduğu alanı açabilmeli
        homePage.VcardTemplates.click();
        ReusableMethods.wait(3);


        String expectedicerik="VCard Templates";
        String actualSonucYazisi =homePage.VcardTemplates.getText();
        System.out.println(homePage.VcardTemplates.getText());
        Assert.assertEquals(actualSonucYazisi,expectedicerik);


        //07-admin templatelerin toplam sayısını ve toplam kullanım sayısını görüntüleyebilmeli


        //08-Browser kapatilir.
        Driver.closeDriver();



    }

}
