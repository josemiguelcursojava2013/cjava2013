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

    public String nombre() {
        return nombre;
    }

    public void addAsignatura(Asignatura asignatura) {
        misAsignaturas.add(asignatura);
    }

    public void removeAsignatura(Asignatura asignatura) {
        misAsignaturas.remove(asignatura);
    }
}
