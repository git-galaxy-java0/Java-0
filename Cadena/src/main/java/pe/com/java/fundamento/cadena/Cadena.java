package pe.com.java.fundamento.cadena;

import java.util.Date;
import org.apache.log4j.Logger;

public class Cadena {

    public static final Logger LOGGER = Logger.getLogger(Cadena.class);
    
    public static void main(String[] args) {

        //permitir ejecutar todas la lineas del bloque del metodo main
        String unico = "permitir ejecutar";

        //Manejo de String
        LOGGER.info("\n--String--");
        String frase = unico;
        LOGGER.info(frase.toUpperCase());
        frase = frase + " valor add";
        LOGGER.info(frase);

        //Manejo de String Buffer
        LOGGER.info("\n--StringBuffer--");
        StringBuffer sbf = new StringBuffer(unico);
        sbf.append(" valor add");
        LOGGER.info(sbf.toString());

        //Manejo de String Builder
        LOGGER.info("\n--StringBuilder--");//alt + 2  = \
        StringBuilder sbu = new StringBuilder(unico);
        sbu.append(" valor add");
        LOGGER.info(sbu.toString());

        Cadena obj = new Cadena();
        obj.comparacionTiposCadenas();
    }

    public void comparacionTiposCadenas() {

        String s1 = "a";
        StringBuffer s2 = new StringBuffer("a");
        StringBuilder s3 = new StringBuilder("a");
        //////////////////////////////////////////////////////////
        Date inicio = new Date();
        Date fin = null;

        for (int i = 0; i < 9999; i++) {
            s1 = s1 + "argentina no clasificara";
        }

        fin = new Date();
        long diferencia = fin.getTime() - inicio.getTime();
        LOGGER.info(diferencia + " milisegundos");
        //////////////////////////////////////////////////////////
        inicio = new Date();
        for (int i = 0; i < 9999; i++) {
            s2 = s2.append("argentina no clasificara");
        }
        fin = new Date();
        diferencia = fin.getTime() - inicio.getTime();
        LOGGER.info(diferencia + " milisegundos");
        /////////////////////////////////////////////////////////
        inicio = new Date();
        for (int i = 0; i < 9999; i++) {
            s3 = s3.append("argentina no clasificara");
        }
        fin = new Date();
        diferencia = fin.getTime() - inicio.getTime();
        LOGGER.info(diferencia + " milisegundos");

    }

}
