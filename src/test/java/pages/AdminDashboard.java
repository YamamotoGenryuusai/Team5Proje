package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard(){PageFactory.initElements(Driver.getDriver(),this);}

    //Admin Dashboard >> Menü >> Users
    @FindBy (xpath = "//span[text()='Users']")
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










}
