package com.MyTests;

import com.MyPages.BasePage;
import com.MyPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


/**
 * Created by sangi on 03-09-2019.
 */
public class BaseTest {

    WebDriver driver;
    public Page page;


    @BeforeMethod
    @Parameters(value = "browser")
    public void setUpTest(String browser){
      if (browser.equals("chrome")){
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
      }else if (browser.equals("ff")){
          WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver();
      }else {
          System.out.println("No browser is defined in XML file..");
      }

      driver.get("https://app.hubspot.com/login");
      page = new BasePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
