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



































































































    //Hasan
































































































    //Tugce
    @FindBy(xpath = "//*[text()='Affiliations']")
    public WebElement affiliationsSekmesi;
    @FindBy(xpath = "//input[@placeholder='Copy Url']")
    public WebElement copyLinkUrl;
    @FindBy(xpath = "//*[@class = 'nav-link p-0 active']")
    public WebElement yeniPencereSayfaElementi;
    @FindBy(id = "first_name")
    public WebElement firstNameElementi;
    @FindBy(id = "last_name")
    public WebElement lastNameElementi;
    @FindBy(id = "email")
    public WebElement emailElementi;
    @FindBy(id = "password")
    public WebElement passwordElementi;
    @FindBy(id = "password_confirmation")
    public WebElement passwordConfirmationElementi;
    @FindBy(id = "privacyPolicyCheckbox")
    public WebElement privacyPolicyCheckboxElementi;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement submitButonu;
    @FindBy (id = "withdrawal-tab")
    public WebElement withdrawalSekmesi;
    @FindBy (xpath = "(//*[@class='btn btn-primary'])[2]")
    public WebElement withdrawAmountButonu;
    @FindBy (id = "withdrawAmount" )
    public WebElement enterAmountKutusu;
    @FindBy (id = "paypalEmail")
    public WebElement paypalEmailKutusu;
    @FindBy (xpath = "//*[text()='Save']")
    public WebElement saveButonu;
    @FindBy (xpath = "//*[@id='dropdownMenuButton1']")
    public WebElement userDropDown;
    @FindBy (xpath = "(//*[@class='dropdown-item text-gray-900'])[2]")
    public WebElement manageSubscriptionSekmesi;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement upgradePlanbutonu;
    @FindBy (xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div/div/div/div/div[1]/ul/li[3]/a")
    public WebElement unlimitedButonu;
    @FindBy (xpath = "(//*[contains(text(), 'Plan')])[7]")
    public WebElement unlimitedOption;
    @FindBy (id ="select2-paymentType-container")
    public WebElement selectPayment;
    @FindBy (xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto d-block makePayment'])[2]")
    public WebElement paySwitchButonElementi;
    @FindBy (xpath = "(//*[@class='select2-selection select2-selection--single'])[1]")
    public WebElement stripeDropDownu;





















































    //Cagla



































































































    //Mustafa



































































































    //Ozan
}
