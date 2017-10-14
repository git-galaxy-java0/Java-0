package pe.com.galaxy.matematica;

import org.apache.log4j.Logger;

public class OpMatematica {

    public static final Logger LOGGER = Logger.getLogger(OpMatematica.class);
    
    public static void main(String[] args) {
        /*
        OpMatematica obj = new OpMatematica();
        obj.obtenerSolucionEcuacionGrado2( 7 , 8 , -11);
        */
        OpMatematica.obtenerSolucionEcuacionGrado2( 7, 8, -11);
        
    }
    
    public static void obtenerSolucionEcuacionGrado2( double a, double b, double c ){
        
        double determinante = Math.pow(b, 2) - 4*a*c;
        LOGGER.info("Calculando Ecuacion de Grado 2 - Raices");
        LOGGER.info("a = "+a);
        LOGGER.info("b = "+b);
        LOGGER.info("c = "+c);
        LOGGER.info("determinante = "+determinante);
        if ( determinante < 0) {
            //solucion en numeros imaginarios
            LOGGER.info( "Solo tiene solucion en los numeros imaginarios" );
        }else{
            //solucion en los numeros reales
            LOGGER.info( "Solucion en los numeros reales" );
            if ( determinante == 0 ) {
                double r1 = (-1) * b / 2 * a ;
                LOGGER.info( "R1 = R2 = " + r1);
            }else{
                double r1 =  ( (-1)*b  + Math.sqrt( determinante ) ) / ( 2 * a);
                double r2 =  ( (-1)*b  - Math.sqrt( determinante ) ) / ( 2 * a);
                LOGGER.info( "R1 = " + r1);
                LOGGER.info( "R2 = " + r2);
            }
        }
    }
}
