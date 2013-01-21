/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Alumno {

    private int id;
    private String nombre;
    private Set<Asignatura> misAsignaturas;

    Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        misAsignaturas = new TreeSet<Asignatura>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void addAsignatura(Asignatura asignatura) {
        if(misAsignaturas.isEmpty() || !misAsignaturas.contains(asignatura)){
            misAsignaturas.add(asignatura);
        }
    }
    public void removeAsignatura(Asignatura asignatura) {
        if(!misAsignaturas.isEmpty() && misAsignaturas.contains(asignatura)){
            misAsignaturas.remove(asignatura);
        }
    }
    @Override
    public boolean equals(Object obj){
        
        if(obj==null){
            return false;
        }
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Alumno miAlumno=(Alumno) obj;
        if(this.nombre!=miAlumno.nombre){
            return false;
        }
        if(this.id!=miAlumno.id){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return ("Alumno: "+this.nombre +"e identificador: "+this.id);
    }
    
}
