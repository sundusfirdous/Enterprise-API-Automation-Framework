package builders;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationBuilder {

    private ResponseSpecificationBuilder(){}

    public static ResponseSpecification success(){

        return new ResponseSpecBuilder()

                .expectStatusCode(200)

                .build();
    }
}