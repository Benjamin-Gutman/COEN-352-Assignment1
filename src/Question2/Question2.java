package Question2;

public class Question2{
	
	public static void main(String[] args) {
		LinkedList Test = new LinkedList();
		Test.addToFront(1);
		Test.addToRear(2);
		Test.addToRear(3);
		Test.addToRear(4);
		Test.addToRear(5);
		Test.addToRear(6);
		Test.DeleteRange(2,4);
		System.out.println("Test 1:");
		Test.printList();
		Test.DeleteRange(1,2);
		System.out.println("Test 2:");
		Test.printList();
		
	}
}


class LinkedList{
	Node First;
	Node Rear;
	int Size = 0;
	
	private class Node{
		int Data;
		Node Next;
	}
	
	void addToFront(int newFront) {
		Node temp = new Node();
		temp.Data = newFront;
		temp.Next = First;
		First = temp;
		Size++;
		if (Size == 1) {
			Rear = First;
		}
		
	}
	void addToRear(int newRear) {
		if (Size == 0) {
			Node temp = new Node();
			temp.Data = newRear;
			temp.Next = First;
			First = temp;
			Size++;
			Rear = First;
		}
		else{
			Node temp = new Node();
			temp.Next = null;
			temp.Data = newRear;
			Rear.Next = temp;
			Rear = temp;
			Size++;
		}
	}
	void printList() {
		Node Current = new Node();
		Current = First;
		while (Current != null){
		Node temp = new Node();
		temp = Current.Next;
		System.out.println(Current.Data);
		Current = temp;
		}
	}
	
	void DeleteRange(int start, int end) {
		if (start > end) {
			System.out.println("Boundary Error");
			return;
		}
		if (end > Size) {
			System.out.println("Out of Range Error");
			return;
		}
		
		Node temp = First;
		for (int i = 0; i <start-1; i++) {
			temp = temp.Next;
		}
		Node temp2 = First;
		for (int i = 0; i <=end; i++) {
			temp2 = temp2.Next;
		}
		if(start == 0) {
			First = temp2;
		}
		else {
			temp.Next = temp2;
		}
		
		
	}
}











