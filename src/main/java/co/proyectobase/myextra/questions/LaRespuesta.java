package co.proyectobase.myextra.questions;

import co.proyectobase.myextra.interactions.Leer;
import co.proyectobase.myextra.userinterface.SqlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.proyectobase.myextra.userinterface.SqlPage.*;

public class LaRespuesta implements Question <String> {

    public static LaRespuesta es(){
        return new LaRespuesta();
    }


    @Override
    public String answeredBy(Actor actor) {
        return Leer.elTextoEn(TITULO_SQL_PAGE);
    }
}
