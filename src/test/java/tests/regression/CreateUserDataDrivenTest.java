package tests.regression;

import base.BaseTest;
import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;
import dataproviders.UserDataProvider;

public class CreateUserDataDrivenTest extends BaseTest {

    @Test(dataProvider = "userData",
            dataProviderClass = UserDataProvider.class)

    public void createUserTest(
            String firstName,
            String lastName,
            int age,
            String email) {

        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        user.setEmail(email);

        Response response =
                UserService.createUser(user);

        Assert.assertEquals(
                response.statusCode(),
                201);
    }
}