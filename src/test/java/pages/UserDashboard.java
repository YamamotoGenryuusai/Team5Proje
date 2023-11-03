package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AdminDashboard;
import utilities.Driver;

public class UserDashboard extends AdminDashboard {

    public UserDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //User Dashboard >> Dashboard >> Kullanıcı isim
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement userName;

    //User Dashboard >> DMenü >> Appointments
    @FindBy(xpath = "//span[text()='Appointments']")
    public WebElement appointmentsElementi;

    //User Dashboard >> DMenü >> Appointments Table
    @FindBy(xpath = "//*[@class='table table-striped']")
    public WebElement appointmentsWebTable;








































































    //Ozgur

































































































    //Cemil

    //Homepage>> Login >> Dashboard >> Vcard ||
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[2]")
    public WebElement dashboardVcardButonu;

    //Homepage>> Login >> Dashboard >> Total Active Vcard ||
    @FindBy(xpath = "//div[@class='text-end text-white'][1]")
    public WebElement dashboardPageElement1;





























































































    //Taha
//anasayfa header bölümü Kullanici profili dropdown menüsü
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement userprofile;
    //kullanıcı profılı > Manage Subscription locator
    @FindBy(xpath = "//button[@class='btn dropdown-toggle ps-2 pe-0'] ")
    public WebElement kullaniciProfiliDropdownMenü;
    //Manage Subscription > upgrade plan butonu locaterı
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement upgradeplanbutton;
    //Manage Subscription >Silver plan > Switch Plan
    @FindBy(xpath = "(//a[@class='btn btn-primary rounded-pill mx-auto '])[2]")
    public WebElement Switchplanebutton1;
    //Manage Subscription>Silver plan > Switch Plan> Stripdropdown
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
    public WebElement StripDropdown;

    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--selectable']")
    public WebElement Striptext;
    //Manage Subscription>Silver plan > Switch Plan> Pay/Switch plan
    @FindBy(xpath = "(//button[@class='btn btn-primary rounded-pill mx-auto d-block makePayment'])[2]")
    public WebElement paySwitchPlanbutton;
    //ÖDEME SAYFASI
    @FindBy(xpath = "//input[@name='cardNumber']")
    public WebElement credicardnumber;
    @FindBy(xpath = "//input[@name='cardExpiry']")
    public WebElement date;
    @FindBy(xpath = "//input[@name='cardCvc']")
    public WebElement cvc;
    @FindBy(xpath = "//input[@class='CheckoutInput Input Input--empty']")
    public WebElement cardname;
    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement pay;
    @FindBy(xpath = "//a[@class='btn mt-5 btn-back']")
    public WebElement backtoSubscriptionsbutton;

    // Manage Subscription > upgrade plan butonu > Unlimited elementi
    @FindBy(xpath = "//a[@href='#unlimited']")
    public WebElement unlimitedbuttonelementi;
    //Manage Subscription > upgrade plan butonu > Unlimited elementi > Switch plan butonu
    @FindBy(xpath = "//a[@data-id='4'] ")
    public WebElement switchPlanbutton2;
    //Manage Subscription > upgrade plan butonu > Unlimited elementi > Switch plan butonu> select payment gateway butonu
    @FindBy(xpath = "//span[@id='select2-paymentType-container'] ")
    public WebElement selectpaymentgatewaybutton;
    //Manage Subscription > upgrade plan butonu > Unlimited elementi > Switch plan butonu> select payment gateway butonu> Stripe>
    @FindBy(xpath = "//option[@data-select2-id='select2-data-13-2bl8'] ")
    public WebElement stripeButton;
    //Manage Subscription > upgrade plan butonu > Unlimited elementi > Switch plan butonu> select payment gateway butonu> Stripe> Pay/Switch butonu
    @FindBy(xpath = "(//button[@class='btn btn-primary rounded-pill mx-auto d-block makePayment'])[2] ")
    public WebElement paySwitchbutton;
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[6] ")
    public WebElement SinirsizKullaniciAffiliationsButton;
    @FindBy(xpath = "//button[@id='copyLinkBtn'] ")
    public WebElement CopyButton;
    @FindBy(xpath = "//a[@class='btn btn-primary sendInviteBtn'] ")
    public WebElement SendInviteButton;
    @FindBy(xpath = "(//h5[@class='modal-title'])[2] ")
    public WebElement SendEmailText;
//kullanıcı profılı dropdownmenü
    @FindBy(xpath = "(//a[@class='dropdown-item text-gray-900'])[2] ")
public WebElement ManageSubscriptionbutton;
@FindBy(xpath = "//a[@class='nav-link p-0 active']")
public WebElement Dashboardtext;
//Affiliations butonu
@FindBy(xpath = "//button[@id='affiliation-tab']")
public WebElement affilitionmenübutton;
    //Affiliations> Total Affiliation Amount>
@FindBy(xpath = "(//h2[@class='fw-bolder text-white'])[1]")
    public WebElement totalAffilitionAmountElement;

@FindBy(xpath = "(//h2[@class='fw-bolder text-white'])[1]")
    public WebElement currentamountelementi;
   // affiliations> send ınvıte butonu> email adress elementi
@FindBy(xpath = "//input[@id='email']")
    public WebElement emailadresselementi;
    //affiliations> send ınvıte butonu>Send Email butonu
    @FindBy(xpath = "//button[@class='btn btn-primary sendmailbtn']")
public WebElement sendemailbuttonu;

