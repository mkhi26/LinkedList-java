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
public class LinkedList {
    private Node first;

    public LinkedList() {
        this.first = null;
    }

    /**
     * @author mkhi26
     * @param value: valor a agregar dentro de la lista.
     * @description: por defecto se agregara al final de la lista.
     * @return retorna true si se agrega a la lista, de lo contrario retorna false.
     */
    public boolean push(Object value){
        
        return push(value, lenght());
    }
    
    /**
     * @author: mkhi26
     * @param value: Valor que se agregara a la lista enlazada.
     * @param pos: Posición en la que se agregara dentro de la lista, si la
     * posición no existe se agregara como el ultimo elemento de la lista.
     * @return : Retorna un boleano.
     */
    public boolean push(Object value,int pos){
        if (this.first == null){
            this.first = new Node(value);
            return true;
        }
        Node current = this.first;
        
        if(pos == 0){
            this.first = new Node(value);
            this.first.next = current;
            return true;            
        }
        int count = 1;
        Node previous = this.first;
        current = current.next;
        while(current != null){
            if(count == pos){
                previous.next = new Node(value);
                previous.next.next = current;
                return true;
            }
            count ++;
            previous = current;
            current = current.next;
        }
        previous.next = new Node(value);
        return true;
    }
    /**
     * @author mkhi26
     * @param pos: posición del elemento a sacar de la lista.
     * @return retorna el elemento a sacar segun coincida con la posición en la
     * lista, retorna false en caso que el elemento no se encuentre.
     */
    public Object pop(int pos){
        if(this.first == null){
            return false;
        }
        Node current = this.first;
        if(pos == 0){
            this.first = this.first.next;
            return current.value;
        }
        int count = 1;
        Node previous = this.first;
        current = current.next;
        while(current != null){
            if(count == pos){
                previous.next = previous.next.next;
                return current.value;
            }
            count ++;
            previous = current;
            current = current.next;
        }  
        return false;
    }
    
    /**
     * @author mkhi26
     * @param value: Dato que se quiere comprobar su existencia dentro de la
     * lista.
     * @return retorna true si el valor se encuentra, false en caso contrario.
     */
    public boolean isElement(Object value){
        if(this.first == null){
            return false;
        }
        Node current = this.first;
        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     * @author mkhi26
     * @param index: posición del elemento a obtener dentro de la lista.
     * @return retorna el elemento encontrado, en caso contrario retornara false.
     */
    public Object getElementFromIndex(int index){
        if(this.first == null){
            return false;
        }
        Node current = this.first;
        int count = 0;
        while(current != null){
            if(count == index){
                return current.value;
            }
            count ++;
            current = current.next;
        }
        return false;
    }
   
    /**
     * @author mkhi26
     * @param value Elemento en la lista enlazada que se quiere conocer su posición.
     * @return retorna la posición en la lista del elemento, si no se encuentra 
     * retrna -1
     */
    public int getIndexOfElement(Object value){
        if(this.first == null){
            return -1;
        }
        int count = 0;
        Node current = this.first;
        while(current != null){
            if(current.value == value){
                return count;
            }
            current = current.next;
            count ++;
        }
        return -1;
        
    }
    
    
    /**
     * @author mkhi26
     * @param pos: posición del elemento a remplazar dentro de la lista enlazada.
     * @param value: Valor que sustituira al elemento encontrado.
     * @return retorna true en si se remplaza el elemento, false de lo contrario.
     */
    public boolean replace(int pos, Object value){
        if(this.first == null){
            return false;
        }
        int count = 0;
        Node current = this.first;
        while(current != null){
            if(count == pos){
                current.value = value;
                return true;
            }
            count ++;
            current = current.next;
        }
        return false;
    }
    
    /**
     * @author mkhi26
     * @return retorna un entero con el tamaño de la lista enlazada.
     */
    public int lenght(){

        Node current = this.first;
        int count = 0;
        while(current != null){
            count ++;
            current = current.next;
        }
        return count;
    }
    
    /**
     * @author mkhi26
     * @return retorna una cadena de texto con el contenido de la lista enlazada.
     */
    public String printableText(){
        Node current = this.first;
        if(current == null){
            return "null";
        }
        String txt = "";
        while(current != null){
            txt += current.value;
            txt += "->";
            current = current.next;
        }
        txt += "null";
        return txt;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    
    
}
