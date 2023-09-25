
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicio {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();
    
    public void crearAlumno(){
        
        boolean opcion;
        
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(scan.next());
            
            System.out.println("Ingrese las 3 notas: ");
            alumno.getNotas().add(scan.nextInt());
            alumno.getNotas().add(scan.nextInt());
            alumno.getNotas().add(scan.nextInt());
            
            alumnos.add(alumno);
            
            System.out.println("¿Quiere ingresar otro alumno? (S / N)");
            opcion = scan.next().equalsIgnoreCase("S");
            
        } while (opcion);
  
    }
  
    public double notaFinal(){
        
        System.out.println("Ingrese el alumno que desea buscar");
        String alumnoBuscado = scan.next();
        int promedio = 0;
        double notaFinal= -1;
        boolean encontrado = false;
        
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnoBuscado.equals(alumnos.get(i).getNombre())) {
                System.out.println("Alumno encontrado: ");
                for (Integer nota : alumnos.get(i).getNotas()) {
                    promedio += nota;
                }
                notaFinal = promedio / alumnos.get(i).getNotas().size();
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Alumno no ha sido encontrado");
        }
        
        
        return notaFinal;
    }
    
    
}
