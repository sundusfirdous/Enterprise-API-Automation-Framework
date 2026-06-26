package dataproviders;

import org.testng.annotations.DataProvider;

public class UserDataProvider {

    @DataProvider(name = "userData")
    public Object[][] userData() {

        return new Object[][] {

                {"Sundus","Firdous",30,"sundus@test.com"},

                {"John","Doe",25,"john@test.com"}
        };
    }
}