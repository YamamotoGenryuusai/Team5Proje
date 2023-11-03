package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage extends UserDashboard {
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
    @FindBy(xpath = "//*[text()=\"Plans\"]")
    public WebElement planSekmesi;

    @FindBy(xpath = "//a[@class='btn btn-primary ms-auto']")
    public WebElement newPlanSekmesi;

    @FindBy(xpath = "//a[@title='Delete'][1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement deleteYesButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement uyelikPlani;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement nameTextbox;

    @FindBy (xpath = "//*[@id=\"price\"]")
    public WebElement priceTextbox;

    @FindBy(xpath = "//*[@id=\"no_of_vcards\"]")
    public WebElement vcardTextbox;

    @FindBy(xpath = "//*[@id=\"trial_days\"]")
    public WebElement trialdaysTextbox;

    @FindBy(xpath = "//*[@id=\"select2-frequency-container\"]")
    public WebElement frequencyDropdown;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement dropDownSearchBox;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement dropDownCurrencysearchbox;

    @FindBy(xpath = "//*[@id=\"select2-currency_id-container\"]")
    public WebElement dropDownCurrency;

    @FindBy(xpath = "//*[@alt='Template 1'][1]")
    public WebElement template;

    @FindBy(xpath = "//*[@id=\"featureAll\"]")
    public WebElement checkbox1;

    @FindBy(xpath = "//*[@id=\"planFormSubmit\"]")
    public WebElement saveButton;


















































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

    //Homepage >> SignIn
  @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
  public WebElement signInButtonHT;

    //Homepage >> SignIn >> EmailTextBox
  @FindBy(xpath = "//input[@id='email']")
  public WebElement emailtextBoxHT;

    //Homepage >> SignIn >> PassworddTextBox
  @FindBy(xpath = "//input[@id='password']")
  public WebElement passwordTextBoxHT;

    //Homepage >> SignIn >> LoginButonu
  @FindBy(xpath = "//button[@class='btn btn-primary']")
  public WebElement loginButonuHT;























































































    //Hasan

    //Anasayfa>>footer
    @FindBy(xpath = "//div[text()=' © 2023 Copyright by ']")
    public WebElement CopyrightElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "//a[@title='Facebook']")
    public WebElement facebookElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "//a[@title='Twitter']")
    public WebElement xElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "//a[@title='Instagram']")
    public WebElement instagramElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "//a[@title='Linkedin']")
    public WebElement linkedinElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "//a[@title='Pinterest']")
    public WebElement pinterestElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "(//a[@class='text-decoration-none link-info fs-6'])[1]")
    public WebElement termsConditonsElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "(//a[@class='text-decoration-none link-info fs-6'])[2]")
    public WebElement privacyPolicyElementHC;

    //Anasayfa>>footer
    @FindBy(xpath = "(//a[@class='text-decoration-none link-info fs-6'])[3]")
    public WebElement faqElementHC;

    //Homepage SignIn Button
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonHC;

    //Homepage>> LoginLink>> Email Text Box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBoxHC;

    //Homepage>> LoginLink>> Password Text Box
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBoxHC;

    //Homepage>> LoginLink>> Logın Butonu
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButtonHC;

    //Anasayfa>>Sıgn In>>Users
    @FindBy(xpath = "//span[text()='Users']")
    public WebElement adminUsersElementHC;

    //Anasayfa>>Sıgn In>>Users
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement usersDogrulamaElementHC;







































    //Tugce
    // Admin HomePage >> Signin Butonu
    @FindBy(xpath = "//*[@class = 'btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement adminSigninButonu;
    // Admin HomePage >> Admin Email Box
    @FindBy(id = "email")
    public WebElement adminEmailBox;
    // Admin HomePage >> Admin Email Box
    @FindBy(id = "password")
    public WebElement adminPasswordBox;
    // Admin HomePage >> Admin Login Butonu
    @FindBy(xpath = "//*[@type = 'submit']")
    public WebElement adminLoginButonu;
    // Admin HomePage >> Admin user name
    @FindBy(xpath = "//*[text()='admin13 admin']")
    public WebElement adminUserName;
    // Admin kullanici dropdown sekmesi
    @FindBy(id="dropdownMenuButton1")
    public WebElement adminKullaniciDropDown;
    // Admin HomePage >> Admin dashboard butonu
    @FindBy(xpath = "//*[@class='nav-link p-0 active']")
    public WebElement dashboardButonu;














































































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
    //Home page Contact Us bölümü mail adresi
    @FindBy(xpath = "//a[@class='text-decoration-none text-secondary contact-info__contact-label']")
    public WebElement contactUsMailText;
    //Home page Contact Us yazisi locate
    @FindBy(xpath = "//h2[@class='heading text-success text-center margin-b-80px mb-5']")
    public WebElement contactUsText;
    //Home page Contact Us bölümü telefon yazısı
    @FindBy(xpath = "//a[text()='+1 987-654-3210']")
    public WebElement contactUsPhoneText;
    //Home page Contact Us bölümü name textbox'ı
    @FindBy(xpath = "//input[@id='name']")
    public WebElement homePageNameTextbox;
    //Home page Contact Us bölümü email textbox'ı
    @FindBy(xpath = "//input[@id='email']")
    public WebElement homePageEmailTextBox;
    //Home page Contact Us bölümü subject textbox'ı
    @FindBy(xpath = "//input[@id='subject']")
    public WebElement homePageSubjectTextBox;
    //Home page Contact Us bölümü Message textbox'ı
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement homePageMessageTextBox;
    //Home page Contact Us bölümü Send Message Butonu
    @FindBy(xpath = "//input[@id='submit']")
    public WebElement homePageSubmitButton;

}
