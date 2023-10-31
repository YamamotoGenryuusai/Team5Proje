package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage extends UserDashboard{
    public HomePage(){PageFactory.initElements(Driver.getDriver(),this);}

   // Header/Features Link
    @FindBy(xpath="//a[text()='Features']")
    public WebElement FeaturesTextLink;

    //Homepage SignIn Button
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButton;

    //Homepage>> LoginLink>> Email Text Box // ayse
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailtextBox;

    //Homepage>> LoginLink>> Password Text Box // ayse
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

   //Homepage>> LoginLink>> Logın Butonu // ayse
   @FindBy(xpath = "//button[@class='btn btn-primary']")
   public WebElement loginButonu;

    //Homepage>> Dashboard
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement dashboardHearderTextANT;

    //Homepage>> LoginLink>> Basarısız Giris Texti
    @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
    public WebElement basarisizGirisTextiANT;






























































  //Ozgur



































































































    //Cemil



































































































    //Taha



































































































    //Gulay



































































































    //Hakan



































































































    //Hasan



































































































    //Tugce



































































































    //Cagla



































































































    //Mustafa



































































































//Ozan
    //Homepage Get Started butonu
    @FindBy(xpath = "//a[@class='btn btn-orange ']")
    public WebElement getStartedButton;
    //Home page standart Choose Plan butonu
    @FindBy(xpath = "//a[@data-id='1']")
    public WebElement choosePlan10;
    //Home page Choose plan bölümündeki Standart yazı elementi
    @FindBy(xpath = "(//h3[@class='mb-1 mt-3 fw-6'])[5]")
    public WebElement chosePlanStandardText;
    //Home page Choose plan bölümündeki Gold yazi elementi
    @FindBy(xpath = "(//h3[@class='mb-1 mt-3 fw-6'])[7]")
    public  WebElement choosePlanGoldText;
    //Home page Choose plan seçenek kaydırma butonu
    @FindBy(xpath = "//button[@class='slick-next slick-arrow']")
    public WebElement choosePlanKaydirma;

}
