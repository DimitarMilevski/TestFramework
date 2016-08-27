package helpMenu;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/27/2016.
 */
public class ReturnItem extends Base {

    @Test
    public void HelpMenuReturnItem() throws InterruptedException {

        clickByCss(".wmicon.wmicon-help");
        clickByCss(".second-icon");
        clickByXPath("html/body/div[2]/section/section[4]/div/div/div[3]/label[1]/div/div[1]");
        Thread.sleep(4000);
        clickByXPath("html/body/div[2]/section/section[4]/div/div/div[3]/label[2]/div/div[1]");
        Thread.sleep(4000);
        clickByCss(".btn.btn-block-max-s.m-margin-ends.returns-find-store-link");
        driver.navigate().to("https://www.walmart.com/store/finder?uzy_j=v1");
        Thread.sleep(4000);
        typeByCss("#find-new-location-input" , "08401");
        clickByXPath("html/body/div[2]/section/section[4]/div[2]/div[2]/div[1]/div[3]/div/ol/li[1]");

    }
}
