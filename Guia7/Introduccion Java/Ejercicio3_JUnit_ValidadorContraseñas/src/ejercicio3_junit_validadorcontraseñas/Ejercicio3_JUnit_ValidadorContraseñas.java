/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_junit_validadorcontraseñas;

/**
 *
 * @author Daniel
 */
public class Ejercicio3_JUnit_ValidadorContraseñas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PasswordValidator password1 = new PasswordValidator(" M      ");
        System.out.println(password1.getPassword());
        System.out.println(password1.validarContieneCaracteresEspeciales());
       
        
        
        
        
    }
    
}
