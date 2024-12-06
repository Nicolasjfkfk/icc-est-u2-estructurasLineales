package Materia.Models;

public class Node {
   private  int value; //VALOR NODO
    private Node next; // REFERENCIA AL SIGUIENTE NODO

    public Node (int value){
        this.value = value; 
        this.next = null; 
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
     
}
