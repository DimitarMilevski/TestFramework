package searchWalmart;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

/**
 * Created by Zaqc on 8/24/2016.
 */
public class searchLocalStore extends Base {

    @Test
    public void searchContent() throws InterruptedException{
        clickByCss(".header-GlobalSecondaryNav-link-1.m-margin-left");
        typeByCss(".js-store-searchbar-input.store-searchbar-input.form-control.tt-input", "Soccer ball");






    }
}