    //affiliations>withdrawal
    @FindBy(xpath = "//button[@id='withdrawal-tab']")
    public WebElement withdrawal;
    //Affiliations > Withdrawalbutonu>Withdraw Amountbutonu>
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement withdrawAmountbutton;
    @FindBy(xpath = "//input[@id='withdrawAmount']")
    public WebElement amounttext;


    //Withdraw Amount>verify  Email =
    @FindBy(xpath = "//input[@id='paypalEmail']")
    public WebElement paypalEmail;
    @FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
    public WebElement savebutonu;





    //Gulay



































































































    //Hakan



































































































    //Hasan



































































































    //Tugce



































































































    //Cagla



































































































    //Mustafa





































































































    //Ozan
    //standart kullanıcı dasboard Vcard button
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[2]")
    public WebElement vcardButton;
    //Vcard bölümü edit butonu
    @FindBy(xpath = "//a[@class='btn px-1 text-primary fs-3']")
    public WebElement editButtonOK;
    //Vcard edit bölümü Url generate butonu
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement urlGenerateButton;
    //Vcard edit bölümü VcardNameTextboxi
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement vcardNameTextbox;
    //Vcard edit OccupationTextBox
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement occupationOK;
    //Vcaard edit Description TextBox
    @FindBy(xpath = "//*[@id=\"vcardDescriptionQuill\"]/div[1]")
    public WebElement descriptionOK;
    //Vcard edit VCard Details text
    @FindBy(xpath = "//h4[@class='fw-bolder text-gray-800 mb-5']")
    public WebElement vcardDetailsText;
    //Vcard edit butonu First name text box
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameTextBoxOK;
    //Vcard edit butonu First name text box
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameTextBoxOK;
    //Vcard edit butonu email text box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBoxOK;
    //Vcard edit butonu phone number text box
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumberTextBoxOK;
    //Vcard edit butonu location text box
    @FindBy(xpath = "//textarea[@id='location']")
    public WebElement locationTextBoxOK;
    //Vcard edit butonu date of birth text box
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBoxOK;
    //Vcard edit butonu company text box
    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyTextBoxOK;
    //Vcard edit butonu job title text box
    @FindBy(xpath = "//input[@id='job_title']")
    public WebElement jobTitleTextBoxOK;
    //Vcard edit butonu default language menu
    @FindBy(xpath = "//span[@id='select2-default_language-container']")
    public WebElement defaultLanguageBoxOK;
    //Vcard edit butonu default language textbox
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement defaultLanguageTextBoxOK;
    //Vcard edit butonu basic details bölümü download size
    @FindBy(xpath = "//input[@id='qrCodeDownloadSize']")
    public WebElement qrCodeDownloadSize;
    //Vcard edit butonu basic details bölümü save button
    @FindBy(xpath = "//input[@id='vcardSaveBtn']")
    public WebElement saveButtonOK;
    //Vcard edit butonu  VCard templates button
    @FindBy(xpath = "//a[@class='nav-link p-4 ']")
    public WebElement vcardTemplatesButtonOK;
    //Vcard edit butonu  VCard 2. template
    @FindBy(xpath = "//*[@id=\"editForm\"]/div[2]/div/div[1]")
    public WebElement templateOK2;
    //Vcard edit butonu Basic Details Button
    @FindBy(xpath = "//a[@class='nav-link p-4  ']")
    public WebElement basicDetailsOK;

    //templates save button
    @FindBy(xpath = "//button[@class='btn btn-primary me-3 template-save']")
    public WebElement templatesSaveButton;
    //Business Hour butonu
    @FindBy(xpath = "//a[@class='nav-link p-4 ']")
    public WebElement businessHoursButton;

