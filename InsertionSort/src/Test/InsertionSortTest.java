package Test;

public class InsertionSortTest {
	
	static int[] arr = {500,64,78,12,100,34,1};
	
	public static void InsertionSort(int n) {
		
		if(n == arr.length) {
			return;
		}
		
		swap(n);
		
		InsertionSort(n+1);
	}
	
	public static void swap(int j) {
		
		if(j == 0) {
			return;
		}
		
		if(arr[j-1] > arr[j]) {
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
		}
		
		
		swap(j-1);
	}
	
	
	
	 public static void main(String[] args) {
		 InsertionSort(1);
		 
		 for(int sortedarr : arr) {
			 System.out.print(sortedarr + " ");
		 }
	 }
	

}



//public static void InsertionSort() {
//for (int i = 1; i < arr.length; i++) {
//	for(int j = i; j > 0 ; j--) {
//		if(arr[j-1] > arr[j]) {
//			swap(j, j-1);
//		}
//	}
//}
//}
