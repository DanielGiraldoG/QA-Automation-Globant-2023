/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class CantanteApp {
    
    Scanner scan;
    CantanteServicio cs;
    ArrayList<CantanteFamoso> cantantes;
    
    public CantanteApp() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.cs = new CantanteServicio();
        this.cantantes = new ArrayList();
        
    }
    
    
    
    public void iniciar(){
        
                
        int opcion ;
        
        do {
            menu();
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    cs.agregarALista(cantantes);
                    break;
                case 2:
                    cs.mostrarCantantes(cantantes);
                    break;
                case 3:
                    cs.eliminarCantante(cantantes);
                    break;
                case 4:
                    System.out.println("Has salido del programa");
                    break;
                
                default:
                    System.out.println("Opcion invalida, favor ingrese "
                            + "nuevamente una opcion");
            }
            
            
        } while (opcion!=4);
        
        
        cs.mostrarCantantes(cantantes);
        
        
        
        
        
    }
    
    
    public void menu(){
        
        System.out.println("-----------MENU------------");
        System.out.println("1. Agregar cantantes");
        System.out.println("2. Mostrar cantantes");
        System.out.println("3. Eliminar");
        System.out.println("4. Salir");
        System.out.println("----------------------");
        
    }
    
    
    
}
