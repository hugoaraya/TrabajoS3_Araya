package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BaseClass;

public class FormPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"rut\"]")
    WebElement inputRut;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement inputPass;
    @FindBy(xpath = "//button[contains(text(),'Ingresar')]")
    WebElement btnIngresar;



    public FormPage(WebDriver driver) {
        super(driver);
    }
    public void agregarRut(String rut){
        agregarTexto(esperarAElementoWeb(inputRut),rut);
    }
    public void agregarPass(String pass){
        agregarTexto(esperarAElementoWeb(inputPass),pass);
    }

    public void Ingresar(){
        click(esperarAElementoWeb(btnIngresar));
    }

}