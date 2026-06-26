package tests.regression;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;

public class DeleteUserTest extends BaseTest {

    @Test
    public void verifyDeleteUser(){

        Response response =
                UserService.deleteUser(1);

        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),200);
    }
}