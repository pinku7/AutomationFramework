package com.MyTests;

import com.MyPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sangi on 03-09-2019.
 */
public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageTitle(){

        String title =page.getInstance(LoginPage.class).getLoginPageTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Checking browser");
    }

    @Test
    public void verifyLoginPageHeader(){
        String header =page.getInstance(LoginPage.class).getLoginPageHeader();
        System.out.println(header);
        Assert.assertEquals(header,"Don't have an account?");
    }
}
