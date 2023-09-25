/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio7.servicios;

import java.util.Scanner;
import poo_ejercicio7.entidades.Persona;

/**
 *
 * @author Daniel
 */
public class PersonaService {

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Persona ps = new Persona();

        System.out.println("Ingrese el nombre: ");
        ps.setNombre(sc.nextLine());

        System.out.println("Ingrese la edad: ");
        ps.setEdad(sc.nextInt());

        System.out.println("Ingrese el sexo: \n H: Hombre \n M: Mujer \n O: Otro");
        validarSexo(sc.next(), ps);

        System.out.println("Ingrese el peso: ");
        ps.setPeso(sc.nextInt());

        System.out.println("Ingrese la altura en cm: ");
        ps.setAltura(sc.nextInt());

        return ps;

    }

    public void validarSexo(String sexo, Persona ps) {

        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {
            ps.setSexo(sexo);
            System.out.println("El sexo ingresado es correcto");
        } else {
            System.out.println("El sexo ingresado no es correcto");
        }

    }

    public int calcularIMC(Persona persona) {

        double pesoIdeal = persona.getPeso() / Math.pow((persona.getAltura() / 100), 2);

        if (pesoIdeal > 25) {
            return 1;
        } else if (pesoIdeal > 20) {
            return 0;

        } else {
            return -1;
        }

    }

    public boolean esMayorDeEdad(Persona persona) {

        int edad = persona.getEdad();

        return edad > 18;
    }

}
