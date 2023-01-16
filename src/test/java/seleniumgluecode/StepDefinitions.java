package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pom.FormPage;
import pom.HomePage;
import pom.IndexPage;

import java.sql.SQLOutput;

public class StepDefinitions {

    public WebDriver driver;
    HomePage homePage;
    FormPage formPage;
    IndexPage indexPage;

    @Given("Estoy en el sitio http:\\/\\/ithinkchile.cl\\/sistemacobros\\/index.php")
    public void estoy_en_el_sitio_http_ithinkchile_cl_sistemacobros_index_php() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Hugo\\Desktop\\javaTutorial\\TrabajoS3_Araya\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            homePage= PageFactory.initElements(driver,HomePage.class);
            formPage = PageFactory.initElements(driver,FormPage.class);
            indexPage = PageFactory.initElements(driver,IndexPage.class);
            homePage.cargarPagina("http://ithinkchile.cl/sistemacobros/index.php");
            homePage.maximizarBrowser();
    }

    @Given("Presiono el boton Mi Cuenta desde home del sitio")
    public void presiono_el_boton_mi_cuenta_desde_home_del_sitio() {
        homePage.irARegistrarte();
    }
    @Given("Presiono el boton Ingresar desde menu desplegado")
    public void presiono_el_boton_ingresar_desde_menu_desplegado() {
        homePage.IrAForm();
    }
    @When("Ingreso usuario {string} en campo RUT")
    public void ingreso_usuario_en_campo_rut(String rut) {
        formPage.agregarRut(rut);
    }

    @When("Ingreso contrasena {string} en campo PASSWORD")
    public void ingreso_contrasena_en_campo_password(String pass) {
        formPage.agregarPass(pass);
    }
    @When("Presiono boton Ingresar")
    public void presiono_boton_ingresar() {
        formPage.Ingresar();
    }
    @Then("Visualizo seccion {string} de Portal Sistema IACC")
    public void visualizo_seccion_de_portal_sistema_iacc(String string) {
        //System.out.println("texto :"+string);
        //System.out.println("texto :"+ indexPage.obtenerIngresoExitoso());
        Assert.assertEquals(string, indexPage.obtenerIngresoExitoso());
    }

    @Then("Visualizo pagina Error {string} de Portal Sistema IACC")
    public void visualizo_pagina_error_de_portal_sistema_iacc(String string) {
        //System.out.println("texto :"+string);
        //System.out.println("texto :"+ indexPage.obtenerError());
        Assert.assertEquals(string,indexPage.obtenerError());
    }



}
