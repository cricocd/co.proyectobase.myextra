package co.proyectobase.myextra.userinterface;

import co.proyectobase.myextra.model.Target;
import net.serenitybdd.core.pages.PageObject;

import static co.proyectobase.myextra.model.Target.*;

public class MenuSection extends PageObject {

    public static final Target AMBIENTE_DE_PRUEBAS = the("menu del ambiente de pruebas").locatedBy(8,10);
    public static final Target CONFIRMACION_AMBIENTE_DE_PRUEBAS = the("menu del ambiente de pruebas").locatedBy(18,8);
    public static final Target SQL = the("menu del ambiente de pruebas").locatedBy(13,9);
}
