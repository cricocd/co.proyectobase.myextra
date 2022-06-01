package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Iniciar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.proyectobase.myextra.interactions.Iniciar.*;

public class Abrir implements Task {

    public static Abrir myExtra(){
        return new Abrir();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                attachmateMyExtra()
        );

    }
}
