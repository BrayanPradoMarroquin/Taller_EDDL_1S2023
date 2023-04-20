/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int indicador; //Información que se va a almacenar en la lista
    public Nodo siguiente; //Puntero 

    public Nodo(int indicador) {
        this.indicador = indicador;
        this.siguiente = null;
    }

    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }
    
    
}
