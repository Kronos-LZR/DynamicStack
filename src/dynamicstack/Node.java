/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicstack;

/**
 *
 * @author Dev03
 */
public class Node {
    int value;
    Node next;
    
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
    public int getDado() {
        return this.value;
    }
    public void setDado(int value) {
        this.value = value;
    }
    public Node getProx() {
        return next;
    }
    public void setProx(Node next) {
        this.next = next;
    }
    
}
