
import entidades.Raiz;

import servicios.RaizServicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class Main {

    public static void main(String[] args) {

        RaizServicio rs = new RaizServicio();
        Raiz r1 = rs.CrearRaices();

        rs.calcular(r1);
        
    }
}
