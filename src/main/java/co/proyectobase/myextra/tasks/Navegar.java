package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.Tecla;
import co.proyectobase.myextra.userinterface.MenuSection;
import co.proyectobase.myextra.userinterface.SqlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.proyectobase.myextra.interactions.Digitar.*;
import static co.proyectobase.myextra.interactions.Escribir.*;
import static co.proyectobase.myextra.interactions.Ir.*;
import static co.proyectobase.myextra.model.Tecla.*;
import static co.proyectobase.myextra.userinterface.MenuSection.*;
import static co.proyectobase.myextra.userinterface.SqlPage.*;

public class Navegar implements Task {

    private MenuSection menuSection;
    private SqlPage sqlPage;

    public static Navegar aUnMenu(){
        return Tasks.instrumented(Navegar.class );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                elTexto("1").en(AMBIENTE_DE_PRUEBAS),
                laTecla(ENTER.getTecla()),
                elTexto("1").en(CONFIRMACION_AMBIENTE_DE_PRUEBAS),
                laTecla(ENTER.getTecla()),
                elTexto("1").en(SQL),
                laTecla(ENTER.getTecla()),
                hastaVerTexto("SQL").en(TITULO_SQL_PAGE)
        );

    }
}
