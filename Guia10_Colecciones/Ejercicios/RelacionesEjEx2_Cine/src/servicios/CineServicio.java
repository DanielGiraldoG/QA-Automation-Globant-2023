/*
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla,
 */
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;

public class CineServicio {

    public boolean tieneDineroDisponible(Espectador espectador, Cine cine) {

        return espectador.getDineroDisponible() >= cine.getPrecioEntrada();

    }

    public boolean tieneEdadRequerida(Espectador espectador, Pelicula pelicula) {

        return espectador.getEdad() >= pelicula.getEdadMin();

    }

    public void iniciarSimulacion() {
        Pelicula pelicula = new Pelicula("Interstellar", 169, 25, "Nolan");
        Cine cine = new Cine();
        cine.setPrecioEntrada(60);
        Espectador[][] sala = new Espectador[8][6];
        Random random = new Random();
        int fila;
        int columna;
        int contador = -1;
        EspectadorServicio es = new EspectadorServicio();
        ArrayList<Espectador> espectadores = es.inicializarEspectadores();

        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 4; j++) {
                contador++;
                fila = random.nextInt(7) + 1;
                columna = random.nextInt(5) + 1;

                if (tieneDineroDisponible(espectadores.get(contador), cine)
                        && tieneEdadRequerida(espectadores.get(contador), pelicula)) {
                   
                    if (sala[fila][columna] == null) {

                        sala[fila][columna] = espectadores.get(contador);
                    } else {
                        while (sala[fila][columna] != null) {
                            fila = random.nextInt(7) + 1;
                            columna = random.nextInt(5) + 1;
                       
                        }
                        sala[fila][columna] = espectadores.get(contador);

                    }
                    System.out.println("La persona "+ espectadores.get(contador).toString() 
                            + "se le asigno el asiento " + (fila + 1) + "," + (columna+1) );
                    

                }
                
                

            }
        }
        cine.setSalaEspectadores(sala);
        
        mostrarCine(cine);
        
    }
    
    public void mostrarCine(Cine cine){
        Espectador[][] sala = cine.getSalaEspectadores();
        String aux= "";
        
        for (int i = 7; i >=0; i--) {
            System.out.print("|");
            for (int j = 0; j < 6; j++) {
                         
                switch (j) {
                    case 0:
                        aux = "A";
                        break;
                    case 1:
                        aux = "B";
                        break;
                    case 2:
                        aux = "C";
                        break;
                    case 3:
                        aux = "D";
                        break;
                    case 4:
                        aux = "E";
                        break;
                    case 5:
                        aux = "F";
                        break;
                             
                }
                      
                
                if (sala[i][j]== null) {
                    System.out.print((i+1) + aux +"_|");
                }
                else {
                    System.out.print((i+1) + aux+"X|");
                    
                }
            }
            System.out.println("");
        }
        
        
        
        
    }
    

}
