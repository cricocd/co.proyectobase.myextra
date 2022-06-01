package co.proyectobase.myextra.stepdefinitions;

import co.proyectobase.myextra.model.MyExtraData;
import co.proyectobase.myextra.questions.LaRespuesta;
import co.proyectobase.myextra.tasks.Abrir;
import co.proyectobase.myextra.tasks.Loguearse;
import co.proyectobase.myextra.tasks.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MyExtraStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver suNavegador;
    private Actor rafa = Actor.named("rafa");

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        rafa.can(BrowseTheWeb.with(suNavegador));
    }

    @Dado("^que Rafa desea realizar consultas, Rafa abre my extra$")
    public void queRafaDeseaRealizarConsultasRafaAbreMyExtra() {
        rafa.attemptsTo(Abrir.myExtra());
    }

    @Cuando("^el ingresa sus credenciales$")
    public void elIngresaSusCredenciales(List<MyExtraData> credenciales) {
        //rafa.attemptsTo(Loguearse.enMyExtra(credenciales));
    }

    @Cuando("^navega en un menu$")
    public void navegaEnUnMenu() {
        //rafa.attemptsTo(Navegar.aUnMenu());
    }

    @Entonces("^verifica el inicio de sesion correctamente en el (.*)$")
    public void verificaElInicioDeSesionCorrectamenteEnElIntroducirSentenciasSQL(String menu) {
        //rafa.should(seeThat(LaRespuesta.es(),equalTo(menu)));
    }
}
