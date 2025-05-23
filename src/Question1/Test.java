package Question1;
import java.util.Scanner;

class Stack{
	private Node First = null;
	
	private class Node{
		String Item;
		Node Next;
	}
	
	protected void push(String newString) {
		Node newTop = new Node();
		newTop.Item = newString;
		newTop.Next = First;
		First = newTop;
	};
	protected String pop() {
		String returnString = First.Item;
		First = First.Next;
		return returnString;
	};
	protected String popAll() {
		String returnString = "";
		while(First != null) {
			returnString = First.Item + " " + returnString;
			First = First.Next;
		}
		return returnString;
		
	};
	
	
	
}

public class Test{
	public static void main(String arg[]) {
		Stack stack = new Stack();
		System.out.println("Enter Equation Here: ");
		Scanner input = new Scanner(System.in);
		String equation = input.nextLine();
		for(int i = 0; i < equation.length(); i++) {
			if (equation.charAt(i) == ' ') {
				continue;
			}
			if(equation.charAt(i) == ')') {
				String right = stack.pop();
				String op = stack.pop();
				String left = stack.pop();
				stack.push("(" + " " + left + " " + op  + " "+ right + " " + ")");
			}
			else {
				stack.push(String.valueOf(equation.charAt(i)));
			}
		}
		System.out.println(stack.popAll());
		
	}
}

