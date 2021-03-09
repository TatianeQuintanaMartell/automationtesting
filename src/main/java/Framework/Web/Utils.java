package Framework.Web;

import Framework.General.FileOperation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
    private Select select;

    public void selecionarTexto(String properties, WebElement webElement){
        select = new Select(webElement);
        select.selectByVisibleText(FileOperation.getProperties("dadosDeEntradaParaoTeste").getProperty(properties));
    }

}
