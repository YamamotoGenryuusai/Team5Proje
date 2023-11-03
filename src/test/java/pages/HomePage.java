package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
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






























































































































































































































































































































































































































































































































































































































































































































































































































































































    //homepage>> home butonu//mustafa
    @FindBy(xpath = "//a[@class='nav-link active px-3 mt-1']")
    public WebElement homeButonu;
    //homepage>> features Butonu//mustafa
    @FindBy(xpath = "(//a[@class='nav-link mt-1'])[1]")
    public WebElement featuresButonu;
    //homepage>> about Butonu//mustafa
    @FindBy(xpath = "(//a[@class='nav-link mt-1'])[2]")
    public WebElement aboutButonu;
    //homepage>> pricing Butonu//mustafa
    @FindBy(xpath = "(//a[@class='nav-link mt-1'])[3]")
    public WebElement pricingButonu;
    //homepage>> contact Butonu//mustafa
    @FindBy(xpath = "(//a[@class='nav-link mt-1'])[4]")
    public WebElement contactButonu;


    //UserDashboard>> VirtualBackgrounds butonu//mustafa
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[5]")
    public WebElement VirtualBackgrounds;
    //UserDashboard>> sanal rakaplan//mustafa
    @FindBy(xpath = "//span[normalize-space()='Virtual Backgrounds']]")
    public WebElement sarkaplan;
    // UserDashboard>>Vcard name//mustafa
    @FindBy(xpath = "//span[@id='select2-e-vcard-id-container']")
    public WebElement S_Vcardname;
    // UserDashboard>> S_Vcard name//mustafa
    @FindBy(xpath = "//input[@role='searchbox']")
    public WebElement S_VcardTextBox;
    //UserDashboard>> Vcard photo//mustafa
    @FindBy(xpath = "//span[@class='picker-edit rounded-circle text-gray-500 fs-small']//label//*[name()='svg']")
    public WebElement Vcardphoto;
    //UserDashboard>> Vcard first name//mustafa
    @FindBy(xpath = "//input[@id='e-card-first-name']")
    public WebElement VcardFirstname;
    //UserDashboard>> Vcard mail box//mustafa
    @FindBy(xpath = "//input[@id='e-card-email']")
    public WebElement VcardmailBox;
    //UserDashboard>> Vcard last name//mustafa
    @FindBy(xpath = "//input[@id='e-card-last-name']")
    public WebElement Vcardlastname;
    //UserDashboard>> Vcard meslek name//mustafa
    @FindBy(xpath = "//input[@id='e-card-occupation']")
    public WebElement Vcardmeslekname;
    //UserDashboard>> Vcard lacation name//mustafa
    @FindBy(xpath = "//input[@id='e-card-location']")
    public WebElement Vcardkonum;
    //UserDashboard>> Vcard telefon//mustafa
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement Vcardtelefon;
    //UserDashboard>> Vcard internet sitesiurl//mustafa
    @FindBy(xpath = "//input[@id='e-card-website']")
    public WebElement VcardWebsiteURL;
    //UserDashboard>> Vcard Add e-card butonu//mustafa
    @FindBy(xpath = "//span[@class='picker-edit rounded-circle text-gray-500 fs-small']//label//*[name()='svg']")
    public WebElement Vcard_Add;
    //UserDashboard>> Vcard save butonu//mustafa
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Vcardsave;



    //Homepage>> Vcard templates butonu//mustafa
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement VcardTemplates;

    // homepage>>Front CMS butonu//mustafa
    @FindBy(xpath = "//span[normalize-space()='Front CMS']")
    public WebElement Front_CMS;

   // homepage>>subscribeers butonu//mustafa
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement subscribeers;



}
