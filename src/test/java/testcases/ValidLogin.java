package testcases;

import basics.Base;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidLogin extends Base {
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginWithValidCredentials(String userName,String password){
        loginPage.waitForPageLoad();
        loginPage.setEmail(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLogin();
        homePage.waitForPageLoad();
        Assert.assertTrue(homePage.isInventoryDisplayed(), "Inventory page is not displayed for user: " + userName);

    }

}
