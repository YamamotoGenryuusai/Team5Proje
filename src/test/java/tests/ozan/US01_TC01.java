package tests.ozan;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US01_TC01 extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Website erişilebilirlik testi.","Kullanıcı site ana sayfaya erişebilmeli.");
        extentTest.info("Tarayıcı açılır ana sayfaya gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanıcının ana sayfaya erişilebildiği test edilir.");
        String expectedUrl="https://qa.smartcardlink.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Site ana sayfasına ulaşılamıyor.");
        extentTest.pass("Ana sayfa erişilebilirlik testi başarılı.");
        extentTest.info("Tarayıcı kapatılır.");



    }
}