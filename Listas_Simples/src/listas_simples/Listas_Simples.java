/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas_simples;

/**
 *
 * @author Usuario
 */
public class Listas_Simples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancia de Lista
        ListaSimple lista = new ListaSimple();
        lista.agregar(0);
        lista.agregar(3);
        lista.agregar(6);
        lista.agregar(4);
        lista.agregar(10);
        lista.recorrer();
        System.out.println(" ---------------------------- ");
        lista.eliminar(6);
        lista.recorrer();
    }
    
}
