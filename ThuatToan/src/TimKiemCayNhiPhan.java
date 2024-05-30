import java.util.Iterator;

public class TimKiemCayNhiPhan {
	public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
        	System.out.println(right);
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid; // Trả về vị trí của phần tử nếu tìm thấy
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72 };
//        for (int i = 0; i < arr.length; i++) {
//        	
//		}
        
        
        int key = 23;
        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Phần tử " + key + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy phần tử " + key);
        }
    }
}
