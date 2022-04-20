/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author ubuntu
 */
public class Hashtable {
     private NodoHash[] tabla;
    private int cantidad;
     public Hashtable(int tableSize) {
        tabla = new NodoHash[siguientePrimo(tableSize)];
        cantidad = 0;
    }
     /*1,2,3,5,7,....................*/
private int funcionHash(Integer x) {
        int valorHash = x % tabla.length;

        if (valorHash < 0) {///
            valorHash += tabla.length;//-4+21= 17
        }

        return valorHash;
    }
    
    
    //Genera el siguiente numero primo dado un numero recibido
    public int siguientePrimo(int n) {
        if (n % 2 == 0) {
            n++;
        }

        int i=n;
        for ( i=n; !esPrimo(i); i += 2);

        return i;
    }

    // Verifica que el numero recibido es primo
    private boolean esPrimo(int n) {
        if (n == 2 || n == 3) {
            return true;
        }

        if (n == 1 || n % 2 == 0) {
            return false;
        }

        

        return esprimo2(n);
                }
    
  public static boolean esprimo2(int numero){
  if(numero==0|| numero==1||numero==4)
      return false;
  
  for(int x=2; x<numero/2; x++)
      if(numero%x==0)
          return false;
  return true;
  }
    
    // Inserta un elemento
    public void insertar(int val) {
        int pos = funcionHash(val);
        NodoHash temp = new NodoHash(val); //crea el nodo pero no lo inserta
        if (tabla[pos] == null) {
            tabla[pos] = temp;  //aqui realiza la insecion si esta vacio
        } else {/*aqui se pone el codigo para la colision*/
            // la colision   por lista 
            temp.siguiente = tabla[pos];  //toma el valor que esta en la lista y se lo asigna al siguiente x->|y|
            tabla[pos] = temp;// y aqui realiza el reemplazo  |x|->y
        }
        cantidad++;
    }
    
      public void mostrarTablaHash() {
        System.out.println();

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("\t"+ i + (i < 10 ? " " : "") +"|__| -> ");
            NodoHash start = tabla[i];
            

            // esta es la parte por si tiene lista
            while (start != null) {
                System.out.print(start.data);
                if(start.siguiente == null) {
                    System.out.print(" -> NULL");
                }else {
                    System.out.print(" -> ");
                }
                
                start = start.siguiente;
            }

            System.out.println();
        }
    }
    
        //Devuelve verdadero si existe el elemento en la tabla hash
    public boolean buscar(int valor) {
        int pos = funcionHash(valor); //obtenemos primero la llave para ver si se encuentra en el vector primero
        NodoHash temp = tabla[pos];// se obtiene el nodo del vector 

        //Se revisa si existen mas objetos en la lista enlazada
        while (temp != null) {                  //en el mejor de los casos es el primer nodo, si no se va a ver si tiene algo en la lista
            if(temp.data == valor) {        //validamos
                return true;
            }
            temp = temp.siguiente;
        }
        
        return false;       //nunca existio
    } 
 

  }
