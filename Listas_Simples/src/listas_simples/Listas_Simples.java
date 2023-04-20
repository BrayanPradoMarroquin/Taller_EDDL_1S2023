/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas_simples;
import java.util.Scanner;

/**
 *
 * @author Brayan_Prado
 */
public class Listas_Simples {

    /**
     * @param args the command line arguments
     */
    public static void ListaSimple(){
        //INSTANCIA LA LISTA SIMPLE
        ListaSimple lista = new ListaSimple();
        
        //AGREGAN VALORES A LA LISTA
        lista.agregar(0);
        lista.agregar(3);
        lista.agregar(6);
        lista.agregar(4);
        lista.agregar(10);
        
        //RECORRE LA LISTA PARA VALIDAR QUE ESTAN TODOS LOS DATOS
        lista.recorrer();
        System.out.println(" ELIMINANDO DATOS ");
        
        //ELIMINARA EN DATO 6
        lista.eliminar(6);
        
        //RECORRE LA LISTA PARA VERIFICAR QUE SE ELIMINO CORRECTAMENTE
        lista.recorrer();
    }
    
    public static void ListaCircularSimple_(){
        //INSTANCIA DE LA LISTA CIRCULAR SIMPLE
        ListaCircularSimple CirculoSimple = new ListaCircularSimple();
        
        //AGREGA LOS DATOS A LA LISTA
        CirculoSimple.agregar(0);
        CirculoSimple.agregar(4);
        CirculoSimple.agregar(10);
        CirculoSimple.agregar(12);
        CirculoSimple.agregar(30);
        CirculoSimple.agregar(20);
        
        //RECORRER LA LISTA PARA VERIFICAR LOS DATOS CORRECTAMENTE
        CirculoSimple.recorrer();
    }
    
    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("Seleccione el ejemplo que quiere observar: ");
            System.out.println("1. Lista Simple ---------------------");
            System.out.println("2. Lista Circular -------------------");
            System.out.println("3. Lista Doblemente Enlazada --------");
            System.out.println("4. Lista Circular Doblemente Enlazada");
            System.out.println("5. Lista de Listas ------------------");
            System.out.println("6. Salir de la aplicacion");
            Scanner opcion = new Scanner(System.in);
            int op = opcion.nextInt();
            switch (op) {
            case 1:
                ListaSimple();
                break;
            case 2:
                ListaCircularSimple_();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                flag = false;
            default:      
            }
        } while (flag);
    }
    
}
