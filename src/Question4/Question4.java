package Question4;

public class Question4{
	public static void main(String[] args) {
		josephusQueue Test = new josephusQueue();
		Test.createList(7);
		Test.printOrderOfElimination(2);
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
				Last = temp;
			}
			Last.Next = temp;
			Last = temp;
		}
	}
	
	void printOrderOfElimination(int m) {
		while (First != Last) {
			for (int i = 0; i<m-1;i++) {
				Last.Next = First;
				First = First.Next;
				Last = Last.Next;
				Last.Next = null;
			}
			System.out.println(First.Data);
			if (First.Next != null) {
				First = First.Next;
			}
		}
		System.out.println(First.Data);
		
		
	}
}