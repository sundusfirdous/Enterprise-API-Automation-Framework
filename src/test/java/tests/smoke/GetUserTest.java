package tests.smoke;

import base.BaseTest;
import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;

public class GetUserTest extends BaseTest {

    @Test
    public void verifyUser() {

        Response response = UserService.getUser(1);

        User user = response.as(User.class);

        Assert.assertEquals(response.statusCode(), 200);

        Assert.assertEquals(user.getId(), 1);

        Assert.assertEquals(user.getFirstName(), "Emily");

        Assert.assertEquals(user.getLastName(), "Johnson");

        Assert.assertTrue(user.getEmail().contains("@"));
    }
}