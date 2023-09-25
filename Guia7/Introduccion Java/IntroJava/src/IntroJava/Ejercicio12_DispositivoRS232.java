/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package IntroJava;

import java.util.Scanner;

public class Ejercicio12_DispositivoRS232 {

    public static void main(String[] args) {
        // TODO code application logic here

        int contadorSecuencia;
        contadorSecuencia = contarCadenasValidas();
        System.out.println("El número de cadenas validas ingresadas es:" + contadorSecuencia);
    }

    public static int contarCadenasValidas() {

        String secuencia = "", primerLetra, ultimaLetra;
        int longitud, contadorSecuenciaValidas = 0;
        
        Scanner read = new Scanner(System.in);

        while (!(secuencia.equals("&&&&&"))) {
            System.out.println("Ingrese una secuencia");
            secuencia = read.next();

            longitud = secuencia.length();
            primerLetra = secuencia.substring(0, 1);
            ultimaLetra = secuencia.substring(longitud - 1);

            if ((longitud <= 5) && (primerLetra.equalsIgnoreCase("X")) && (ultimaLetra.equalsIgnoreCase("0"))) {
                contadorSecuenciaValidas++;
            }

        }
        return contadorSecuenciaValidas;

    }

}
