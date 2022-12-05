
public class LinkedListStack<Type> implements Stack<Type> {
	protected Node<Type> top;
	
	public LinkedListStack() {//consturaction
		this.top=null;
	}
	
	public boolean isEmpty() {//at first stack is empty
		return top == null;
	}
	
	public void push(Type item) {//add node
		Node<Type> newNode = new Node<>(item, top);
		top = newNode;
	}
	
	public Type pop() {//delete node
		if(top == null) 
			return null;
		
		Type retval = top.data;
		top = top.next;
		return retval;

		
	}
	
	public Type top() {//update top
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

