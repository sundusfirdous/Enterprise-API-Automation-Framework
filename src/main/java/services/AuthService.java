package services;

import auth.TokenManager;
import io.restassured.response.Response;
import payloads.LoginPayload;

import static io.restassured.RestAssured.given;

public class AuthService {

    public static void login(){

        LoginPayload payload = new LoginPayload();

        payload.setUsername("emilys");

        payload.setPassword("emilyspass");

        Response response =

                given()

                        .body(payload)

                .when()

                        .post("/auth/login")

                .then()

                        .extract()

                        .response();

        String token =

                response.jsonPath().getString("accessToken");

        TokenManager.setToken(token);
    }

}