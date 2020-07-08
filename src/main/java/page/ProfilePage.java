package page;

import driver.Driver;
import org.openqa.selenium.By;

public class ProfilePage extends BasePage{

    public LoginPage gotoLoginPage(){
        By by=text("帐号密码登录");
        find(by).click();
        return new LoginPage();
    }

}
