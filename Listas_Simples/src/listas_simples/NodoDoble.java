/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Brayan_Prado
 */
public class NodoDoble extends Nodo{
    private NodoDoble anterior;

    public NodoDoble(int indicador) {
        super(indicador);
        this.anterior = null;
    }
}
