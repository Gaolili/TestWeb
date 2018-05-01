package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utils.*;
import org.apache.log4j.Logger;

public class BaseParpare {

    public static Logger logger = Logger.getLogger(BaseParpare.class.getName());
    public SeleniumUtil seleniumUtil = null;

    @BeforeSuite
    public  void startTest(ITestContext context){
       LogConfiguration.initLog(this.getClass().getSimpleName());
       seleniumUtil = new SeleniumUtil();
       seleniumUtil.launchBrowser("firefox",context,"https://yuedu.baidu.com",10);
       }


    @AfterSuite
    public  void endTest(){

//        seleniumUtil.quit();
    }



}
