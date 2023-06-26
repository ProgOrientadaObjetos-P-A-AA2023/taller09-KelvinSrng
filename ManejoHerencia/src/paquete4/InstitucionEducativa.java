package paquete4;

/**
 *
 * @author Jhonder
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {

        nombre = n;
        siglas = s;

    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerSiglas(String x) {
        siglas = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
}
