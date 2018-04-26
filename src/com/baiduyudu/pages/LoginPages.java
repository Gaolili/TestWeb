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
    By userNameLoginBtn = By.className("tang-pass-footerBarULogin pass-link");
    By registerBtn = By.className("pass-reglink pass-link");
    By weiboBtn = By.className("phoenix-btn-item");
    By weixinBtn = By.className("bd-acc-weixin");
    By qZoneBtn = By.className("bd-acc-qzone");

    By userNameInput = By.id("TANGRAM__PSP_14__userName");
    By passwordInput = By.id("TANGRAM__PSP_14__password");
    By sumitBtn = By.id("TANGRAM__PSP_14__submit");
    By forgetBtn = By.className("pass-fgtpwd pass-link");
    By scaleQrBtn = By.id("TANGRAM__PSP_14__footerQrcodeBtn");

    By buyCarBtn = By.className("ub-txt");

    public  SeleniumUtil seleniumUtilss = null;

    public  LoginPages(SeleniumUtil utilss){
        seleniumUtilss = utilss;
    }

    public  void  gotoLoginAlert(){
        seleniumUtilss.waitForElementToLoad(StaticDataInfo.timeout,loginButton);
        seleniumUtilss.click(loginButton);
    }

    public  Boolean isLoginPage(){
      return   seleniumUtilss.isDisplayed(seleniumUtilss.driver.findElement(userNameLoginBtn));
    }
    // 用户名登陆
    public void inputUserNameLoginMethod(String username,String passwrod){
        System.out.println("inputUserNameLoginMethod=====");
        seleniumUtilss.waitForElementToLoad(StaticDataInfo.timeout,loginButton);

        seleniumUtilss.click(userNameLoginBtn);

        seleniumUtilss.inputBy(userNameInput,username);
        seleniumUtilss.inputBy(passwordInput,passwrod);
        seleniumUtilss.click(sumitBtn);
      }

      public  void  isLoginSuccess(){
        seleniumUtilss.isDisplayed(seleniumUtilss.driver.findElement(buyCarBtn));
      }


}
