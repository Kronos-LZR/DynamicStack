
package dynamicstack;

public class Stack implements IStack{
    
    private int index = 0;
    private Node stack;
    
    @Override
    public void push(Node value) {
        this.stack = value;
    }

    @Override
    public Node pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Node peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean voidStack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean fullStack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
