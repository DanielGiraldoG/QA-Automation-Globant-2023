/*
Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
package entidades;

import java.util.ArrayList;


public class Voto {
    
    private Alumno alumno;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
    
    
    
    
}
