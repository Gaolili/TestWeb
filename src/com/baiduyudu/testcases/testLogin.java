package testcases;

import base.BaseParpare;
import org.testng.annotations.*;
import pages.LoginPages;

public class testLogin extends BaseParpare {
    public  LoginPages  loginPages = null;

    @BeforeClass
    public  void beforeSuite(){
        loginPages = new LoginPages(seleniumUtil);
        loginPages.gotoLoginAlert();
        loginPages.clickUserNameLoginBtn();
    }

    @Test(priority = 1)
    public void corretUserNameLogin(){
        loginPages.inputUserNameLoginMethod("18310346495","gao921204");
        loginPages.isLoginSuccess();
    }

    @Test(dataProvider = "errorData",priority = 0)
    public void errorUserNameLoin(String username,String password){
        loginPages.inputUserNameLoginMethod(username,password);
        loginPages.isLoinFailed();
    }

    @DataProvider(name = "errorData")
    public  static Object[][] usernameData(){
        return new Object[][]{{"1831034649","gao921204"},{"18310346495","gao9212"}};
    }

//    @AfterSuite
//    public void  afterSuite(){
//        seleniumUtil.quit();
//    }




}
