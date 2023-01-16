package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BaseClass;

public class IndexPage extends BaseClass {

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'Home My Pyme')]")
    WebElement txtIndexPage;
    @FindBy(xpath = "//*[@id=\"error\"]")
    WebElement txtErrorPage;

    public String obtenerIngresoExitoso(){
        return obtenerTexto(txtIndexPage);
    }

    public String obtenerError(){
        return obtenerTexto(txtErrorPage);
    }

}
