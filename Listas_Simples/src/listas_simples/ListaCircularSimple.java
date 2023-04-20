/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Usuario
 */
public class ListaCircularSimple extends ListaSimple{

    public Nodo cola;
    
    public ListaCircularSimple() {
        this.cabeza = null;
        this.cola = null;
    }
    
    @Override
    public void agregar(int indicador){
        Nodo nuevo = new Nodo(indicador);
        if (cabeza==null){
            cabeza = nuevo;
            cola = nuevo;
            cabeza.siguiente = cola;
            cola.siguiente = cabeza;
        }else{
            Nodo auxiliar = cabeza;
            while (true) {                
                if(auxiliar.siguiente==cola){
                    auxiliar.siguiente = nuevo;
                    nuevo.siguiente = cola;
                    break;
                }
            }
        }
    }
}
