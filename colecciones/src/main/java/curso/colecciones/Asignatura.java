/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Asignatura {

    private int id;
    private String nombre;
    private Profesor myProfesor;
    private Aula myAula;
    private int horas;
    private Date inicio;
    private Date fin;
    private Set<Alumno> misAlumnos;

    Asignatura(int id, String nombre, Profesor myProfesor, Aula myAula, int horas, Date inicio, Date fin) {
        this.id = id;
        this.nombre = nombre;
        this.myAula = myAula;
        this.myProfesor = myProfesor;
        this.horas = horas;
        this.inicio = inicio;
        this.fin = fin;
        misAlumnos = new TreeSet<Alumno>();
    }

    public void addAlumno(Alumno myAlumno) {
        misAlumnos.add(myAlumno);
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setProfesor(Profesor myProfesor){
        this.myProfesor=myProfesor;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public void setInicio(Date inicio){
        this.inicio=inicio;
    }
    public void setFin(Date fin){
        this.fin=fin;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public Profesor getProfesor(){
        return myProfesor;
    }
    public int getHoras(){
        return horas;
    }
    public Date setInicio(){
        return inicio;
    }
    public Date setFin(){
        return fin;
    }
    @Override
    public String toString(){
        return ("Asignatura: "+this.nombre +"e identificador: "+this.id);
    }
}
