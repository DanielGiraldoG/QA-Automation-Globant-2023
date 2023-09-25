/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class POO_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anio, mes, dia;

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese año, mes y dia:");
        anio = leer.nextInt() - 1900;
        mes = leer.nextInt();
        dia = leer.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println("La fecha ingresada:" + fecha + "\n");
        
        Date fechaActual = new Date();
        System.out.println("Fecha actual:" + fechaActual+ "\n");
     
        int difFecha = (fechaActual.getYear() - fecha.getYear());
        
        
//        System.out.println(fechaActual.getYear());
//        System.out.println(fecha.getYear());
        System.out.println("Diferencia entre la fecha actual y la ingresada: " + difFecha + "\n");

    }

}
