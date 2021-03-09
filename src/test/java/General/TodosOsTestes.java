package General;

import Api.GetConsultaCepApi;
import Web.RealizarRegistroTestCaseWeb;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({GetConsultaCepApi.class,RealizarRegistroTestCaseWeb.class})

public class TodosOsTestes {
}
