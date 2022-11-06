
public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> myStack = new LinkedListStack<Character>();
		String str = "abc$cba";
		boolean flag = false;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!= '$'&& flag == false) {
				myStack.push(str.charAt(i));
				myStack.show();
			}
			else if(str.charAt(i) == '$') flag = true;
			else if(flag == true) {
				if(!myStack.isEmpty() && myStack.top() == str.charAt(i)) {
					myStack.pop();
					myStack.show();
				}
			}
		}
		
		if(myStack.top()==null) {
			System.out.println("Your string is in the language");
		}else {
			System.out.println("Your string is not in the language");
		}
		
	}

}
