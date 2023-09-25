/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EjExtra01_MinAHorasDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner read = new Scanner(System.in);
    int min, dias, horas;

    System.out.println("Ingrese el tiempo en minutos que desea convertir");
    min = read.nextInt();
        
        dias = min / (60 * 24) ; 
        horas = min % (60*24)/60;
        
        System.out.println("dias: " + dias + "; horas: "+ horas);
        
        
    }
    
}
