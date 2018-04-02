package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test360 {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.bin","C:/Program Files/Mozilla Firefox/firefox.exe");
        WebDriver drivers = new FirefoxDriver();
        drivers.get("http://www.baidu.com");
        try {
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        drivers.quit();

    }
}
