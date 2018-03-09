
package dynamicstack;

public class Stack implements IStack{
    
    //private int index = 0;
    public Node top;
    public int qtt ;
    
    public Stack(){
        this.top = null;
        this.qtt = 0;
    }
    
    @Override
    public void push(int value) {
        Node newNode = new Node(value,new Node());
        
        if(this.isEmpty()){
            this.top = newNode;
            this.qtt++;
        }
        else{
            newNode.next = this.top;
            this.top = newNode;
            this.qtt++;
        }
    }

    @Override
    public int pop() {
        int ret = -1;
        if(this.isEmpty()){
            return -1;
        }
        else{
            ret = this.top.value;
            this.top = this.top.next;
            this.qtt--;
        }
        return ret;
    }

    @Override
    public int peek() {
        try{
            return this.top.value;
        }
        catch(Exception ex){
            return -1;
        }
        
    }

    @Override
    public boolean voidStack() {
        if(isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean fullStack() {
        if(isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public int size() {
        return this.qtt;
    }
    
    private boolean isEmpty(){
        return this.qtt == 0;
    }
    
}
