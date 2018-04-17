package testcases;

import base.BaseParpare;
import org.testng.annotations.Test;
import pages.HomePages;

/**
 * @Author:gaolili
 * @Date:Created in 下午4:24 ${Date}
 * @Description:
 */
public class test extends BaseParpare {
         @Test
            public  void  testLogin(){
                HomePages home = new HomePages();
                home.searchKeyWord("中国");

        }




}
