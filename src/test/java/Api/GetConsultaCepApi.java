package Api;

import Framework.Api.TestBaseApi;
import io.qameta.allure.Description;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static io.restassured.RestAssured.given;

public class GetConsultaCepApi extends TestBaseApi {

    private final String[] FIELDS = {"cep","logradouro","complemento","bairro","localidade",
                  "uf","ibge","gia","ddd","siafi"};

    @Description("Teste de Contrato")
    @ParameterizedTest
    @MethodSource("Framework.Api.DataClass#cepvalido")
    public void realizarTesteDeContrato(String cepValido){
        Response response =
                given()
                    .spec(requestSpecification)
                .when()
                    .get("/ws/"+cepValido+"/json/")
                .then()
                    .log().body()
                    .assertThat()
                    .statusCode(200)
                    .extract().response();
        response.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("json-schema.json"));
    }

    @Description("Consulta de cep válido")
    @ParameterizedTest
    @MethodSource("Framework.Api.DataClass#cepvalido")
    public void consultarCepValido(String cepValido){
        Response response =
                given()
                    .spec(requestSpecification)
                .when()
                    .get("/ws/"+cepValido+"/json/")
                .then()
                    .log().body()
                    .statusCode(200)
                    .extract().response();

        Validations.validateResponse(response, FIELDS);
    }

    @Description("Consulta de Cep inexistente")
    @ParameterizedTest
    @MethodSource("Framework.Api.DataClass#cepinexistente")
    public void consultarCepInexistente(String cepInexistente){
        Response response =
                given()
                    .spec(requestSpecification)
                .when()
                    .get("/ws/"+cepInexistente+"/json/")
                .then()
                    .log().body()
                    .assertThat()
                    .statusCode(200)
                    .extract().response();
        Boolean validaResponse = response.then().extract().path("erro");
        Assertions.assertEquals(true, validaResponse);
    }

    @Description("Consulta de Cep com formato inválido")
    @ParameterizedTest
    @MethodSource("Framework.Api.DataClass#cepcomformatoinvalido")
    public void consultarCepComFormatoInvalido(String cepComFormatoInvalido){
        given()
              .spec(requestSpecification)
        .when()
              .get("/ws/"+cepComFormatoInvalido+"/json/")
        .then()
              .log().body()
              .assertThat()
              .statusCode(400);
    }
}
