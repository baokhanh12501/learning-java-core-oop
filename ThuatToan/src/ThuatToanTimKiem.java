import java.util.Scanner;

public class ThuatToanTimKiem {
	public static int thuatToanTimKiem(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 6, 99, 63, 2, 4, 1, 55, 8, 6, 7, 3 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Key: ");
		int key = sc.nextInt();
		
		int result =thuatToanTimKiem(arr, key);
		
		if(result != -1) {
			System.out.println("Phan tu "+key+ " duoc tim thay tai vi tri thu "+result);
		}

	}
}