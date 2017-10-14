package pe.com.galaxy.cadenas;

import pe.com.galaxy.cadenas.ascii.StringASCII;

public class TestCadenas {
    
    public static void main(String[] args) {
        
        //Ejer 1.1 ASCII
        StringASCII obj1 = new StringASCII();
        obj1.setRangoInicio(32);
        obj1.setRangoFin(49);
        obj1.imprimirValoresASCII();
        
        //Ejer 2.1 Busq Caracter
        StringBusqueda obj2 = new StringBusqueda();
        obj2.setCadena("Pasamos al mundial...Peru!");
        int cantidad = obj2.contarCantidadRepeticiones("!");
        
        obj2.iniciaYTerminaEn("Pasa", "Peru");//v
        obj2.iniciaYTerminaEn("Pasam", "Peru!");//v
        obj2.iniciaYTerminaEn("Pasador", "Peru!");//f
    }
}
