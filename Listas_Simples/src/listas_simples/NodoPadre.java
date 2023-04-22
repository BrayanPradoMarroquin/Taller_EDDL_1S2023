/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Usuario
 */
public class NodoPadre {
    private int indicador;
    public NodoPadre siguiente;
    //LISTA HIJA -> LISTA ANIDADA -> LISTA SECUNDARIA
    public ListaSimple listado;

    public NodoPadre(int indicador) {
        this.indicador = indicador;
        this.siguiente = null;
        this.listado = new ListaSimple();
    }

    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }
    
    
}
