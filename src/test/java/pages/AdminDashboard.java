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


   //Admin Dashboard >> Menü >> Withdraw Transactions
    @FindBy (xpath = "//span[text()='Withdraw Transactions']")
    public WebElement paraCekmeIslemleriElementiANT;

    //Admin Dashboard >> Menü >> Currencies
    @FindBy (xpath = "//span[text()='Currencies']")
    public WebElement paraBirimleriElementiANT;

    //Admin Dashboard >> Menü >> Currencies >> SonucYaziElementi
    @FindBy (xpath = "//*[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement paraBirimleriSonucYaziElementiANT;

    //Admin Dashboard >> Menü >> Currencies >> ParaBirimleriSayisi
    @FindBy (xpath = "//strong[text()='135']")
    public WebElement paraBirimleriSayisiElementiANT;



























































    //Ozgur



































































































//Cemil



































































































//Taha



































































































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















    //Tugce
    // Admin dashboard >> Affiliate Users sekmesi
    @FindBy(xpath = "//*[text()='Affiliate Users']")
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































































    //
}
