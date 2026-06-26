package filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.filter.FilterableRequestSpecification;
import io.restassured.filter.FilterableResponseSpecification;
import io.restassured.response.Response;

public class RequestLoggingFilter implements Filter {

    @Override
    public Response filter(
            FilterableRequestSpecification requestSpec,
            FilterableResponseSpecification responseSpec,
            FilterContext ctx) {

        System.out.println("==================================");
        System.out.println("REQUEST");
        System.out.println(requestSpec.getMethod());
        System.out.println(requestSpec.getURI());
        System.out.println(requestSpec.getBody());
        System.out.println("==================================");

        return ctx.next(requestSpec, responseSpec);
    }
}