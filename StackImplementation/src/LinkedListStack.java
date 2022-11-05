
public class LinkedListStack<Type> implements Stack<Type> {
	protected Node<Type> top;
	
	public LinkedListStack(Node<Type> top) {
		this.top=null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(Type item) {
		Node<Type> newNode = new Node<>(item, top);
		top = newNode;
	}
	
	public Type pop() {
		if(top == null) 
			return null;
		
		Type retval = top.data;
		top = top.next;
		return retval;

		
	}
	
	public Type top() {
		if(top==null)
			return null;
		return top.data;
	}
	
	public Type show() {
		Node curr = top;
		System.out.println("-->");
		while(curr!=null) {
			System.out.print(curr.data.toString()+"-->");
			curr=curr.next;
		}
		System.out.println("null");
		return null;
	}
}

