
package curso.colecciones;

import java.util.Map;
import java.util.TreeMap;

public class Academia {
  private String nombre;  
  private String direccion;
  Map<Integer, Alumno> alumnos;
  Map<Integer, Profesor> profesores;
  Map<Integer, Asignatura> asignaturas;
  Map<String, Aula> aulas;

    public Academia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.alumnos = new TreeMap<Integer, Alumno>();
        this.profesores = new TreeMap<Integer,Profesor>();
        this.asignaturas = new TreeMap<Integer,Asignatura>();
        this.aulas = new TreeMap<String,Aula>();
    }

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
         aulas.p.put(s, aula);
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
    
    public void listaAsignaturas(){
        System.out.println("\n Listado de Asignaturas");
        System.out.println(asignaturas);
    }
    
    public void listaProfesores(){
         System.out.println("\n Listado de Profesores");
        System.out.println(profesores);
    }
    
    public void listaAulas(){
         System.out.println("\n Listado de Aulas");
        System.out.println(aulas);
    }
      
    public void listaAlumnos(){
         System.out.println("\n Listado de alumnos");
        System.out.println(alumnos);
    }  
    
    
    public boolean existeAsignatura(Integer i){
          if(!alumnos.isEmpty() && alumnos.containsKey(i)){
            return true;
          }
          else {
              return false;
          }
        }
        
    public boolean existeProfesor(Integer i){
      if(!profesores.isEmpty() && profesores.containsKey(i))
            return true;
         else 
              return false;
          
    }
    
    public boolean existeAula(Integer i){
         if(!aulas.isEmpty() && aulas.containsKey(i))
            return true;
         else 
              return false;
    }
      
    public boolean existeAlumno(String s){
        if(!alumnos.isEmpty() && alumnos.containsKey(s))
            return true;
         else 
              return false;
        
    } 
    
    public void matricular (Integer i, Alumno alu, Integer j, Asignatura asig){
    
     this.addAlumno(i,alu);
     this.addAsignatura(j,asig);
    }
    
    }
    