package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.AdminDashboard;
import utilities.Driver;

public class UserDashboard extends AdminDashboard {

    public UserDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
























































































    //Ozgur



































































































    //Cemil

































































































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


































    //Gulay



































































































    //Hakan

    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//*[@id='sidebar']/div[2]/ul/li[6]/a/span[2]")
    public WebElement settingsButonu;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement settingsHearder;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//h1")
    public WebElement credentials;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//*[@id='stripeEnable']")
    public WebElement stripeCheckbox;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@placeholder='Stripe key']")
    public WebElement stripeKey;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@placeholder='Stripe Secret']")
    public WebElement stripeSecret;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//*[@id='paypalEnable']")
    public WebElement paypalCheckbox;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@placeholder='Paypal Client Id']")
    public WebElement paypalClientId;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@placeholder='Paypal Secret']")
    public WebElement paypalSecret;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@placeholder='Paypal Mode']")
    public WebElement paypalMode;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//*[@id='select2-userCurrencySettingId-container']")
    public WebElement currency;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement currencyTextBox;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//*[@id='select2-userCurrencySettingId-result-3g5x-2']")
    public WebElement euro;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//label[@for='time_format-1']")
    public WebElement timeFormatButonu;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@name='enable_contact']")
    public WebElement enableContactCheckBox;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@name='hide_stickybar']")
    public WebElement hideStickybarCheckBox;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//input[@name='whatsapp_share']")
    public WebElement whatsappShareCheckBox;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButonu;
    //Anasayfa>>UserDashboard>>Settings
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement updateSuccessfullyMessage;










































    //Hasan



































































































    //Tugce



































































































    //Cagla



































































































    //Mustafa



































































































    //Ozan
}
