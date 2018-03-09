
package dynamicstack;

public interface IStack {
        void push(int value);
	int pop();
	int peek();
	boolean voidStack();
	boolean fullStack();
        int size();
}
