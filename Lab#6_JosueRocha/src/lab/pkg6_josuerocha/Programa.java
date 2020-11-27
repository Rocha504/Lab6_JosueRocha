 
package lab.pkg6_josuerocha;

/**
 *
 * @author josue
 */
public class Programa {
    
    private String nombre;
    private int puntuacion;
    private int fecha;
    private String tipo;
    private String genero;

    public Programa() {
    }

    public Programa(String nombre, int puntuacion, int fecha, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre+"("+tipo+"-"+genero+")";
    }
    
    
    
}
