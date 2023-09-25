/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package IntroJava;

/**
 *
 * @author Daniel
 */
public class EjExtra02_IntercambiarABCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int A = 1, B = 2, C = 3, D = 4, aux;

        
        
        System.out.println("Valores iniciales\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("\nValores finales\n"+"A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);

    }

//    public static int intercambiarVariables (int var1, int var2){
//       int aux;
//            
//        var2 = var1;
//        return var2;
//        
//    } 
}
