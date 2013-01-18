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
    int id;
    String nombre;
    Profesor myProfesor;
    Aula myAula;
    int horas;
    Date inicio;
    Date fin;
    Set <Alumno> misAlumnos;
    
    Asignatura(int id,String nombre,Profesor myProfesor,Aula myAula,int horas,Date inicio,Date fin){
        this.id=id;
        this.nombre=nombre;
        this.myAula=myAula;
        this.myProfesor=new Profesor;
        this.horas=new horas;
        this.inicio=inicio;
        this.fin=fin;
        misAlumnos=new TreeSet <Alumno>();
    }
}
