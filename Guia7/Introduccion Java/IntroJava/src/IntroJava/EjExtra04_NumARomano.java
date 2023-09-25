/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EjExtra04_NumARomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un número que esté entre 1 y 10");
            num = read.nextInt();
        } while (num<1 || num>10);
        
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VII");
                break;
            case 9:
                System.out.println("IX");
                break;
            default:
                System.out.println("X");
        }
        
        
    }
    
}
