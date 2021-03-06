
package dynamicstack;

public class Node {
    int value;
    Node next;
    
    public Node(){}
    
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
    
    public void display(){
        System.out.println(value);
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
