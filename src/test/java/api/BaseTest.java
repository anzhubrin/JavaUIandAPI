package api;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class BaseTest {

    String  getSingleUser = "/api/users/2",
            getSingleUserNotFound = "/api/users/23",
            getListUsers = "/api/users?page=2",
            postCreateUser = "/api/users";

    String  bodyForCreateUser = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";

    String  keyEmail = "data.email",
            keyFirstName = "data.first_name",
            keyLastName = "data.last_name",
            keyName = "name",
            keyJob = "job";

    @BeforeAll
    static void setUrl() {
        baseURI = "https://reqres.in";
    }
}
