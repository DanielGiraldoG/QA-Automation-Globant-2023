/*
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:

POSICIÓN LETRA

0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V

18 H
19 L
20 C
21 K
22 E
 */
package servicios;

import entidades.NIF;
import java.util.Arrays;
import java.util.Scanner;

public class NIFServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    int[] posicion = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 23};

    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    String DNI;

    public NIF crearNIF() {

        NIF nif = new NIF();
        System.out.println("Ingrese DNI: ");

        DNI = leer.next();

        nif.setDNI(Long.parseLong(DNI));
        //nif.setDNI(leer.nextLong());
        nif.setLetra(asignarLetra(nif));

        return nif;
    }

    public char asignarLetra(NIF nif) {

        int resto = (int) (nif.getDNI() % 23);

        char letra = letras[resto];

        return letra;
    }

    public void mostrarNIF(NIF nif) {

        System.out.println(nif.getDNI() + "-" + nif.getLetra());
        
        System.out.println(DNI + "-" + nif.getLetra());
        System.out.printf("%08d-%c\n", nif.getDNI(), nif.getLetra());
    }

}
