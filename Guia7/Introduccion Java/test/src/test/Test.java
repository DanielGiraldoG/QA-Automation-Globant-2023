/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Scanner leer = new Scanner(System.in);
        String a = leer.nextLine(); 
        System.out.println(a);
      
        
        
        int num1 = 5, num2 = 3; 
        num1++;
        System.out.println(num1);
                
        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        nombre = leer.nextLine();
        
        System.out.println("Escribe tu edad:");
        edad = leer.nextInt();
        
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
        
        // Ejercicio 5
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        
        //Ejercicio 6
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el numero 1");
        num1 = leer.nextInt();
        System.out.println("Escribe el numero 2");
        num2 = leer.nextInt();
        
        
        if (num1 > 25 && num2> 25){
         
            System.out.println("Los dos números son mayores a 25");
         
        } else if (num1>25 || num2>25){
        
            System.out.println("Al menos uno de los dos numeros es mayor a 25");
        
        } else {
            System.out.println("Ninguno de los dos números es mayor a 25");
                }
        
        // Ejercicio 7
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entre 1 y 4");
        int numUsuario = leer.nextInt();
        
        switch (numUsuario) {
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para "
                        + "tipo de bomba");
        }
        //Ejercicio guia ejemplos - switch
        Scanner  leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String fraseUsuario = leer.nextLine();
        
        System.out.println("Ingrese un numero");
        double numUsuario = leer.nextDouble();
           
                
        System.out.println(Math.sqrt(numUsuario));
        System.out.println(fraseUsuario.toUpperCase());
        
        Scanner leer = new Scanner(System.in);       
       
         int motor;
         System.out.println("ingerse opción de motor"); 
         motor = leer.nextInt();
         String mensaje="";
         switch (motor){
             case 1: 
                 mensaje="La bomba es una bomba de agua";  
             break;
             case 2:
                 mensaje="La bomba es una bomba de gasolina";
                 break;
             case 3:
                 mensaje="La bomba es una bomba de hormigón";
                 break;
             case 4:
                 mensaje="La bomba es una bomba de alimenticio"; 
             default:
                 System.out.println("incorrecto");
         }
         
          System.out.println(mensaje);         
        
        // Ejercicio 8 -  while
        Scanner leer = new Scanner(System.in);
        double nota = leer.nextDouble();
        
        while (nota<0 || nota>10) {
            System.out.println("Favor ingresa una nota entre 0 y 10");
            nota = leer.nextDouble();
            
        }
        System.out.println("Has ingresado una nota entre 1 y 10");
        
        //Ejercicio 9 - do while
        
        int contadorNumeros = 0;
        double num;
        
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número");
            num = leer.nextDouble();
            contadorNumeros++;
        } while ((num != 0)&&(contadorNumeros<20));
        
        
        if (contadorNumeros < 20) {
            System.out.println("Se capturó el número 0");
        }else{
            System.out.println("El numero cero no fue encontrado y ya excediste "
                    + "los intentos");
        }
         */
 /*
        // Ejercicio 10 - for
        Scanner leer = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número");
             num = leer.nextInt();
            
            System.out.print(num + ":");
            
            for (int j = 0; j < num; j++) {
                System.out.print( "*");
            }
            System.out.println("");
        }
        
        /*
        // Ejercicio 11 - Procedimientos
        System.out.println("ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase;
        frase = leer.nextLine();

        SecuenciaCaracter(frase);
        
        
        }

        public static void SecuenciaCaracter(String frase) {

            int longitud;
            longitud = frase.length();
            String letra;

            for (int i = 0; i < longitud; i++) {
                letra = frase.substring(i, i + 1);

                switch (letra.toLowerCase()) {
                    case "a":
                        letra = "@";
                        break;
                    case "e":
                        letra = "#";
                        break;
                    case "i":
                        letra = "$";
                        break;
                    case "o":
                        letra = "%";
                        break;
                    case "u":
                        letra = "*";
                        break;

                }
                System.out.print(letra);
            }
            System.out.println("");


            // Ejercicio 13 - vector
            String[] vector = new String[4];
         */
 /*
        int ncontador = 0;
        Scanner leernumero = new Scanner(System.in);
        int numeroLeido;
        int suma = 0;

        do {
            System.out.println("Ingresa un numero");
            numeroLeido = leernumero.nextInt();
            ncontador++;

            if (numeroLeido > 0) {
                suma += numeroLeido;
            }

            if (numeroLeido == 0) {
                break;
            }

        } while (ncontador <= 20);

        if (numeroLeido == 0) {
            System.out.println("Se capturó el numero cero");
        }

        System.out.println("La sume de los numeros ingresado es " + suma);
         */
    }

}
