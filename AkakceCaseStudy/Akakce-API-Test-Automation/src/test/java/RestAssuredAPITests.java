import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredAPITests {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    @Test
    public void statusCode() {
        Response response = RestAssured.get(BASE_URL);
        int statusCode = response.getStatusCode();
        System.out.println("Status Code : " +statusCode);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void JsonStructure() {
        Response response = RestAssured.get(BASE_URL);
        Assert.assertFalse(response.jsonPath().getList("$").isEmpty());
        Assert.assertNotNull(response.jsonPath().get("[0].userId"));
        Assert.assertNotNull(response.jsonPath().get("[0].id"));
        Assert.assertNotNull(response.jsonPath().get("[0].title"));
        Assert.assertNotNull(response.jsonPath().get("[0].body"));
    }

    @Test
    public void SpecificValue() {
        Response response = RestAssured.get(BASE_URL + "/1");
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertNotNull(response.jsonPath().getString("title"));
    }

    @Test
    public void ListSize() {
        Response response = RestAssured.get(BASE_URL);
        Assert.assertTrue(response.jsonPath().getList("$").size() >= 10);
    }

    @Test
    public void DynamicDataValidation() {
        Response response = RestAssured.get(BASE_URL);
        response.jsonPath().getList("userId").forEach(userId ->
                Assert.assertTrue((Integer) userId > 0)
        );
    }
}
