package org.baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.PropertyUtils;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

//    public static void commonMethod() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        Properties prop = PropertyUtils.loadAllTheProperties();
//        String url = prop.getProperty("url");
//        driver.get(url);
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        Thread.sleep(5000);
//    }
//
//
//
//
//    public static void finalMethod() {
//        driver.close();
//    }

}
