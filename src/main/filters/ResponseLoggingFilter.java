package filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.filter.FilterableRequestSpecification;
import io.restassured.filter.FilterableResponseSpecification;
import io.restassured.response.Response;

public class ResponseLoggingFilter implements Filter {

    @Override
    public Response filter(
            FilterableRequestSpecification requestSpec,
            FilterableResponseSpecification responseSpec,
            FilterContext ctx) {

        Response response = ctx.next(requestSpec, responseSpec);

        System.out.println("==================================");
        System.out.println("RESPONSE");
        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());
        System.out.println("==================================");

        return response;
    }
}