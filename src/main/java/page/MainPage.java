package page;

import driver.Driver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainPage extends BasePage{
    By by1=text("同意");
    By by2=text("我的");
     public static MainPage statrt() throws MalformedURLException {
         Driver.start();
         return new MainPage();
     }
     public ProfilePage gotoProfile(){
         find(by1).click();
         find(by2).click();
         return new ProfilePage();
     }
}
