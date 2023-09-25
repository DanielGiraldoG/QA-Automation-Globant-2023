/*

 */
package poo_ej13_profesorcurso;

import entidades.Curso;
import servicios.CursoServicio;

/**
 *
 * @author Daniel
 */
public class POO_Ej13_ProfesorCurso {

    public static void main(String[] args) {
        // TODO code application logic here
        CursoServicio cs = new CursoServicio();
        Curso curso1 = cs.crearCurso();

        System.out.println(curso1.toString());
        System.out.println("La ganancia de la semana es: " + cs.calcularGananciaSemanal(curso1));

    }

}
