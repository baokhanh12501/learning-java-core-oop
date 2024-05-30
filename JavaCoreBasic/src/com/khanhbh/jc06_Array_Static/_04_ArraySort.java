package com.khanhbh.jc06_Array_Static;

public class _04_ArraySort {
	public static void main(String[] args) {
		// 1. Input data
		double[] list = inputDataInArray();
		displayArray(list);
		// 2. Sắp xếp
		SelectionSort(list);
		// 3. hiển thị
		System.out.println("======");
		displayArray(list);

	}

	private static double[] inputDataInArray() {
		double[] resultData = new double[100];
		for (int i = 0; i < resultData.length; i++) {
			resultData[i] = Math.round(Math.random() * 10000);

		}
		return resultData;
	}

	public static void displayArray(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Phần tử thứ " + (i + 1) + " là " + numbers[i]);
		}

	}

	// 2 , 1 , 4 ,5 ;
	public static void SelectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			double minValue = list[i];
			int index = i;
			for (int j = i + 1; j < list.length; j++) {
				if (minValue > list[j]) {
					minValue = list[j];
					index = j;
				}
			}
			// Hoán vị
			if (index != i) {
				list[index] = list[i];
				list[i] = minValue;
			}
		}
	}

}
