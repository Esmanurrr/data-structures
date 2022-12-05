
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> myStack = new LinkedListStack<Character>();
		String infix = "(3+4)*7";
		String postfix = new String();
		
		for(int i= 0; i <infix.length(); i++) {
			char ch = infix.charAt(i);
			switch(ch) {
			case '(': 
				myStack.push(ch);
				myStack.show();
				break;
			case ')': //we should to add postfix the each char that in stack
				while(infix.charAt(i) != '(') {
					postfix = postfix + (myStack.top());
					myStack.pop();
					myStack.show();
				}
				myStack.pop();
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				myStack.push(ch);
				myStack.show();
				break;
			
			default ://to add numbers in postfix 
				postfix = postfix + ch;
				break;
			}
		}
		while(!myStack.isEmpty()) {
			postfix = postfix+(myStack.top());
			myStack.pop();
			
		}
		System.out.println(postfix);
		
		
	}

}
