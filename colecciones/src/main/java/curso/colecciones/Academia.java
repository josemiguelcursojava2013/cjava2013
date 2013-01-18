
package curso.colecciones;

import java.util.Map;

public class Academia {
  private String nombre;  
  private String direccion;
  Map<Integer, Alumno> alumnos;
  Map<Integer, Profesor> profesores;
  Map<Integer, Asignatura> asignaturas;
  Map<String, Aula> aulas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  
    public void addAlumno(Alumno alumno) {
        
    }
    
    public void addProfesor(Profesor profesor) {
        
    }
    
    public void addAsignatura(Asignatura asignatura) {
        
    }
    
    public void addAula(Aula, aula){
        
    }
}
