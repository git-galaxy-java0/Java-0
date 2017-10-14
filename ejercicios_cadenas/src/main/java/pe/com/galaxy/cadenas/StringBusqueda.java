package pe.com.galaxy.cadenas;

import org.apache.log4j.Logger;

public class StringBusqueda {
  
    public static final Logger LOGGER = Logger.getLogger(StringBusqueda.class);
    private String cadena;
    
    public int contarCantidadRepeticiones(String caracter){
        LOGGER.info("TEST contarCantidadRepeticiones");
        LOGGER.info("cadena :"+cadena);
        int contador = 0, posActual = 0;
        boolean continuar = true;
        
        //Pasamos al mundial...Peru!
        int pos = cadena.indexOf(caracter);
        LOGGER.info("pos : "+pos);
        while( pos >= 0 && continuar){ //si encontro caracter en la cadena
            contador++;//contador = contador + 1;
            posActual = pos;
            pos = cadena.indexOf(caracter, pos + 1);

            if (pos < 0) { //no encuentre caracter : validar que se evalue toda la cadena
                if (posActual > cadena.length()) {
                    continuar = false;
                }
            }
        }
        LOGGER.info("caracter buscado "+caracter+ " - contador : "+contador);
        return contador;
    }

    public boolean iniciaYTerminaEn(String strInicia, String strTermina){
        LOGGER.info("TEST iniciaYTerminaEn");
        LOGGER.info("cadena     :"+cadena);
        LOGGER.info("strInicia  :"+strInicia);
        LOGGER.info("strTermina :"+strTermina);
        boolean cierto = false;
        cierto = cadena.startsWith(strInicia) && cadena.endsWith(strTermina);
        LOGGER.info("cierto : "+cierto);
        return cierto;
    }
    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}
