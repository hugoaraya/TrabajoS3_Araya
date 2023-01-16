Feature: Validacion de ingreso Sistema IACC
  Como: Usuario del Sistema
  Quiero: Validar formulario de Ingreso
  Para: Realizar certificacion de seguridad

  Scenario: 01-Ingreso a Portal Sistema IACC - Ingreso OK
    Given Estoy en el sitio http://ithinkchile.cl/sistemacobros/index.php
    And Presiono el boton Mi Cuenta desde home del sitio
    And Presiono el boton Ingresar desde menu desplegado
    When Ingreso usuario "15353478-0" en campo RUT
    And Ingreso contrasena "1234" en campo PASSWORD
    And Presiono boton Ingresar
    Then Visualizo seccion "Home My Pyme" de Portal Sistema IACC


  Scenario: 02-Ingreso a Portal Sistema IACC - Ingreso Usuario Invalido
    Given Estoy en el sitio http://ithinkchile.cl/sistemacobros/index.php
    And Presiono el boton Mi Cuenta desde home del sitio
    And Presiono el boton Ingresar desde menu desplegado
    When Ingreso usuario "999999999-0" en campo RUT
    And Ingreso contrasena "1234" en campo PASSWORD
    And Presiono boton Ingresar
    Then Visualizo pagina Error "error desconocido" de Portal Sistema IACC

  Scenario: 03-Ingreso a Portal Sistema IACC - Ingreso Clave Invalida
    Given Estoy en el sitio http://ithinkchile.cl/sistemacobros/index.php
    And Presiono el boton Mi Cuenta desde home del sitio
    And Presiono el boton Ingresar desde menu desplegado
    When Ingreso usuario "15353478-0" en campo RUT
    And Ingreso contrasena "1111" en campo PASSWORD
    And Presiono boton Ingresar
    Then Visualizo pagina Error "error desconocido" de Portal Sistema IACC

