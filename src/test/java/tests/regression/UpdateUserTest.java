package tests.regression;

import base.BaseTest;
import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;

public class UpdateUserTest extends BaseTest {

    @Test
    public void verifyUpdateUser(){

      User user = new User();

user.setId(1);
user.setFirstName("Updated");
user.setLastName("User");
user.setAge(35);
user.setEmail("updated@test.com");

       Response response = UserService.updateUser(1, user);

System.out.println("Status Code: " + response.statusCode());
System.out.println("Response Body:");
response.prettyPrint();

Assert.assertEquals(response.statusCode(), 200);
    }
}