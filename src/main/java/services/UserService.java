package services;

import endpoints.Routes;
import io.restassured.response.Response;
import models.User;

import static io.restassured.RestAssured.given;

public class UserService {

    private UserService(){}

    public static Response getUser(int id){

        return given()
                .pathParam("id", id)
                .when()
                .get(Routes.USER_BY_ID)
                .then()
                .extract()
                .response();
    }

    public static Response createUser(User user){

        return given()
                .body(user)
                .when()
                .post(Routes.CREATE_USER)
                .then()
                .extract()
                .response();
    }
}