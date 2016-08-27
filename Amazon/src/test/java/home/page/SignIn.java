package home.page;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class SignIn extends Base  {
    @Test
    public void signIn()  throws InterruptedException {
        clickByCss("#a-autoid-0-announce");
        Thread.sleep(3000);
        typeByCss("#ap_email", "wrongE-mail@yahoo.com");
        typeByCss("#ap_password", "wrongUserName");
        clickByCss("#signInSubmit");
    }


}
