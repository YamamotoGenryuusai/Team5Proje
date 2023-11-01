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
}
