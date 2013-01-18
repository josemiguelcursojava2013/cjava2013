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
    private Set <Alumno> misAlumnos;
    
    Asignatura(int id,String nombre,Profesor myProfesor,Aula myAula,int horas,Date inicio,Date fin){
        this.id=id;
        this.nombre=nombre;
        this.myAula=myAula;
        this.myProfesor=myProfesor;
        this.horas=horas;
        this.inicio=inicio;
        this.fin=fin;
        misAlumnos=new TreeSet <Alumno>();
    }
    public void addAlumno(Alumno myAlumno){
        misAlumnos.add(myAlumno);
    }
}
