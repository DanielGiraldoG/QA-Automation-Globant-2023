/*
     método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
    nombre de cada alumno.

     Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnos

     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {

        Curso c = new Curso();

        System.out.println("Ingrese el nombre del curso");
        c.setNombreCurso(leer.next());

        System.out.println("Ingrese la cantidad de horas por día");
        c.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Ingrese la cantidad de dias por semana");
        c.setCantidadDiasPorSemana(leer.nextInt());

        System.out.println("Ingrese el turno: \n M: Mañana \n T: Tarde ");
        c.setTurno(leer.next().toLowerCase());

        System.out.println("Ingrese el precio por hora");
        c.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(c);

        return c;

    }

    public void cargarAlumnos(Curso c) {

        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + " del curso " + c.getNombreCurso());
            alumnos[i] = leer.next();
        }

        c.setAlumnos(alumnos);

    }

    public double calcularGananciaSemanal(Curso c) {
        double ganancia;

        ganancia = c.getCantidadHorasPorDia() * c.getCantidadDiasPorSemana() * c.getPrecioPorHora() * c.getAlumnos().length;

        return ganancia;

    }

}

/*
private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
 */
