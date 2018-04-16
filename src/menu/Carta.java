/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.LinkedList;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

public class Carta {
    LinkedList Platos = new LinkedList();

    public Carta() {
        Platos = new LinkedList();       
    }
    
    public void añadir (Plato p) {
        /**
         * Metodo para agregar un plato
         */
        Platos.add(p);
    }

    public String getNombreP(int i) {
        /**
         * Metodo para saber el nombre del plato
         */
        Plato nPlato = (Plato) Platos.get(i);
        return nPlato.getNombre();
    }
    
    public int getSize () {
        /**
         * Metodo para saber el tamaño de la LinkedList Platos
         */
        return Platos.size();
    }
    
}
