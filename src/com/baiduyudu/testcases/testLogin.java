package testcases;

import base.BaseParpare;
import org.testng.annotations.Test;
import pages.LoginPages;

public class testLogin extends BaseParpare {

    @Test
    public void testUserNameLoginCase(){
        LoginPages loginPages = new LoginPages(seleniumUtil);
        loginPages.gotoLoginAlert();
//        loginPages.isLoginPage();
        loginPages.inputUserNameLoginMethod("18310346495","gao921204");
        loginPages.isLoginSuccess();

    }
}