    //business hour monday check box
    @FindBy(xpath = "//input[@class='form-check-input feature mx-2']")
    public WebElement mondayOK;
    //business hour saat text
    @FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
    public WebElement hoursSelectOK;
    //hours select text box
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement hoursSelectTextbox;
    //business hour save button
    @FindBy(xpath = "//button[@class='btn btn-primary me-3']")
    public WebElement businessSaveButtonOK;
    //services button
    @FindBy(xpath = "(//li[@class='nav-item position-relative'])[4]")
    public WebElement servicesButton;
    //edit Vcard service bölümü text box
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement serviceNameTextBox;
    //edit cvard service add service butonu
    @FindBy(xpath = "//a[@id='addServiceBtn']")
    public WebElement addServiceButton;
    //edit cvard service bölümü add butonu service url
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement serviceUrl;
    //edit cvard service bölümü add butonu Description
    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement descriptionAddServiceOK;
    //new service save button edit vcardda services bolumu new service
    @FindBy(xpath = "//button[@class='btn btn-primary m-0']")
    public WebElement serviceSaveButton;
    //new service save button edit vcardda services bolumu new service
    @FindBy(xpath = "/html/body/div/div/div[3]/div[2]/div/div/div[3]/div/div[1]/div/ul/div/li[6]/a")
    public WebElement socialLinksButton;
    //social links youtube textbox
    @FindBy(xpath = "(//input[@class='form-control'])[8]")
    public WebElement youtubeTextbox;
    //social links twitter textbox
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement twitterTextBox;
    //social links linkedin textbox
    @FindBy(xpath = "(//input[@class='form-control'])[9]")
    public WebElement linkedinTextBox;
    //social links save button
    @FindBy(xpath = "//button[@class='btn btn-primary me-3 social_link_save']")
    public WebElement socialSaveButton;
    //Fonts button
    @FindBy(xpath = "/html/body/div/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[1]/div/ul/div/li[7]/a")
    public WebElement fontsButton;
    //font  family dropdown
    @FindBy(xpath = "//*[@id=\"select2-font_family-container\"]")
    public WebElement fontFamilyDropDown;
    //font family textbox
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement fontFamilTextBox;
    //front size text box
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement frontSizeTextBox;
    //fonts save button
    @FindBy(xpath = "//button[@class='btn btn-primary me-3']")
    public WebElement fontsSaveButton;
    //Privacy policy button
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div/div[3]/div/div[1]/div/ul/div/li[8]/a")
    public WebElement privacyPolicyButton;
    //Privacy policy text box
    @FindBy(xpath = "//div[@class='ql-editor']")
    public WebElement privacyPolicyTextbox;
    //privacy save button
    @FindBy(xpath = "//*[@id=\"privacyPolicySave\"]")
    public WebElement privacySaveButton;
    //Terms & Conditions button
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div/div[3]/div/div[1]/div/ul/div/li[9]/a")
    public WebElement termsButton;
    //Terms textbox
    @FindBy(xpath = "//*[@id=\"termConditionQuill\"]/div[1]/p")
    public WebElement termsTextBox;
    //terms save button
    @FindBy(xpath = "//button[@class='btn btn-primary me-3']")
    public WebElement termsSaveButton;
//hesap drowdown menu
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement hesapDropDown;
    //Sign Out button
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/header/ul/li[2]/div/div[2]/ul/li[5]/a/span[2]")
    public WebElement signOutButtonOK;
    //basic save başarılı bıldırımı
    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement basicBildirim;
    //services resim upload button
    @FindBy(xpath = "//*[@id=\"addServiceForm\"]/div[1]/div[4]/div/div/span/label")
    public WebElement servicesUploadButton;
    //services name text
    @FindBy(xpath = "//label[@class='form-label required']")
    public WebElement serviesNameText;
    //previewUrl button
    @FindBy(xpath = "//*[@id=\"vcardUrl871\"]")
    public WebElement previewUrlButton;

    //testimonial button
    @FindBy(xpath = "(//li[@class='nav-item position-relative'])[5]")
    public WebElement testimonialsButton;
    //add testimonial button
    @FindBy(xpath = "//a[@id='addTestimonialBtn']")
    public WebElement addTestimonialButton;
    //name textbox testimonial
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement nameTestimonial;
    //
    //description textbox testimonial
    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement descriptionTestimonial;
    //testimonial resim upload buttun
    @FindBy(xpath = "//*[@id=\"profileImageIcon\"]")
    public WebElement testimonialUploadButton;
    //testimonial save button
    @FindBy(xpath = "//button[@id='testimonialSave']")
    public WebElement testimonialSaveButton;
    //VCard prewiew Url bölümü
    //Preview Url paylaş butonu
    @FindBy(xpath = "//*[@id=\"body\"]/div[2]/div[2]/div/div[2]/div/button/i")
    public WebElement paylasButonuOK;
    //Preview Url telefon butonu
    @FindBy(xpath = "(//a[@class='event-name text-center pt-3 mb-0 text-decoration-none'])[2]")
    public WebElement phoneButtonOK;
    //Preview Url home button
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[7]/div[4]/div[1]/a")
    public WebElement homeButtonOK;
    //Preview Url mail button
    @FindBy(xpath = "(//a[@class='event-name text-center pt-3 mb-0 text-decoration-none'])[1]")
    public WebElement mailButtonOK;
    //Preview Url twitter button
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement twitterButton;
    //Preview Url youtube button
    @FindBy(xpath = "(//a[@target='_blank'])[2]")
    public WebElement youtubeButton;
    //Preview Url linkedin button
    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement linkedinButtonOK;
    //hitmez button
    @FindBy(xpath = "(//a[@target='_blank'])[4]")
    public WebElement hizmetButton;
    //şartlar ve politikalar button
    @FindBy(xpath = "//a[@class='text-decoration-none text-dark cursor-pointer']")
    public WebElement sartlarButton;
    //hizmetlerimiz text
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[6]/div/div/div/div")
    public WebElement hizmetlerimizText;
}














