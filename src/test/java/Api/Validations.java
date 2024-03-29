package Api;

import Framework.General.FileOperation;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

public class Validations {

    public static void validateResponse(Response response, String[] fields){
        for(String field : fields){
            validateData(field, response);
        }
    }

    public static void validateData(String dataToValidate, Response response){
        Assertions.assertEquals(FileOperation.getProperties("apiResponse").getProperty(dataToValidate),
                response.then().extract().path(dataToValidate));
    }

}
