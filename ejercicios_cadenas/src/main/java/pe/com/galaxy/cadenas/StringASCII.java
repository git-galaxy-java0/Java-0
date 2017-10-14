package pe.com.galaxy.cadenas.ascii;

import org.apache.log4j.Logger;

public class StringASCII {
  
    public static final Logger LOGGER = Logger.getLogger(StringASCII.class);
   
    private int rangoInicio;
    private int rangoFin;
    
    public void imprimirValoresASCII(){
        //32 .....49
        LOGGER.info("TEST : imprimirValoresASCII");
        LOGGER.info("rangoInicio :"+rangoInicio);
        LOGGER.info("rangoFin :"+rangoFin);
        for (int i = rangoInicio; i <= rangoFin; i++) {
            //0 1 2 3 4 ... 8 9
            char ch = (char) i;
            LOGGER.info( i + " : " + ch );
        }
        
    }

    public int getRangoInicio() {
        return rangoInicio;
    }

    public void setRangoInicio(int rangoInicio) {
        this.rangoInicio = rangoInicio;
    }

    public int getRangoFin() {
        return rangoFin;
    }

    public void setRangoFin(int rangoFin) {
        this.rangoFin = rangoFin;
    }
}
