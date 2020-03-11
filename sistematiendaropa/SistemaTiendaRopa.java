/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematiendaropa;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class SistemaTiendaRopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Excepciones Verificadas (IOException)
            //Lectura de un archivo de texto (.txt)
        BufferedReader bf = new BufferedReader(new FileReader("c:\\Ropa\\Prenda.txt"));
        String linea;
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }
    }    
}
