package Question5;

public class Question5{
	public static void main(String[] args) {
		int[] arr = {1,2,9,10,6,3,2};
		Question5 asdf = new Question5();
		boolean found = asdf.BitonicSearch(arr, 9);
		System.out.println(found);
	}
	
	public boolean BitonicSearch(int[] arr, int key) {
		//Find the peak number using a type of binary search
		int bottom = 0;
		int top = arr.length-1;
		int mid = (bottom+top)/2;
		while (bottom < top) {
			
			if (arr[mid] > arr[mid+1]) {
				top = mid;
			} else {
				bottom = mid+1;
			}
			mid = (bottom+top)/2;
		}
		int peak = mid;
		top = mid;
		bottom = 0;
		mid = (bottom+top)/2;
		while (bottom< top) {
			if (arr[mid] >= key) {
				top = mid;
			}
			else {
				bottom = mid+1;
			}
			mid = (bottom+top)/2;
		}
		
		if (arr[mid] == key) {
			return true;
		}
		
		top = arr.length-1;
		bottom = peak;
		mid = (bottom+top)/2;
		while (bottom< top) {
			if (arr[mid] <= key) {
				top = mid;
			}
			else {
				bottom = mid+1;
			}
			mid = (bottom+top)/2;
		}
		if (arr[mid] == key) {
			return true;
		}
		else {
			return false;
		}
	}
}
