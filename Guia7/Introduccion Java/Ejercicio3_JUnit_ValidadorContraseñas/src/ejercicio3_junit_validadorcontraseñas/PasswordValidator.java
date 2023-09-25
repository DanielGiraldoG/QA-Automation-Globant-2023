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
public class PasswordValidator {

    private String password;
    private int lenghtMin;
    private int lenghtMax;
  

    public PasswordValidator() {
    }

    public PasswordValidator(String password) {
        this.password = password;
        this.lenghtMin = 4;
        this.lenghtMax = 12;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLenghtMin() {
        return lenghtMin;
    }

    public void setLenghtMin(int lenghtMin) {
        this.lenghtMin = lenghtMin;
    }

    public int getLenghtMax() {
        return lenghtMax;
    }

    public void setLenghtMax(int lenghtMax) {
        this.lenghtMax = lenghtMax;
    }

    
    
    public boolean validarLongitudMinima() {
        return password.length() >= lenghtMin;
    }

    public boolean validarLongitudMaxima() {
        return password.length() <= lenghtMax;
    }
    
    public boolean validarMayusculas(){
        String contraAux = password.toLowerCase();
        
        return !password.equals(contraAux);
        
    }
    
    public boolean validarContieneCaracteresEspeciales(){
        
       return password.matches(".*[^a-zA-Z0-9].*");
       
        
        
    }
    
    public boolean validarContraseña(){
        boolean isValida = validarLongitudMinima() && validarLongitudMaxima() &&
        validarMayusculas() && validarContieneCaracteresEspeciales();
        
        return isValida;
        
    }
    
    
    
    
    

}
