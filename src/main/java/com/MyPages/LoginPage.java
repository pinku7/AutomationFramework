package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by sangi on 03-09-2019.
 */
public class LoginPage extends BasePage {

    // page locators
    private By emailId = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.id("loginBtn");
    private By header = By.cssSelector("i18n-string[data-key='login.signupLink.text']");

    @FindAll(@FindBy(how= How.ID,using = "abc"))
    private List<WebElement> listOfEle;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailId() {
        return getElement(emailId);
    }

    public WebElement getPassword() {
        return getElement(password);
    }

    public WebElement getLoginButton() {
        return getElement(loginButton);
    }

    public WebElement getHeader() {
        return getElement(header);
    }

    public  String getLoginPageTitle(){
        return getPageTitle();
    }

    public  String getLoginPageHeader(){
        return  getPageHeader(header);
    }

    /**
     * @param username
     * @param password
     * @return
     */
    public HomePage doLogin(String username, String password){
        getEmailId().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();

        return getInstance(HomePage.class);
    }
}
