/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej6;

import poo_ej6.entidades.Nespresso;
import poo_ej6.servicios.ServicioNespresso;

/**
 *
 * @author Daniel
 */
public class POO_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ServicioNespresso sn = new ServicioNespresso();
//        
//        Nespresso n1 = sn.crearNespresso();
//        
//        System.out.println(n1.toString());

        Nespresso n1 = new Nespresso();

        n1.crearNespresso();
       // n1.llenarCafetera();
        n1.servirTaza();
        n1.agregarCafe();
        n1.toString();

    }

}
