package testcases;

import base.BaseParpare;
import org.testng.annotations.Test;
import pages.HomePages;
import utils.SeleniumUtil;

/**
 * @Author:gaolili
 * @Date:Created in 下午4:24 ${Date}
 * @Description:
 */
public class testHomePage extends BaseParpare {
         @Test
         public  void  test_goin_Homeage(){
             HomePages home = new HomePages(seleniumUtil);
             home.searchKeyWord("中国").isCheckReusltPage();

        }


}
