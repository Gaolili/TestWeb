package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.jvm.hotspot.utilities.Assert;
import utils.SeleniumUtil;

/**
 * @Author:gaolili
 * @Date:Created in 下午7:14 ${Date}
 * @Description:
 */
public class SearchResultPages {
    // 条件筛选
    public By selectNavigation = By.className("main-hd");

    public SeleniumUtil selemUtil = null;
    public SearchResultPages(SeleniumUtil seleniumss){
        selemUtil = seleniumss;

    }

    public void isCheckReusltPage(){
        WebElement nava = selemUtil.findElementBy(selectNavigation);
        selemUtil.isDisplayed(nava);
     }
}
