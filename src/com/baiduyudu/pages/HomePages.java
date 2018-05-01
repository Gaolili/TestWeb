package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtil;
import utils.StaticDataInfo;

import java.util.List;
import java.util.logging.Logger;

/**
 * @Author:gaolili
 * @Date:Created in 下午12:38 ${Date}
 * @Description:
 */
public class HomePages {
    /**搜索输入框*/
    public  By searchWordField = By.id("s-word-1");

    /**搜索按钮*/
    public  By searcheButton = By.className("s-submit");

    /**登录*/
    public  By loginButton = By.className("ub-item ub-login");

    /**注册*/
    public  By registButton = By.id("reg-btn");

    /**购物车*/
    public  By cartButton = By.className("ub-item ub-cart");

    public  SeleniumUtil seleniumUtilHome = null;
    public  static Logger logger = Logger.getLogger(HomePages.class.getName());

    public HomePages(SeleniumUtil seleniumutils){
        seleniumUtilHome =  seleniumutils;
    //        waitPageLoadFinish();
    }

    public void waitPageLoadFinish() {
       logger.info("开始检查首页页面元素");
       seleniumUtilHome.waitForElementToLoad(StaticDataInfo.timeout,loginButton);
       seleniumUtilHome.waitForElementToLoad(StaticDataInfo.timeout,searcheButton);
       logger.info("检查首页页面元素完毕");
    }

    public SearchResultPages searchKeyWord(String keyword){
        logger.info("开始输入搜索信息");
        seleniumUtilHome.clear(searchWordField);
        seleniumUtilHome.inputBy(searchWordField,keyword);
        logger.info("输入搜索信息完毕");
        seleniumUtilHome.click(searcheButton);
        return new SearchResultPages(seleniumUtilHome);

    }




}
