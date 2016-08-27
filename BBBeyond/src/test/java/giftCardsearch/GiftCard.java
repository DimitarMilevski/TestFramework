package giftCardsearch;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import search.SearchContent;

import static org.openqa.selenium.By.name;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class GiftCard  extends Base{
    @Test
    public void SearchForGiftCard(){
        clickByXPath(".//*[@id='globalSearchForm']/div[1]/a");
        clickByXPath(".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span");
        typeByCss("#searchFormInput", "GiftCard");
        clickByCss(".searchFormButton");
        driver.navigate().to("https://bedbathandbeyond.cashstar.com/");
        driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Happy Birth Day");

    }
}
