package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {

    private static final Properties properties =
            new Properties();

    static {

        try {

            Properties env =
                    new Properties();

            env.load(
                new FileInputStream(
                    "src/main/resources/config.properties"));

            String environment =
                    env.getProperty("environment");

            properties.load(
                new FileInputStream(
                    "src/main/resources/"
                    + environment +
                    ".properties"));

        } catch(Exception e){

            throw new RuntimeException(e);
        }
    }

    public static String get(String key){

        return properties.getProperty(key);
    }
}