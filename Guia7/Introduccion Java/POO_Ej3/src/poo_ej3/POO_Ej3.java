/*

 */
package poo_ej3;

import java.text.DecimalFormat;
import poo_ej3.entidad.Operacion;

/**
 *
 * @author Daniel
 */
public class POO_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion op = new Operacion();
        DecimalFormat df = new DecimalFormat("0.00");
        
        op.crearOperacion();
        System.out.println("La suma es: "+ df.format(op.sumar()));
        System.out.println("La resta es: "+ df.format(op.restar()));
        System.out.println("La multiplicación es: "+ df.format(op.multiplicar()));
        System.out.println("La división es: "+ df.format(op.dividir()));
        
        
    }
    
}
