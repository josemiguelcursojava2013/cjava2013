
package curso.colecciones;


public class Profesor {
    Integer Id;
    String Nombre;
    String Direccion;
    set<Asignatura> asignatura;

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
        return ;
    }

    }
    
    
    
    
    
    
}
