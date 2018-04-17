package pages;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtil;

import java.util.List;

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


    public void searchKeyWord(String keyword){
        SeleniumUtil seleniumUtil = new SeleniumUtil();

        try {
            Thread.sleep(3*60*60);
        }catch (Exception e){
            e.printStackTrace();
        }
//        seleniumUtil.waitForElementToLoad(10,searchWordField);

//        WebElement elementsss = seleniumUtil.driver.findElement(By.id("s-word-1"));
//        elementsss.sendKeys(keyword);

//        seleniumUtil.inputBy(searchWordField,keyword);
        seleniumUtil.click(searcheButton);

    }




}
