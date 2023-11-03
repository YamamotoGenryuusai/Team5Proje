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

    //Anasayfa>>AdminDashboard>>frontCMS
 @FindBy(xpath = "//*[@id='sidebar']/div[2]/ul/li[16]/a/span[2]")
 public WebElement frontCMSButonu;
    //Anasayfa>>AdminDashboard>>frontCMS
 @FindBy(xpath = "//*[@id='nav-header']/div/div/ul/li[22]")
 public WebElement testimonialsButonu;
    //Anasayfa>>AdminDashboard>>frontCMS
 @FindBy(xpath = "(//a[@class='nav-link p-0 '])[22]")
 public WebElement enquiriesButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//a[@class='nav-link p-0 active']")
 public WebElement testimonialsactiveButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Enquiries
 @FindBy(xpath = "//a[@class='nav-link p-0 active']")
 public WebElement enquiriesactiveButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='addTestimonialBtn']")
 public WebElement addTestimonialsButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='name']")
 public WebElement testimonialsName;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='description']")
 public WebElement testimonialsDescription;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='addFrontTestimonialForm']/div[1]/div[3]/div/div/span/label")
 public WebElement image;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='testimonialSave']")
 public WebElement testimonialSaveButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//div[@class='toast-message']")
 public WebElement successMessage;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "(//*[@data-icon='eye'])[1]")
 public WebElement viewButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[1]")
 public WebElement editButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "(//*[@data-icon='trash'])[1]")
 public WebElement deleteButonu;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='showTestimonialModal']/div/div/div[1]/h2")
 public WebElement testimonialDetails;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='showTestimonialModal']/div/div/div[1]/button")
 public WebElement closeDetails;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//input[@id='editName']")
 public WebElement editName;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//textarea[@id='editDescription']")
 public WebElement editDescription;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//button[@id='testimonialUpdate']")
 public WebElement testimonialUpdate;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "(//*[@id='profileImageIcon'])[2]")
 public WebElement editimage;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
 public WebElement yesDeletebutton;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//div[@class='swal-modal']")
 public WebElement deletedHT;
    //Anasayfa>>AdminDashboard>>frontCMS>>Testimonials
 @FindBy(xpath = "//*[@id='testimonialInputImage']")
 public WebElement addimage;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "//*[@id='sidebar']/div[2]/ul/li[6]/a/span[2]")
 public WebElement cashPaymentsbutonu;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
 public WebElement results;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "//*[@id='nav-header']/div/div/ul/li[8]/a")
 public WebElement cashPaymentsHeader;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "//div[@class='table-responsive']")
 public WebElement manuelPayments;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "(//button[@class='page-link'])[1]")
 public WebElement button2;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "(//button[@class='page-link'])[9]")
 public WebElement button9;
    //Anasayfa>>AdminDashboard>>CashPayments
 @FindBy(xpath = "(//button[@class='page-link'])[11]")
 public WebElement button22;









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
