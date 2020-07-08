package page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By username=By.id("login_account");
    private By password=By.id("login_password");
    private By loginButton=By.id("button_next");
    private By msg=By.id("md_content");
    private By sure=By.id("md_buttonDefaultPositive");
    String message;
    public  LoginPage loginFail(String user,String pwd){
        find(username).sendKeys(user);
        find(password).sendKeys(pwd);
        find(loginButton).click();
        message=find(msg).getText();
        System.out.println("sss"+message);
        find(sure).click();
        return this;
    }

    public String getMessage(){
        return this.message;
    }


}
