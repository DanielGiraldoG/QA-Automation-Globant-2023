/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NIFService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    String DNI;

    public  NIF crearNIF() {

        NIF nif = new NIF();
        System.out.println("Ingrese DNI: ");

        DNI = leer.next();

        nif.setDNI(Long.parseLong(DNI));

        nif.setLetra(asignarLetra(nif));
        
       

        return nif;
    }

    public char asignarLetra(NIF nif) {

        int resto = (int) (nif.getDNI() % 23);

        char letra = letras[resto];

        return letra;
    }

    public void mostrarNIF(NIF nif) {
        System.out.println("Version con String: ");
        System.out.println(DNI + "-" + nif.getLetra());
        System.out.println("Version con expresiones regulares");
        System.out.printf("%08d-%s", nif.getDNI(), nif.getLetra());
        System.out.println("");

    }

}
