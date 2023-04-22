/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Brayan_Prado
 */
public class ListaDoble{
    public NodoDoble cabeza;
    public NodoDoble cola;

    public ListaDoble(NodoDoble cabeza, NodoDoble cola) {
        this.cabeza = cabeza;
        this.cola = cola;
    }
    
    //VALIDA SI LA LISTA SE ENCUENTRA VACIA
    public boolean vacio(){
        if (this.cabeza==null && this.cola==null){
            return true;
        }
        return false;
    }
    
    
}
