package endpoints;

public class Routes {

    private Routes(){}

    public static final String USER_BY_ID = "/users/{id}";

    public static final String CREATE_USER = "/users/add";

    public static final String UPDATE_USER = "/users/{id}";

    public static final String DELETE_USER = "/users/{id}";

    public static final String LOGIN="/auth/login";
}