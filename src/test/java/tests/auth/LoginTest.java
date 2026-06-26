package tests.auth;

import auth.TokenManager;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.AuthService;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin(){

        AuthService.login();

        Assert.assertNotNull(TokenManager.getToken());

        System.out.println(TokenManager.getToken());
    }

}