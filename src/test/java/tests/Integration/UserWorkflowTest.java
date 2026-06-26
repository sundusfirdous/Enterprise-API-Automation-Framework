package tests.integration;

import base.BaseTest;
import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;
import utils.FakerUtils;

public class UserWorkflowTest extends BaseTest {

    @Test
    public void completeWorkflow() {

        User user = new User();

        user.setFirstName(FakerUtils.firstName());
        user.setLastName(FakerUtils.lastName());
        user.setAge(FakerUtils.age());
        user.setEmail(FakerUtils.email());

        Response createResponse = UserService.createUser(user);

        Assert.assertEquals(createResponse.statusCode(), 201);

        Assert.assertEquals(
                createResponse.jsonPath().getString("firstName"),
                user.getFirstName());

        Assert.assertEquals(
                createResponse.jsonPath().getString("email"),
                user.getEmail());

        System.out.println("Workflow completed successfully.");
    }
}