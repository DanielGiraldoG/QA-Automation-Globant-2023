/*

 */
package poo_ej14_telefonos;

import entidades.Movil;
import servicios.MovilServicio;

public class POO_Ej14_Telefonos {

    public static void main(String[] args) {
        // TODO code application logic here

        MovilServicio ms = new MovilServicio();
        Movil m1 = ms.cargarCelular();

        ms.ingresarCodigo(m1);
        System.out.println(m1.toString());

    }

}
