/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author ubuntu
 */
public class NodoHash {
     
    NodoHash siguiente;
    int data;

    /* Constructor */
    public NodoHash(int x) {
        data = x;
        siguiente = null;
    }
}
