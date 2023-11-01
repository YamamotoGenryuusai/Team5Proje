package pages;

import org.openqa.selenium.support.PageFactory;
import pages.AdminDashboard;
import utilities.Driver;

public class UserDashboard extends AdminDashboard {

    public UserDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}














