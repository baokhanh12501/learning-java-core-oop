
public class BubbleSort {
	public static void bubbleSort(int [] arr) {
		int n = arr.length-1;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {96,3,25,6,88,4,96,2,1,88,63,4};
		bubbleSort(arr);
		System.out.print("Mang sau sap xep: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
