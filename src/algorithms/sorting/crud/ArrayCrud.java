package algorithms.sorting.crud;

import java.util.Arrays;

public class ArrayCrud {
	public static void main(String[] args) {
		// create
		int[] array = { 9, 2, 3, 5, 6, 2, 0 };
		// replace(array, 3, 5);
		read(array);
		array = add(array, 2, 0);
		read(array);
//		System.out.println(array.length);
		array = add(array, 2, 0);
		read(array);
		array = add(array, 2, 0);
		read(array);
		array = add(array, 2, 0);
		read(array);
		array = add(array, 2, 0);
		read(array);
		array = add(array, 2, 0);
		read(array);

		//array = delete(array, 0);
		array = deleteAll(array, 0);
		read(array);
	}

	public static int[] add(int[] array, int index, int value) {
		if (!(index - 1 < array.length)) {
			return array;
		}
		int newArray[] = new int[array.length + 1];
		int j = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (i == index - 1) {
				newArray[index - 1] = value;
			} else {
				newArray[i] = array[j];
				j++;
			}
		}
		return newArray;
	}

	public static int[] replace(int[] array, int index, int value) {
		array[index - 1] = value;
		return array;
	}

	public static int[] update(int[] arrays, int target, int value) {

		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] == target) {
				arrays[i] = value;
			}
		}
		return arrays;
	}

	public static int[] deleteAll(int[] array, int target) {

		int increment = 0;
		int count = 0;
		while (increment < array.length) {
			if (array[increment] == target)
				count++;
			increment++;
		}
		int[] newArray = new int[array.length - count];
		increment = 0;

		for (int i = 0; i < array.length; i++) {
			if (!(array[i] == target)) {
				newArray[increment] = array[i];
				increment++;
			}

		}
		return newArray;
	}

	public static int[] delete(int[] array, int index) {

		for (int i = index - 1; i < array.length - 1; i++) {
			if (i >= 0 && i < array.length - 1) {
				array[i] = array[i + 1];
			}
		}

		return array;
	}

	public static void read(int[] arrays) {
		System.out.println(Arrays.toString(arrays));
	}
}
