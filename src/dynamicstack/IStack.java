
package dynamicstack;

public interface IStack {
        void push(Node value);
	Node pop();
	Node peek();
	boolean voidStack();
	boolean fullStack();
        int size();
}
