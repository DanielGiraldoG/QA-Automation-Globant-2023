import java.util.Scanner;

public class tutorial {

public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
   
    String a = leer.nextLine();
    int num1 = 5, num2=1, suma,resta;
    boolean valido=true;
    suma = num1 + num2;
    resta = num2 - num1;

    System.out.println(a);
    System.out.println(suma);
    System.out.println(resta);

    System.out.println(valido);
}

}