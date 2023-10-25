package tests.ozgur;

import org.testng.annotations.Test;
import utilities.*;


public class US_019 {


@Test
    public void girisTesti()
{
   Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

}




}
