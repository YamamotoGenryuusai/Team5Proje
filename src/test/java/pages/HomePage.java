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
    public WebElement dashboardHearderText;

    //Homepage>> LoginLink>> Basarısız Giris Texti
    @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
    public WebElement basarisizGirisTexti;






























































  //Ozgur



































































































    //Cemil



































































































    //Taha



































































































    //Gulay
    // Homepage >> Log in sayfasında Create an account link // Gulay
    @FindBy (xpath = "//a[@href='https://qa.smartcardlink.com/register']" )
    public WebElement createAnAccountLinkgg;
    // Home page >> Resgister sayfasında Create an account text'i // Gulay
    @FindBy(xpath = "//h1[@class='text-center mb-7']")
    public WebElement createAnAccountTextgg;
    // Home page >> Create an Acount >>  First Name Alani// Gulay
    @FindBy (xpath ="//input[@name='first_name']" )
    public WebElement cAfirstNameAlanigg;
    // Home page >> Create an Account >>  Last Name Alani// Gulay
    @FindBy (xpath ="//input[@name='last_name']" )
    public WebElement cAlastNameAlanigg;
    // Home page >> Create an Account >>  Email Alani// Gulay
    @FindBy (xpath = "//input[@name='email'] ")
    public WebElement cAEMailalanigg;
    // Home page >> Create an Account >>  Password Alani// Gulay
    @FindBy (xpath ="(//input[@type='password'])[1]" )
    public WebElement cAPasswordAlanigg;
    // Home page >> Create an Account >>  Confirm Password Alani// Gulay
    @FindBy (xpath = "(//input[@type='password'])[2]")
    public WebElement cAConfirmPasswordAlanigg;

    //Home page >> Create an Account >>  By signing up you agree to our Terms & Conditions & Privacy Policy  // Gulay
    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement cABySigningUpgg;
    // Home page >> Create an Account >> Submit Butonu // Gulay
    @FindBy(xpath = "//button[@type='submit'] ")
    public WebElement cASubmitButonugg;
   @FindBy (xpath = "//h1[@class='text-center mb-7']")
   public  WebElement basarliCreatAccountSignInText_gg;
 @FindBy(xpath = "//a[@class='nav-link p-0 active']")
 public  WebElement adminDashboardText_gg;
 // Home page >> Admin >> Enquiries Texti// Gulay
@FindBy(xpath = "//span[text()='Enquiries']")
 public WebElement adminEnquiriesText_gg;
 // Home page >> Enquiries  >> Enquiries Texti// Gulay
@FindBy (xpath = "//a[@class='nav-link p-0 active']")
 public WebElement enquiriesSayfasiEnquiriesText;
 // Home page >> Enquiries  >> View ikonu // Gulay
 @FindBy (xpath = "//*[@data-icon='eye'] ")
 public WebElement enquiriesSayfasiViewIkonu_gg;
 // Home page >> Enquiries  >> Delete ikonu // Gulay
 @FindBy (xpath = "//*[@data-icon='trash']")
 public WebElement enquiriesSayfasiDeleteIkonu_gg;
 // Home page >> Enquiries >> Enquiry Details Text’i
 @FindBy (xpath = "//h2[text()='Enquiry Details']")
 public WebElement enquiriesDetailsText;
 // Home page >> Enquiries >> Enquiry Details >> Name Text’i
@FindBy (xpath = "(//label[@class='form-label fs-6 fw-bolder text-gray-700'])[2]")
 public WebElement enquiriesDetailsName_gg;
 // Home page >> Enquiries >> Enquiry Details >> Email Text’i
 @FindBy(xpath = "(//label[@class='form-label fs-6 fw-bolder text-gray-700'])[3]")
 public  WebElement enquiriesDetailsEMail_gg;
 // Home page >> Enquiries >> Enquiry Details >> Phone Text’i
 @FindBy (xpath = "(//label[@class='form-label fs-6 fw-bolder text-gray-700'])[4]")
 public  WebElement enquiriesDetailsPhone_gg;
 // Home page >> Enquiries >> Enquiry Details >> Message Text’i
 @FindBy (xpath = "(//label[@class='form-label fs-6 fw-bolder text-gray-700'])[5]")
 public WebElement enquiriesDetailsMessage_gg;
 // Home page >> Enquiries >> Delete Penceresi >> Delete Text’i
 @FindBy(xpath = "//div[@class='swal-title']")
 public WebElement eDDeletePencereesiDeleteText;

 // Home page >> Enquiries >> Delete Penceresi >> Deleted! Text’i
 @FindBy(xpath = "//div[@*='Deleted !']")
 public WebElement deletePenceresiDeletedMesaji;

 // Home page >> Enquiries >> Delete Penceresi >> Yes Delete Butonu
 @FindBy(xpath = "//button[text()='Yes, Delete!']")
 public WebElement deletePenceresiYesDeleteButonu;








































 //Hakan



































































































    //Hasan



































































































    //Tugce



































































































    //Cagla



































































































    //Mustafa



































































































//Ozan
}
