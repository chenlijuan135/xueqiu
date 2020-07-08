import org.junit.Test;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;

import java.net.MalformedURLException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class testLogin {
    @Test
    public void noPhone() throws MalformedURLException {
        MainPage mainPage= MainPage.statrt();
        ProfilePage profilePage=mainPage.gotoProfile();
        LoginPage gotoLogin=profilePage.gotoLoginPage();
        LoginPage loginPage=gotoLogin.loginFail("13538190601","123456");
        String msg=loginPage.getMessage();
        System.out.println(msg);
        assertThat(msg, equalTo("用户名或密码错误"));
    }

}
