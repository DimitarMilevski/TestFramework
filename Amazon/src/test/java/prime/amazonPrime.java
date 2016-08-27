package prime;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class amazonPrime extends Base {

    @Test
    public void searchPrime() throws NullPointerException, InterruptedException {
        Thread.sleep(3000);
        clickByXPath("html/body/div[1]/header/div/div[1]/div[1]/div/a[2]");
        clickByXPath("html/body/div[1]/div[3]/div[1]/div[3]/div/div/div[1]/div[2]/span/a/span/span/input");
        clickByXPath(".//*[@id='plan-comparison']/table/thead/tr[3]/td[4]/div/a/h3");
        clickByCss("a-autoid-0-announce");
    }
}
