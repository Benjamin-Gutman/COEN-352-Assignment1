package Question3;



public class Question3{
	
	public int max(Node first) {
		int max = 0;
		while(first != null) {
			if (first.Data > max) {
				max = first.Data;
			}
			first = first.Next;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		LinkedList linked = new LinkedList();
		Question3 testMax = new Question3();
		linked.addToRear(23);
		linked.addToRear(26);
		linked.addToRear(2);
		linked.addToRear(56);
		linked.addToRear(2113);
		linked.addToRear(3);
		int max = testMax.max(linked.First);
		System.out.println(max);

	}
}

class LinkedList{
	Node First;
	Node Rear;
	int Size = 0;
	
	
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
		for (int i = 1; i <start-1; i++) {
			temp = temp.Next;
		}
		Node temp2 = First;
		for (int i = 1; i <=end; i++) {
			temp2 = temp2.Next;
		}
		if(start == 1) {
			First = temp2;
		}
		else {
			temp.Next = temp2;
		}
		
		
	}
}

class Node{
	int Data;
	Node Next;
}