package pe.com.java.fundamento.ejercicios_cadenas;

import org.apache.log4j.Logger;
import pe.com.galaxy.matematica.OpMatematica;

public class Main {
 
    public static final Logger LOGGER = Logger.getLogger(Main.class);
    
    public static void main(String[] args) {
        System.out.println("");
        
        LOGGER.info("impresion de log4j");
        
        OpMatematica.obtenerSolucionEcuacionGrado2( 7, 8, -11);
    }
}
