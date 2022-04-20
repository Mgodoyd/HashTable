/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;

class Data{
    private int data; 
    public Data(int data){
        this.data=data;
    }
    
    public int getKey(){
        return data;
    }
}

public class alternativa_clave_dependiente {
  private Data[] hashArray;
  private int size;
  public alternativa_clave_dependiente(int size){
      this.size=size;
      hashArray= new Data[size];
  }
  
  public void imprimir(){
      System.out.println("Tabla :");  //muestra la tabla
      for(int j=0;j<size; j++){
          if(hashArray[j]!=null){
              System.out.println("|"+j+" -> "+"\t | "+hashArray[j].getKey()+" | ");
          }else{
              System.out.println(" | "+j+"\t | -- |");
          }
      }System.out.println("");
  
  }
  public int hashFunc(int key){
      return key % size;
  }
  public int hashFunc2(int key){
      return 5-(key%5);
  }
  public void insert(int data){
      Data item = new Data(data);
      int key =item.getKey();      //inserta dato
      int hashVal2=hashFunc2(key);
      int hashVal=hashFunc(key);
      while(hashArray[hashVal]!= null){
          hashVal+=hashVal2;
          hashVal %= size;
      }
      hashArray[hashVal]= item;
      
  }
  public Data delete(int key){
    int hashVal= hashFunc(key);  
    int hashVal2= hashFunc(key);      //borra dato
    while(hashArray[hashVal]!= null){
        if(hashArray[hashVal].getKey() == key){
            Data temp = hashArray[hashVal];
            hashArray[hashVal] = null;
            return temp;
        }
        hashVal += hashVal2;
        hashVal %= size;
    }
 
    return null;
  }
  public Data busqueda(int key){
      int hashVal = hashFunc(key);
      int hashVal2= hashFunc2(key);   //busca dato
      while(hashArray[hashVal]!= null){
          if(hashArray[hashVal].getKey() == key){
              System.out.println("Encontrado: "+ hashArray[hashVal].getKey());
              return hashArray[hashVal];
          }
          hashVal += hashVal2;
          hashVal %= size;
      }
      
      return null;
  }
  
    public static void main(String[] args) {
     alternativa_clave_dependiente tabla = new alternativa_clave_dependiente (20);
     System.out.println("Insertando...");
     tabla.insert(25);
     tabla.imprimir();
     tabla.insert(35);
     tabla.imprimir();
     tabla.insert(56);
     tabla.imprimir();
     tabla.insert(86);
     tabla.imprimir();
     tabla.insert(2);
     tabla.imprimir();
     tabla.insert(45);
     tabla.imprimir();
     
     System.out.println("Eliminado...");
     tabla.delete(2);
     tabla.imprimir();
     
     System.out.println("Buscando...");
     tabla.busqueda(35);
     
     
    }         
}
