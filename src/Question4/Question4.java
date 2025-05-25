package Question4;

public class Question4{
	public static void main(String[] args) {
		
	}
}

class josephusQueue{
	Node First;
	Node Last;
	
	class Node{
		int Data;
		Node Next;
	}
	
	void createList(int n) {
		for (int i = 0; i<n; i++) {
			Node temp = new Node();
			temp.Data = i;
			temp.Next = null;
			if (i == 0) {
				First = temp;
			}
			Last = temp;
		}
	}
	
	void printOrderOfElimination(int m) {
		
	}
}