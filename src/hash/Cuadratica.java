/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;
/*import NodoHash.*/

/**
 *
 * @author godoy
 */
public class Cuadratica {
   
 
    // Función para imprimir una matriz
  static void imprimir(int arr[])
    { // Iterando e imprimiendo la matriz
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n"+ i + (i < 11 ? " " : " ")+"|__| -> "+arr[i]+"\n");
        }
        
    }
    // Función para implementar el prueba cuadrático
 static void hashing(int table[], int tsize,
                        int arr[], int N)
    {// Iterando a través de la matriz
        for (int i = 0; i < N; i++) { // Cálculo del valor hash
            int hv = arr[i] % tsize;
            // Insertar en la tabla si hay
            // no hay colisión
            if (table[hv] == -1)
                table[hv] = arr[i];
            else {// Si hay una colisión
                // posibles valores cuadráticos
                for (int j = 0; j < tsize; j++) {
                    int t = (hv + j * j) % tsize;     //Cálculo del nuevo valor hash
                    if (table[t] == -1) {             // insertando el valor en la tabla
                        table[t] = arr[i];   
                        break;
                    }
                }
            }
        }
        imprimir(table);
    }
    
    public static void main(String args[])
    {
        int arr[] = { 50, 700, 76, 85, 92, 73, 101, 45, 5, 65, 18};
        int N = 11; //tamaño de la lista
 
        int L = 20;
        int hash_table[] = new int[L];  //Tamaño tabla hash
 
        for (int i = 0; i < L; i++) {  //Inicializando la tabla hash
           hash_table[i] =-1; // el -1 = null
        }
 
        hashing(hash_table, L, arr, N);  //Prueba Cuadratica
    }
}
