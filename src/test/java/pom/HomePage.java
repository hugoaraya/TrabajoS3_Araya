package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BaseClass;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"dropdown01\"]")
    WebElement btnMicuenta;
    @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/ul/li[5]/div/a[1]")
    WebElement btnIngresar;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void irARegistrarte(){
        click(esperarAElementoWeb(btnMicuenta));

    }
    public void IrAForm() {
        click(esperarAElementoWeb(btnIngresar));
    }
}
