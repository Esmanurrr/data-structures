
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> myStack = new LinkedListStack<Character>();
		String str ="abc{defg{ijk}{1{mn}}op}qr";
		
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i)=='{') {
				myStack.push(str.charAt(i));
				myStack.show();
				
			}else if(str.charAt(i)=='}') {
				myStack.pop();
				myStack.show();
			}
		}
		
		if(myStack.top()==null) {
			System.out.println("there are correct number of bracles");
		}else {
			System.out.println("there are not correct number of bracles");

		}
	}

}
