package services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseService {

    protected Response get(String endpoint){

        return given()

                .when()

                .get(endpoint)

                .then()

                .extract()

                .response();
    }

    protected Response post(String endpoint,Object body){

        return given()

                .body(body)

                .when()

                .post(endpoint)

                .then()

                .extract()

                .response();
    }

    protected Response put(String endpoint,Object body){

        return given()

                .body(body)

                .when()

                .put(endpoint)

                .then()

                .extract()

                .response();
    }

    protected Response delete(String endpoint){

        return given()

                .when()

                .delete(endpoint)

                .then()

                .extract()

                .response();
    }

}