
package curso.colecciones;

import java.util.Set;
import java.util.TreeSet;


public class Profesor {
    Integer Id;
    String Nombre;
    String Direccion;
    Set<Asignatura> asignaturas;

    public Profesor(Integer Id, String Nombre, String Direccion) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.asignaturas = new TreeSet<Asignatura>();
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void addAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
        return ;
    }
     public void removeAsignatura(Asignatura asignatura) {
         asignaturas.remove(asignatura);
        return ;
    }
}
    

 