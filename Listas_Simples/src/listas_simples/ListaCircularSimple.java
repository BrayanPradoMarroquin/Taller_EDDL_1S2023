/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Brayan_Prado
 */
public class ListaCircularSimple extends ListaSimple{
    public Nodo cabeza;
    public Nodo cola;
    
    public ListaCircularSimple() {
        this.cabeza = null;
    }
    
    @Override
    public void agregar(int indicador){
        Nodo nuevo = new Nodo(indicador);
        if (cabeza==null){
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        }else{
            Nodo auxiliar = this.cabeza;
            while (auxiliar.siguiente != cabeza) {                
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente = nuevo;
            nuevo.siguiente = this.cabeza;
        }
    }
    
    @Override
    public void recorrer(){
        Nodo auxiliar = this.cabeza;
        if (auxiliar!=null) {
            do {            
                System.out.println("El dato es: " + auxiliar.getIndicador());
                auxiliar = auxiliar.siguiente;
            } while (auxiliar.siguiente!=cabeza);
        }
    }
    
    
}
