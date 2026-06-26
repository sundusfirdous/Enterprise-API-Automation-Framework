package tests.smoke;

import base.BaseTest;
import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;

public class CreateUserTest extends BaseTest {

    @Test
    public void verifyCreateUser() {

        User user = new User();

        user.setFirstName("Sundus");
        user.setLastName("Firdous");
        user.setAge(30);
        user.setEmail("sundus@test.com");

        Response response =
                UserService.createUser(user);

        response.prettyPrint();

        Assert.assertEquals(
                response.statusCode(),
                201);
    }
}