/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Usuario
 */
public class ListaPadre {
    public NodoPadre cabeza;

    public ListaPadre() {
        this.cabeza = null;
    }
    
    public boolean vacio(){
        return this.cabeza == null;
    }
    
    //AGREGAR DATOS A LA LISTA PRINCIPAL
    public void agregarPrincipal(int indicador){
        NodoPadre nuevo = new NodoPadre(indicador);
        if (this.vacio()){
            this.cabeza = nuevo;
        }else{
            NodoPadre auxiliar = cabeza;
            while (true) {                
                if (auxiliar.siguiente == null){
                    auxiliar.siguiente = nuevo;
                    break;
                }else{
                    auxiliar = auxiliar.siguiente;
                }
            }
        }
    }
    
    //AGREGAR DATOS A LA LISTA SECUNDARIA
    public void agregarSecundaria(int indicadorP, int indicadorS){
        NodoPadre auxiliar = cabeza;
        while (auxiliar!=null) {
            if(auxiliar.getIndicador()==indicadorP){
                auxiliar.listado.agregar(indicadorS);
                break;
            }else{
                auxiliar = auxiliar.siguiente;
            }
        }
        if(auxiliar==null){
            System.out.println("No existe este dato: "+ indicadorP);
        }
    }
    
    public void recorrer(){
        NodoPadre auxiliar = cabeza;
        if (auxiliar!=null){
           while (auxiliar!=null) {            
            System.out.println("El dato principal es: "+auxiliar.getIndicador());
            System.out.println(" ----------LISTADO SECUNDARIO ----------------- ");
            auxiliar.listado.recorrer();
            System.out.println("------------------------------------------------");
            auxiliar = auxiliar.siguiente;
            } 
        }else{
            System.out.println("La lista esta vacia");
        }
        
    }
}
