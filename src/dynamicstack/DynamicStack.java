package dynamicstack;

public class DynamicStack {

    public static void main(String[] args) {
        // TODO code application logic here
        IStack stack1 = new Stack();
        
        stack1.push(3);                
        System.out.println(stack1.peek());
        
        stack1.push(2);
        System.out.println(stack1.peek());
        
        stack1.push(6);
        System.out.println(stack1.peek());
        
    }
    
}
