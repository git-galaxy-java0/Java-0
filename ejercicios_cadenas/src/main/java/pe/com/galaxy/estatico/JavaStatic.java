package pe.com.galaxy.estatico;

import java.util.Date;
import org.apache.log4j.Logger;

public class JavaStatic {
    
    public static final Logger LOGGER = Logger.getLogger(JavaStatic.class);
    
    //el valor de variable o atributo es la misma en todos los objetos
    static int CANT_OBJETOS = 0;
    private Date hora;
    
    public JavaStatic(){
        hora = new Date();
        CANT_OBJETOS = CANT_OBJETOS + 1;
        LOGGER.info("Se adicionar un nuevo objeto : Total "+CANT_OBJETOS);
    }
    
    public static void main(String[] args) {
        try {
            
        //Lleve un contador, de cuantos objetos han sido creado, de la clase JavaStatic
        LOGGER.info("VALIDANDO CONTADOR DE OBJETOS");
        JavaStatic obj1 = new JavaStatic();
        LOGGER.info( obj1.mostrarDatos() );
        
        new Thread().sleep( 5000);
        
        JavaStatic obj2 = new JavaStatic();
        LOGGER.info( obj2.mostrarDatos() );
        
        new Thread().sleep( 5000);
        
        JavaStatic obj3 = new JavaStatic();
        LOGGER.info( obj3.mostrarDatos() );
        
        LOGGER.info("Vuelta impresion");
        LOGGER.info( obj1.mostrarDatos() );
        LOGGER.info( obj2.mostrarDatos() );
        LOGGER.info( obj3.mostrarDatos() );
        
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    private String mostrarDatos() {
        return "Cantidad Objetos :" + CANT_OBJETOS + " - "+hora;
    }
    
}
