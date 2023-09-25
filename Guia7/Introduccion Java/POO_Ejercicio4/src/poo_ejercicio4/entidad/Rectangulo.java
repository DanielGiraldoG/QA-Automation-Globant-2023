/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio4.entidad;



/**
 *
 * @author Daniel
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
       
        
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
//    public void crearRectangulo(){
//         Scanner sc = new Scanner(System.in).useDelimiter("\n");
//         System.out.println("Ingrese base: ");
//         base = sc.nextInt();
//         System.out.println("Ingrese altura");
//         altura = sc.nextInt();
//         
//    }
//    
//    public int calcularSuperficie(){
//        return base*altura;
//    }
//    
//    public int calcularArea(){
//        return (base+altura)*2;
//    }
//    
//    public void dibujarRectangulo(){
//        for (int i = 0; i < altura; i++) {
//            for (int j = 0; j < base; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        
        
    }
    

