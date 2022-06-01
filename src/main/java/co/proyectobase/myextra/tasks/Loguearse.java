package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.EscribirTexto;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.MyExtraData;
import co.proyectobase.myextra.model.Tecla;
import co.proyectobase.myextra.userinterface.LoginPage;
import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import static co.proyectobase.myextra.interactions.Digitar.*;
import static co.proyectobase.myextra.interactions.Escribir.*;
import static co.proyectobase.myextra.interactions.Ir.*;
import static co.proyectobase.myextra.model.Tecla.*;
import static co.proyectobase.myextra.userinterface.LoginPage.*;

public class Loguearse implements Task {

    private List<MyExtraData> myExtraData;
    private LoginPage loginPage;

    public Loguearse(List<MyExtraData> myExtraData) {

        this.myExtraData = myExtraData;
    }

    public static Loguearse enMyExtra(List<MyExtraData> credenciales){
        return Tasks.instrumented(Loguearse.class, credenciales);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                elTexto(myExtraData.get(0).getUsuario()).en(USUARIO),
                elTexto(myExtraData.get(0).getPassword()).en(PASSWORD),
                laTecla(ENTER.getTecla()),
                hastaVerTexto(myExtraData.get(0).getTexto()).en(UBICACION)
        );
    };
}
