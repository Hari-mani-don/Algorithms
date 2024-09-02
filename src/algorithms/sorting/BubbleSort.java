package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
	/**
	 * arr=[2,5.4,22,1,0] i=n, j=n-1,
	 */
	public static void main(String[] args) {
		int[] array = { 2,1,0};

		for (int i = 0; i < array.length; i++) {
			int swap = 0;
			int k = 0;
			for (int j = k + 1; j < array.length; j++) {
				if (array[k] > array[j]) {
					int temp = array[k];
					array[k] = array[j];
					array[j] = temp;
					swap++;
				}
				k++;

			}
			System.out.println("gdgd");
			if (swap <= 0) {
				break;
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
