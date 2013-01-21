
package curso.colecciones;

import java.util.Set;


public class Aula {
    private String aula;
    private int capacidad;
    private boolean tieneProyector;
    private Set<Asignatura> asignatura;

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isTieneProyector() {
        return tieneProyector;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }
    
    public void addAsignatura(Asignatura a) {
        asignatura.add(a);
        
    }
     public void removeAsignatura(Asignatura a) {
        asignatura.remove(a);
        
    }
       
}
