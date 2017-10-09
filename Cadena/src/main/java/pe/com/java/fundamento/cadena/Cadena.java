package pe.com.java.fundamento.cadena;

import java.util.Date;

public class Cadena {

    public static void main(String[] args) {

        //permitir ejecutar todas la lineas del bloque del metodo main
        String unico = "permitir ejecutar";

        //Manejo de String
        System.out.println("\n--String--");
        String frase = unico;
        System.out.println(frase.toUpperCase());
        frase = frase + " valor add";
        System.out.println(frase);

        //Manejo de String Buffer
        System.out.println("\n--StringBuffer--");
        StringBuffer sbf = new StringBuffer(unico);
        sbf.append(" valor add");
        System.out.println(sbf.toString());

        //Manejo de String Builder
        System.out.println("\n--StringBuilder--");//alt + 2  = \
        StringBuilder sbu = new StringBuilder(unico);
        sbu.append(" valor add");
        System.out.println(sbu.toString());

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
        System.out.println(diferencia + " milisegundos");
        //////////////////////////////////////////////////////////
        inicio = new Date();
        for (int i = 0; i < 9999; i++) {
            s2 = s2.append("argentina no clasificara");
        }
        fin = new Date();
        diferencia = fin.getTime() - inicio.getTime();
        System.out.println(diferencia + " milisegundos");
        /////////////////////////////////////////////////////////
        inicio = new Date();
        for (int i = 0; i < 9999; i++) {
            s3 = s3.append("argentina no clasificara");
        }
        fin = new Date();
        diferencia = fin.getTime() - inicio.getTime();
        System.out.println(diferencia + " milisegundos");

    }

}
