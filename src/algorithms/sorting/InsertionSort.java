package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 24234, 23423, 2423424, 9, -1, 121, 12312, 756, 98, -0 };
		for (int i = 0; i < array.length - 1; i++) {
			int k = i + 1;
			int key = array[i + 1];
			int j = i;
			while (j >= 0 && key < array[j]) {
				array[k] = array[j];
				j--;
				k--;
			}
			array[k] = key;
		}
		System.out.println(Arrays.toString(array));
	}

}
