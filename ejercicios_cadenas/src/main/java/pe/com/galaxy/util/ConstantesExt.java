package pe.com.galaxy.util;

import java.util.ResourceBundle;

public class ConstantesExt {

    public static final ResourceBundle constantes = ResourceBundle.getBundle("constantes");
    
    public static final String SI = constantes.getString("KEY_SI");
    public static final String NO = constantes.getString("KEY_NO");
    public static final double IGV = 0.18;
}
