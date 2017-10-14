package pe.com.galaxy.matematica;

import org.apache.log4j.Logger;
import pe.com.galaxy.util.ConstantesExt;

public class TestConstantes {

    public static final Logger LOGGER = Logger.getLogger(TestConstantes.class);
    
    public static void main(String[] args) {
        LOGGER.info( "IMPRESION DE VARIABLES ");
        LOGGER.info( ConstantesExt.SI );
        LOGGER.info( ConstantesExt.NO );
    }
}
