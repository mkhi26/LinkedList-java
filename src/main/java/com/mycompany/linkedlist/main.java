/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkedlist;

/**
 *
 * @author mkhi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList l = new LinkedList();
        l.push(40, 0);
        l.push(18, 1);
        l.push(26, 2);
        l.push(31, 3);
        l.push(12, 4);
        l.push(25, 5);
        l.push("Hola",6);
        System.out.println(l.printableText());
        //System.out.println("Se eliminan: "+ l.pop(2));
        System.out.println("Se busca: "+ l.isElement("Hola"));
        l.push("Perro");
        l.push("Gato");
        l.push("conejo");
        l.push("Pato");
        System.out.println(l.printableText());
      
        
    }
    
}
