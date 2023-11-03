package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {


    public AdminDashboard(){PageFactory.initElements(Driver.getDriver(),this);}

    //Admin Dashboard >> Menü >> Para Birimleri
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[12]")
    public WebElement paraBirimleriElementi;

    //Admin Dashboard >> Menü >> Users
    @FindBy(xpath = "//span[text()='Users']")
    public WebElement usersElementi;

    //Admin Dashboard >> Menü >> Users >> SearchBox
    @FindBy (xpath = "//*[@class='form-control ps-8']")
    public WebElement usersSearchBoxANT;

    //Admin Dashboard >> Menü >> Currencies
    @FindBy (xpath = "//span[text()='Currencies']")
    public WebElement paraBirimleriElementiANT;

    //Admin Dashboard >> Menü >> Currencies >> SonucYaziElementi
    @FindBy (xpath = "//*[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement paraBirimleriSonucYaziElementiANT;

    //Admin Dashboard >> Menü >> Currencies >> ParaBirimleriSayisi
    @FindBy (xpath = "//strong[text()='135']")
    public WebElement paraBirimleriSayisiElementiANT;

    //Admin Dashboard >> Menü >> Withdraw Transactions
    @FindBy (xpath = "//span[text()='Withdraw Transactions']")
    public WebElement paraCekmeIslemleriElementiANT;

    //Admin Dashboard >> Menü >> Withdraw Transactions >> webTableSatir
    @FindBy (xpath = "//tbody/tr/td[1]")
    public WebElement tableSatir;

    //Admin Dashboard >> Menü >> User>> Kullanici >> Impersonate
    @FindBy(xpath = "//tbody/tr[2]/td[4]")
    public WebElement impersonate;




















































    //Ozgur



































































































//Cemil

    // Homepage //Sign in//Admin Log in// Countries
    @FindBy(xpath ="//span[text()='Countries']")
    public WebElement countriesButtonCO;

    // Homepage //Sign in//Admin Log in// Countries
    @FindBy(xpath ="//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement countriesCountCO;

    // Homepage //Sign in//Admin Log in// Countries//States
    @FindBy(xpath ="//a[@href='https://qa.smartcardlink.com/sadmin/states' and contains(text(),'States')]")
    public WebElement stateButtonCO;

    // Homepage //Sign in//Admin Log in// Countries//States
    @FindBy(xpath ="//a[@href='https://qa.smartcardlink.com/sadmin/cities' and contains(text(),'Cities')]")
    public WebElement cityButtonCO;

    // Homepage //Sign in//Admin Log in// Countries//States Count
    @FindBy(xpath ="//div [@class='text-muted ms-sm-3 pagination-record']")
    public WebElement stateCountCO;

    // Homepage //Sign in//Admin Log in// Countries//City Count
    @FindBy(xpath ="//div [@class='text-muted ms-sm-3 pagination-record']")
    public WebElement cityCountCO;

    // Homepage //Sign in//Admin Log in// Countries//New Country
    @FindBy(xpath ="//a[@id='newCountryBtn']")
    public WebElement newcountryButtonCO;

    // Homepage //Sign in//Admin Log in// Countries//New Country // Add Name
    @FindBy(xpath ="//input[@id='countryName']")
    public WebElement addCountryButtonCO;

    // Homepage //Sign in//Admin Log in// Countries//New Country//ShortCode
    @FindBy(xpath ="//input[@id='short_code']")
    public WebElement addShortCodeCO;

    // Homepage //Sign in//Admin Log in// Countries//New Country//Phone Code
    @FindBy(xpath ="//input[@id='phone_code']")
    public WebElement addPhoneCodeCO;

    // Homepage //Sign in//Admin Log in// Countries//New Country//Save Button
    @FindBy(xpath ="//button[@id='btnSave']")
    public WebElement addSaveCountryButtonCO;























































//Taha

    //Dashboard> total active users element
@FindBy(xpath = "//div[@class='bg-cyan-300 widget-icon rounded-10 d-flex align-items-center justify-content-center']")
public WebElement totalactiveuserselement;
    //Dashboard> total deactive users element
@FindBy(xpath = "//div[@class='bg-info shadow-md rounded-10 p-xxl-10 px-7 py-10 d-flex align-items-center justify-content-between my-3']")
 public WebElement totaldeactiveuserselement;
    //Dashboard> total active VCards element
@FindBy(xpath = "//div[@class='bg-success shadow-md rounded-10 p-xxl-10 px-7 py-10 d-flex align-items-center justify-content-between my-3']")
 public WebElement totalactiveVCardselement;

// Dashboard> total deactive VCards element
 @FindBy(xpath = "//div[@class='bg-warning shadow-md rounded-10 p-xxl-10 px-7 py-10 d-flex align-items-center justify-content-between my-3']")
 public WebElement totaldeactiveVCardselement;

 //Dashboard> Plan by Users tablo elementi
 @FindBy(xpath = "//canvas[@id='dashboardPlanPieChart']")
 public WebElement PlanbyUserstabloelementi;


 //Dashboard> ıncome elementi
 @FindBy(xpath = "//canvas[@id='dashboardIncomeChart']")
 public WebElement ıncomeelementi;


 //Dashboard>Recent Users Registration> day
 @FindBy(xpath = "//button[@id='overview-tab']")
 public WebElement day;


 // Dashboard>Recent Users Registration> week
 @FindBy(xpath = "//button[@id='vweekData']")
 public WebElement week;



 // Dashboard>Recent Users Registration> month
 @FindBy(xpath = "//button[@id='monthData']")
 public WebElement month;
 @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement adminDeshboardtext;


























































//Gulay



































































































//Hakan



































































































//Hasan

      //Anasayfa>>Sıgn In>>Users
     @FindBy(xpath = "//span[text()='Users']")
     public WebElement usersElementHC;

    //Anasayfa>>Sıgn In>>Users
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement adminHesapAdiElementi;

      //Anasayfa>>Sıgn In>>Users
     @FindBy(xpath = "//span[text()='Full Name']")
     public WebElement fullNameElementHC;

     //Anasayfa>>Sıgn In>>Users
    @FindBy(xpath = "(//a[@class='mb-1 text-decoration-none fs-6'])[1]")
    public WebElement ilkKullaniciAdElementHC;

    //Anasayfa>>Sıgn In>>Users
     @FindBy(xpath = "(//th[@class='text-center'])[1]")
    public WebElement currentPlanElementHC;

    //Anasayfa>>Sıgn In>>Users
    @FindBy(xpath = "(//span[@class='badge bg-light-success'])[1]")
    public WebElement ilkKullaniciPlanElementHC;

    //Anasayfa>>Sıgn In>>Users
    @FindBy(xpath = "(//div[@class='d-flex justify-content-center'])[1]")
    public WebElement impersonateElementHC;

    //Anasayfa>>Sıgn In>>Users>>Kayıtlı Kullanıcı Hesabı
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement kullaniciHesapAdielementHC;

    //Anasayfa>>Sıgn In>>Users>>Kayıtlı Kullanıcı Hesabı
    @FindBy(xpath = "//span[@class='text-primary']")
    public WebElement adminedDonusElementiHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "//span[text()='Subscribed User Plans']")
    public WebElement subsUserPlansElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "//span[text()='User Name']")
    public WebElement supUserNameElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "(//tr/td)[1]")
    public WebElement supIlkKullaniciAdElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "//span[text()='Plan Name']")
    public WebElement supPlanNameElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "(//tr/td)[2]")
    public WebElement supIlkKullaniciPlanElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "//span[text()='Start Date']")
    public WebElement supStartDateElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "(//tr/td)[3]")
    public WebElement supIlkKullaniciStartDateElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "//span[text()='End Date']")
    public WebElement supEndDateElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "(//tr/td)[4]")
    public WebElement supIlkKullaniciEndDateElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement supIlkKullaniciPlanDetayElementHC;

    //Anasayfa>>Sıgn In>>Subscribed User Plans
    @FindBy(xpath = "(//a[@title='Edit'])[1]")
    public WebElement supIlkKullaniciEndDateEditElementHC;

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "//h5[text()='Subscribed Plan Details']")
    public WebElement subPlanDetailsElementHC;

     //Anasayfa>>Sıgn In>>Subscribed Plan Details
     @FindBy(xpath = "(//a[@class='btn px-1 text-primary fs-3 subscribed-user-plan-edit-btn'])[1]")
     public WebElement supEditButtonHC;

     //Anasayfa>>Sıgn In>>Subscribed Plan Details>>Edit Subscription Plan
     @FindBy(xpath = "//h3[@class='modal-title']")
     public WebElement espAdElementHC;







    //Tugce
    // Admin dashboard >> Affiliate Users sekmesi
    @FindBy(xpath = "(//*[text()='Affiliate Users'])[1]")
    public WebElement affiliateUsersSekmesi;
    @FindBy(xpath = "//*[@class='nav-link p-0 active']")
    public WebElement affiliateUserYaziElementi;
    @FindBy(xpath = "//*[text()='Affiliated By']")
    public WebElement affiliatedByBaslikElementi;
    @FindBy(id="perPage")
    public WebElement perPageItemi;
    @FindBy(xpath = "//*[text()='User']")
    public WebElement userBaslikElementi;
    @FindBy(xpath = "//*[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement affiliateBySonuc;
    @FindBy(xpath = "//*[text()='Affiliation Amount']")
    public WebElement affiliationAmountBaslikElementi;
    @FindBy(xpath = "//*[text()='Date']")
    public WebElement affiliationDateBaslikElementi;
    @FindBy(xpath = "//*[text()='Affiliation Transactions']")
    public WebElement affiliationTransactionsSekmesi;
    @FindBy(xpath = "//*[@class='nav-link p-0 active']")
    public WebElement affiliationTransactionsYaziElementi;
    @FindBy(xpath = "//*[text()='User']")
    public WebElement affiliationTransactionsUserElementi;
    @FindBy(xpath = "//*[text()='Amount']")
    public WebElement affiliationTransactionsAmountElementi;
    @FindBy(xpath = "//*[text()='Approval Status']")
    public WebElement affiliationTransactionsApprovalStatusElementi;
    @FindBy(xpath = "//*[@class='badge bg-warning me-2']")
    public WebElement affiliationTransactionsInProcess;
    @FindBy (xpath = "(//*[@class='modal-content'])[5]")
    public WebElement affiliationTransactionsViewDetails;
    @FindBy(xpath = "//*[text()='Date']")
    public WebElement affiliationTransactionsDateElementi;
    @FindBy(xpath = "//*[text()='Action']")
    public WebElement affiliationTransactionsActionElementi;
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-eye text-info'])")
    public WebElement affiliationTransactionsActionButonu;
    @FindBy(xpath = "(//*[@class='mb-1 text-decoration-none fs-6'])[2]")
    public WebElement affUsersKullaniciIsimElementi;
    @FindBy (xpath = "(//*[@class='mb-1 text-decoration-none fs-6'])[1]")
    public WebElement affTransactionKullaniciIsimElementi;
    @FindBy (xpath = "(//button[@type='button'])[24]")
    public WebElement affiliationTransactionsKapamaButonu;
























































    //Cagla



































































































//Mustafa



































































































//Ozan



































































































//Hasan2

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "//span[@id='subscriptionUserName']")
    public WebElement spdUserNameElementHC;

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "//span[@id='subscriptionUserName']")
    public WebElement spdPlanNameElementHC;

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "//span[@id='subscriptionPlanPrice']")
    public WebElement spdPlanPriceElementHC;

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "//span[@id='subscriptionPayableAmount']")
    public WebElement spdPayableAmountElementHC;

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "//span[@id='subscriptionEndDate']")
    public WebElement spdEndDateElementHC;

    //Anasayfa>>Sıgn In>>Subscribed Plan Details
    @FindBy(xpath = "(//button[@aria-label='Close'])[2]")
    public WebElement spdCikisElementHC;

    //Anasayfa>>Sıgn In>>Edit Subscription Plan
    @FindBy(xpath = "//label[@for='End date']")
    public WebElement espEndDateElementHC;

    //Anasayfa>>Sıgn In>>Edit Subscription Plan
    @FindBy(xpath = "//input[@id='EndDate']")
    public WebElement espEndDateTextBoxElementHC;

    //Anasayfa>>Sıgn In>>Edit Subscription Plan
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement espSaveElementHC;

    //Anasayfa>>Sıgn In>>Edit Subscription Plan
    @FindBy(xpath = "//input[@class='numInput cur-year']")
    public WebElement espYillementHC;

     //Anasayfa>>Sıgn In>>Edit Subscription Plan
     @FindBy(xpath = "//span[@class='arrowUp']")
     public WebElement espArrowUplementHC;

     //Anasayfa>>Sıgn In>>Edit Subscription Plan
     @FindBy(xpath = "(//span[@class='flatpickr-day'])[10]")
     public WebElement espGunElement;



















































    //
}
