/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionpruebame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ColeccionPruebame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		List lista1 = new LinkedList();
 

		lista1.add("Prenda");
		lista1.add("Cantidad");
		lista1.add("Precio");
		Iterator iterador = lista1.iterator();
 
		while (iterador.hasNext()) {
			String elemento = (String) iterador.next();
			System.out.print(elemento + " ");
		}
		System.out.println("");
 
		List lista2 = new ArrayList();
 
		lista2.add("Pantalon");
		lista2.add("4");
		lista2.add("14");
                
                lista2.add("\nCamisa");
                lista2.add("3");
                lista2.add("15");
		Iterator iterador2 = lista2.iterator();
 
		while (iterador2.hasNext()) {
			String elemento = (String) iterador2.next();
			System.out.print(elemento + " ");
		}
		System.out.println("");
 

    }
    
}

