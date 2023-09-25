/*
Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
package servicios;

import entidades.Raiz;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RaizServicio {

    Scanner leer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    public Raiz CrearRaices() {

        Raiz r = new Raiz();

        System.out.println("Ingrese coeficiente A");
        r.setCoeficienteA(leer.nextInt());
        System.out.println("Ingrese coeficiente B");
        r.setCoeficienteB(leer.nextInt());
        System.out.println("Ingrese coeficiente C");
        r.setCoeficienteC(leer.nextInt());

        return r;
    }

    public double getDiscriminante(Raiz r) {

        int a = r.getCoeficienteA(), b = r.getCoeficienteB(), c = r.getCoeficienteC();
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        return discriminante;

    }

    public boolean tieneRaices(Raiz r) {

        return getDiscriminante(r) >= 0;

    }

    public boolean tieneRaiz(Raiz r) {

        return getDiscriminante(r) == 0;

    }

    public void obtenerRaices(Raiz r) {

        int a = r.getCoeficienteA(), b = r.getCoeficienteB(), c = r.getCoeficienteC();

        if (tieneRaices(r)) {
            double raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            System.out.println("Las raices son: \n" + df.format(raiz1));
            System.out.println(df.format(raiz2));
        } 

    }

    public void obtenerRaiz(Raiz r) {

        int a = r.getCoeficienteA(), b = r.getCoeficienteB(), c = r.getCoeficienteC();

        if (tieneRaiz(r)) {
            double raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            System.out.println("Las raiz es: \n" + df.format(raiz1));

        } 

    }

    public void calcular(Raiz r) {

        if (getDiscriminante(r) == 0) {
            obtenerRaiz(r);
        } else if (getDiscriminante(r) > 0) {
            obtenerRaices(r);
        }else{
            System.out.println("No tiene solución");
        }

    }

}
