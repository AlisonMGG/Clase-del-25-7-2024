
package actividad.pkg25.del.pkg7;

public class Estudiante {
    
    private int clave;
    private String nombre,grado;
    
    public Estudiante(int clave,String nombre,String grado){
        this.clave = clave;
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return this.grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    
    
}
