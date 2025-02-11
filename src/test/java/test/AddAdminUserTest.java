package test;

import base.Browser;

import org.testng.Assert;

import org.testng.annotations.Test;
import page.AdminPage;
import page.LoginPage;

public class AddAdminUserTest extends Browser {


    @Test
    public void addAdminUser() throws InterruptedException {



        LoginPage obj = new LoginPage(driver);
        obj.Login();

        Thread.sleep(5000);

        AdminPage admin = new AdminPage(driver);

        String actualTitleofAdmin = admin.clickOnAdmin();
        String adminExpectedTitle = "Admin";
        Assert.assertEquals(actualTitleofAdmin, adminExpectedTitle);

        admin.clickOnUserManagement();
       String actualAddUserText= admin.clickOnAddButton();
       String expectedAddUserText="Add User";
       Assert.assertEquals(actualAddUserText,expectedAddUserText);

        Thread.sleep(5000);

        logger.info("------------------Add Admin User test is passed-----------");

    }
}
