#Author: your.email.@your.domain.com
#language: es

  Característica: Aprendiendo a usar my extra

    @CasoExitoso
    Esquema del escenario: ingresar a my extra
      Dado que Rafa desea realizar consultas, Rafa abre my extra
      Cuando el ingresa sus credenciales
        | usuario   | password   | texto   |
        | <usuario> | <password> | <texto> |
      Y navega en un menu
      Entonces verifica el inicio de sesion correctamente en el <menuFinal>

      Ejemplos:
      | usuario | password | texto | menuFinal |
      | cricoc | 123456   | texto | Introducir sentencias SQL |