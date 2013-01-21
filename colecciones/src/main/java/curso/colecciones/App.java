package curso.colecciones;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Academia!" );
        Academia aca = new Academia("SAPIENS","Ande viva llo y mi kaballo");
        
        
        //aulas
        Aula aula1 = new Aula("Aula1",15,true);
        Aula aula2 = new Aula("Aula2",25,true);
        Aula aula3 = new Aula("Aula3",15,false);
        
        aca.addAula("AULA1", aula1);
        aca.addAula("AULA2", aula2);
        aca.addAula("AULA3", aula3);
        
        // Profesores
        Profesor profe1 = new Profesor(1,"Pepe","Perez");
        Profesor profe2 = new Profesor(1,"Juan","Casas");
        
        aca.addProfesor(1, profe1);
        aca.addProfesor(2, profe2);
        
        
             Calendar calendar = Calendar.getInstance();
 
            calendar.set(Calendar.DAY_OF_MONTH, 11);
            calendar.set(Calendar.MONTH, 10);
            calendar.set(Calendar.YEAR,2013);
            Date fecha = calendar.getTime();
            
                    
            Calendar calendar1 = Calendar.getInstance();
 
            calendar.set(Calendar.DAY_OF_MONTH, 11);
            calendar.set(Calendar.MONTH, 10);
            calendar.set(Calendar.YEAR,2013);
            Date fecha1 = calendar1.getTime();
          
        Asignatura asi1 = new Asignatura(1,"Luis Gomez",profe1,aula1,9,new Date(),fecha);
        Asignatura asi2 = new Asignatura(2,"Pepe Perez",profe1,aula1,9,new Date(),fecha1);
        

        
        
    }
    
    
}
