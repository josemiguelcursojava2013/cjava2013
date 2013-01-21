
package curso.colecciones;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;


public class Aula {
    private String aula;
    private int capacidad;
    private boolean tieneProyector;
    private Set<Asignatura> asignatura;
    private boolean[][] horario=new boolean[7][24];

    public Aula(String aula, int capacidad, boolean tieneProyector) {
        this.aula = aula;
        this.capacidad = capacidad;
        this.tieneProyector = tieneProyector;
    }
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
     public void OcuparHora(Date fecha){
         int dia;
         int hora;
         Calendar myCalendar=Calendar.getInstance();
         myCalendar.setTime(fecha);
         dia=myCalendar.DAY_OF_WEEK;
         hora=myCalendar.HOUR_OF_DAY;
         horario[dia][hora]=false;
     }
     public void LiberarHora(Date fecha){
         int dia;
         int hora;
         Calendar myCalendar=Calendar.getInstance();
         myCalendar.setTime(fecha);
         dia=myCalendar.DAY_OF_WEEK;
         hora=myCalendar.HOUR_OF_DAY;
         horario[dia][hora]=true;
     }
     public void devolverEsLibre(Date fecha){
         int dia;
         int hora;
         Calendar myCalendar=Calendar.getInstance();
         myCalendar.setTime(fecha);
         dia=myCalendar.DAY_OF_WEEK;
         hora=myCalendar.HOUR_OF_DAY;
         if(horario[dia][hora]){
             System.out.println("La hora está libre");
         }
         else{
             System.out.println("La hora está ocupada");
         }
     }
       
}
