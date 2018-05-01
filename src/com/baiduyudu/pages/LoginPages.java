package pages;

import org.openqa.selenium.By;
import utils.SeleniumUtil;
import utils.StaticDataInfo;

/**
 * @Author:gaolili
 * @Date:Created in 下午12:36 ${Date}
 * @Description:
 */
public class LoginPages {
    By loginButton = By.className("ub-txt");
    By alertClose = By.id("TANGRAM__PSP_8__closeBtn");
    By alertTitle = By.className("pass-form-logo");
    By qrCode = By.id("TANGRAM__PSP_14__QrcodeMain");
    By qrAnimateimg = By.id("TANGRAM__PSP_14__QrcodeAnimation");
    By userNameLoginBtn = By.id("TANGRAM__PSP_14__footerULoginBtn");
    By registerBtn = By.className("pass-reglink pass-link");
    By weiboBtn = By.className("phoenix-btn-item");
    By weixinBtn = By.className("bd-acc-weixin");
    By qZoneBtn = By.className("bd-acc-qzone");

    By userNameInput = By.id("TANGRAM__PSP_14__userName");
    By passwordInput = By.id("TANGRAM__PSP_14__password");
    By sumitBtn = By.id("TANGRAM__PSP_14__submit");
    By forgetBtn = By.className("pass-fgtpwd pass-link");
    By scaleQrBtn = By.id("TANGRAM__PSP_14__footerQrcodeBtn");
    By errorUserNameTip = By.id("TANGRAM__PSP_14__error");

    By userName = By.linkText("文库新人");

    public  SeleniumUtil seleniumUtilss = null;

    public  LoginPages(SeleniumUtil utilss){
        seleniumUtilss = utilss;
    }

    // 进入登录弹窗
    public  void  gotoLoginAlert(){
        seleniumUtilss.waitForElementToLoad(StaticDataInfo.timeout,loginButton);
        seleniumUtilss.click(loginButton);
    }

    //点击用户名登录按钮
    public  void  clickUserNameLoginBtn(){
        seleniumUtilss.waitForElementToLoad(StaticDataInfo.timeout,userNameLoginBtn);
        seleniumUtilss.click(userNameLoginBtn);
    }

    // 输入用户名密码登录
    public void inputUserNameLoginMethod(String username,String passwrod){
        seleniumUtilss.clear(userNameInput);
        seleniumUtilss.inputBy(userNameInput,username);

        seleniumUtilss.clear(passwordInput);
        seleniumUtilss.inputBy(passwordInput,passwrod);
        seleniumUtilss.click(sumitBtn);
      }

      // 登录成功
      public  void  isLoginSuccess(){
          seleniumUtilss.waitForElementToLoad(StaticDataInfo.timeout,userName);
      }

      // 登录失败
      public  void isLoinFailed(){
          seleniumUtilss.waitForElementToLoad(StaticDataInfo.timeout,errorUserNameTip);

      }


}
