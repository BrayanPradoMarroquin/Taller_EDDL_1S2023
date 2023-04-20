/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Usuario
 */
public class ListaSimple {
    public Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }
    
    public void agregar(int indicador){
        //crear Nodo
        Nodo nuevo = new Nodo(indicador);
        if (cabeza==null) {
            cabeza = nuevo;
        }else{
            Nodo auxiliar = cabeza;
            while (true) {
                // Dato | puntero  ------- puntero -> null (vacio) final de la lista  
                // 8 -> 
                // agregar(10)
                if (auxiliar.siguiente==null){
                    auxiliar.siguiente = nuevo;
                    // 8 -> 10
                    break; //escapar del ciclo while
                }else{
                    auxiliar = auxiliar.siguiente;
                }
            }
        }
    }
    
    //eliminar, buscar
    public void eliminar(int indicador){
        Nodo auxiliar = this.cabeza;
        Nodo auxilar2 = null;
        while (auxiliar!=null) {            
            if (auxiliar==cabeza && auxiliar.getIndicador()==indicador) {
                cabeza = auxiliar.siguiente;
                break;
            }else if(auxiliar.getIndicador()==indicador){
                auxilar2.siguiente = auxiliar.siguiente;
                auxiliar.siguiente = null;
                break;
                // 0 -> 4 -> 2 -> 3 -> 10 ->
                //eliminar(2)
                // 0 -> 4 -> 3 -> 10 ->
                // 2 -> 3 -> 10 ->
                
            }else if(auxiliar.siguiente==null && auxiliar.getIndicador()==indicador){
                auxilar2.siguiente = null;
                break;
                // 0 -> 4 -> 2 -> 3 -> 10 ->
                //eliminar(10)
                // 0 -> 4 -> 3 -> null
                // 0 -> 4 -> 2 -> 3 ->
            }else{
                // auxiliar = 0
                // auxilar2 = 0 && auxiliar = 4
                auxilar2 = auxiliar;
                auxiliar = auxiliar.siguiente;
            }
        }
    }
    
    public void recorrer(){
        Nodo auxiliar = this.cabeza;
        while (auxiliar!=null) {            
            System.out.println("El dato es: " + auxiliar.getIndicador());
            // El dato es: 8
            auxiliar = auxiliar.siguiente;
        }
    }
}
