package co.proyectobase.myextra.userinterface;

import co.proyectobase.myextra.model.Target;
import net.serenitybdd.core.pages.PageObject;

import static co.proyectobase.myextra.model.Target.*;

public class LoginPage extends PageObject {

    public static final Target USUARIO = the("donde ingresamos el usuario").locatedBy(6,53);
    public static final Target PASSWORD = the("donde ingresamos el usuario").locatedBy(7,53);
    public static final Target UBICACION = the("donde ingresamos el usuario").locatedBy(5,77);
}
