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
          
        Asignatura asi1 = new Asignatura(1,"Matematicas",profe1,aula1,9,new Date(),fecha);
        Asignatura asi2 = new Asignatura(2,"Java",profe1,aula1,9,new Date(),fecha1);
        
        Alumno alu1 = new Alumno(1,"Juan perez");
        Alumno alu2 = new Alumno(2,"Armando Sopena");
        Alumno alu3 = new Alumno(3,"Juan perez");
        Alumno alu4 = new Alumno(4,"Armando Sopena");
        
        aca.matricular(4,alu4,2, asi2);
        aca.matricular(1,alu1, 1,asi1);
        aca.matricular(1,alu1,2, asi2);
        aca.matricular(2,alu2,1,asi1);
        
        
        aca.listaAsignaturas();
        aca.listaProfesores();
        aca.listaAulas();
        aca.listaAlumnos();
    }
    
    
}
