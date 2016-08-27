package search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/24/2016.
 */
public class SearchContent extends Base {

    @Test
    public void SearchContent(){

        clickByXPath(".//*[@id='globalSearchForm']/div[1]/a");
        clickByXPath(".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span");
        typeByCss("#searchFormInput", "GiftCard");
        clickByCss(".searchFormButton");
    }
}
