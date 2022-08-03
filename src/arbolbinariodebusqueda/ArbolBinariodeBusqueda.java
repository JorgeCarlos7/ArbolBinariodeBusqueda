/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinariodebusqueda;


import java.util.Optional;

public class ArbolBinariodeBusqueda {

   
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.add(5);
        root.add(15);
        root.add(8);
 
        Optional<Node> result = root.find(11);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Valor no encontrado");
        }
 
        result = root.find(8);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println("Imprimir en  Inorden");
        root.printInOrder();
        System.out.println("Imprimir en Postorden");
        root.printPosOrder();
        System.out.println("Imprimir en Preorden");
        root.printPreOrder();


    }
    
    
}
