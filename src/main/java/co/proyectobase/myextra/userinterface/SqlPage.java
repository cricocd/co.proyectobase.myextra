package co.proyectobase.myextra.userinterface;

import co.proyectobase.myextra.model.Target;
import net.serenitybdd.core.pages.PageObject;

import static co.proyectobase.myextra.model.Target.*;

public class SqlPage extends PageObject {

    public static final Target TITULO_SQL_PAGE = the("menu del ambiente de pruebas").locatedBy(1,50);

}
