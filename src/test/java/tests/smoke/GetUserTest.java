package tests.smoke;

import base.BaseTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetUserTest extends BaseTest {

    @Test

    public void verifyUser(){

        given()

        .when()

            .get("/users/2")

        .then()

            .statusCode(200)

            .log()

            .all();
    }
}