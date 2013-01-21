
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
  
    public void addAlumno(Integer i,Alumno alumno) {
        alumnos.put(i, alumno);
    }
    
    public void addProfesor(Integer i,Profesor profesor) {
        profesores.put(i, profesor);
    }
    
    public void addAsignatura(Integer i,Asignatura asignatura) {
        asignaturas.put(i, asignatura);
    }
    
    public void addAula(String s, Aula aula){
         aulas.put(s, aula);
    }
    
    public void removeAlumno(Integer i) {
        alumnos.remove(i);
    }
    
    public void removeProfesor(Integer i) {
        profesores.remove(i);
    }
    
    public void removeAsignatura(Integer i) {
        asignaturas.remove(i);
    }
    
    public void removeAula(String s){
        aulas.remove(s);
    }
    
    public void listaAsignaturas(String s){
        System.out.println(asignaturas);
    }
    
    public void listaProfesores(String s){
        System.out.println(profesores);
    }
    
    public void listaAulas(String s){
        System.out.println(aulas);
    }
      
    public void listaAlumnos(String s){
        System.out.println(alumnos);
    }  
}
