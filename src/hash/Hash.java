/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;



/**
 *
 * @author ubuntu
 */
public class Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hashtable tablaHash = new Hashtable(18);
       int nprimo=tablaHash.siguientePrimo(20);//prueba de numero primo 
        //Se insertan elementos en la tabla hash
        tablaHash.insertar(2);
        tablaHash.mostrarTablaHash();
        tablaHash.insertar(8);
        tablaHash.insertar(3);
        tablaHash.mostrarTablaHash();
        tablaHash.insertar(11);
        tablaHash.insertar(46);
        tablaHash.mostrarTablaHash();
        tablaHash.insertar(18);
        tablaHash.insertar(6);
        tablaHash.mostrarTablaHash();
        tablaHash.insertar(34);
        tablaHash.insertar(26);
        tablaHash.mostrarTablaHash();
        tablaHash.insertar(16);
        tablaHash.insertar(42);
        tablaHash.mostrarTablaHash();
        tablaHash.insertar(30);
        tablaHash.mostrarTablaHash();
            
      
  
    }
}


    
    

