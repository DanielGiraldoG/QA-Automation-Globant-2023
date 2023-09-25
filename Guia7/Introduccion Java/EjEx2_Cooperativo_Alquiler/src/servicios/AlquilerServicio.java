/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alquiler;
import entidades.Pelicula;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Alquiler alquileres[] = new Alquiler[20];
    private int contadorAlquileres = 0;

    public Alquiler crearAlquiler() {
        
        PeliculaServicio ps = new PeliculaServicio();
        Pelicula[] p = ps.getPeliculas();
        System.out.println(Arrays.toString(p));
        System.out.println("Ingrese el año, mes y dia que desea realizar el alquiler");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fechaInicial = new Date(anio - 1900, mes-1, dia);
        fechaInicial.setYear(anio);
        fechaInicial.setMonth(mes);
        fechaInicial.setDate(dia);

        System.out.println("Ingrese el año, mes y dia que desea finalizar el alquiler");
        int anioFinal = leer.nextInt();
        int mesFinal = leer.nextInt();
        int diaFinal = leer.nextInt();
        Date fechaFinal = new Date(anioFinal - 1900, mesFinal-1, diaFinal);
        fechaFinal.setYear(anioFinal);
        fechaFinal.setMonth(mesFinal);
        fechaFinal.setDate(diaFinal);

        Alquiler alquiler = new Alquiler();
        
        
        System.out.println(Arrays.toString(p));
        System.out.println("Ingrese posición de la pelicula que desea ingresar");
        
        int opcion = leer.nextInt();
        
        
        alquiler.setPeliculaAlquilada(p[opcion]);
        alquiler.setFechaInicio(fechaInicial);
        alquiler.setFechaFin(fechaFinal);

        alquileres[contadorAlquileres] = alquiler;
        contadorAlquileres++;

        return alquiler;
    }

    public void listarAlquileres() {

        for (int i = 0; i < contadorAlquileres; i++) {
            System.out.print("El alquiler " + i + " es: ");
            System.out.println(alquileres[i]);

        }

    }

    public void buscarAlquilerFecha() {
        
        System.out.println("Ingrese el año, mes y dia que desea realizar la busqueda");
        int anioBuscado = leer.nextInt();
        int mesBuscado = leer.nextInt();
        int diaBuscado = leer.nextInt();
        Date fechaBuscada = new Date(anioBuscado - 1900, mesBuscado-1, diaBuscado);

       
        

        fechaBuscada.setYear(anioBuscado);
        fechaBuscada.setMonth(mesBuscado);
        fechaBuscada.setDate(diaBuscado);

        for (int i = 0; i < contadorAlquileres; i++) {

            if (alquileres[i].getFechaInicio().equals(fechaBuscada)
                    || alquileres[i].getFechaFin().equals(fechaBuscada)) {

                System.out.println("Encontrado");
                System.out.println(alquileres[i].toString());

            } else {
                System.out.println("Alquiler no encontrado");
                System.out.println(fechaBuscada);

            }

        }

    }

}
