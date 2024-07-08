package testcases;

import basics.Base;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLogin extends Base {
    @DataProvider(name = "invalidLoginData")
    public Object[][] invalidLoginData() {
        return new Object[][] {
                {"invalid_user", "secret_sauce", "Epic sadface: Username and password do not match any user in this service"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"},
                {"", "", "Epic sadface: Username is required"},
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."}
        };
    }

    @Test(dataProvider = "invalidLoginData")
    public void testInvalidLogin(String username, String password, String expectedErrorMessage) {
        loginPage.waitForPageLoad();

        loginPage.setEmail(username);
        loginPage.setPassword(password);
        loginPage.clickOnLogin();

        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match for user: " + username);
    }
}
