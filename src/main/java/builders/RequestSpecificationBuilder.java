package builders;

import config.ConfigManager;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {

    private RequestSpecificationBuilder(){}

    public static RequestSpecification build(){

        return new RequestSpecBuilder()

                .setBaseUri(
                    ConfigManager.get("baseUrl"))

                .setContentType(
                    "application/json")

                .build();
    }
}