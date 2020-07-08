package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebElement find(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public  static By text(String string)
    {
        return By.xpath("//*[@text='"+string+"']");
    }
}
