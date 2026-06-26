package utils;

import net.datafaker.Faker;

public class FakerUtils {

    private static final Faker faker = new Faker();

    private FakerUtils() {
    }

    public static String firstName() {
        return faker.name().firstName();
    }

    public static String lastName() {
        return faker.name().lastName();
    }

    public static String email() {
        return faker.internet().emailAddress();
    }

    public static int age() {
        return faker.number().numberBetween(18, 60);
    }
}