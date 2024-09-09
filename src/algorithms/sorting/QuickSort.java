package algorithms.sorting;
import java.util.Arrays;
import java.util.Arrays;
public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 29, 10, 14, 37, 13, 1, 5, 23, 30, 18, 36, 31, 32, 11, 27 };
		array = quickSort(array, 0, array.length);
		System.out.println(Arrays.toString(array));

	}
	public static int[] quickSort(int[] array, int low, int high) {
		int i = low - 1;
		int pivot = array[high - 1];
		int j = high;
		while (i < j) {
			do {
				i++;
			} while (i < j && array[i] < pivot);
			do {
				j--;

			} while (j > i && array[i] < pivot);

			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		if (i > j) {
			int temp = pivot;
			array[high - 1] = array[j];
			array[j] = temp;
		}
		quickSort(array, 0, j);
		quickSort(array, j + 1, array.length);
		return array;
	}

//    private static void quickSort(int[] array, int low, int high) {
//        if (low < high) {
//            // Using median-of-three to choose the pivot
//            int pivotIndex = medianOfThree(array, low, high);
//            int pivotValue = array[pivotIndex];
//
//            // Partition the array
//            int partitionIndex = partition(array, low, high, pivotValue);
//
//            // Recursively sort the two halves
//            quickSort(array, low, partitionIndex - 1);
//            quickSort(array, partitionIndex + 1, high);
//        }
//    }
//
//    private static int partition(int[] array, int low, int high, int pivotValue) {
//        int i = low - 1;
//        for (int j = low; j < high; j++) {
//            if (array[j] <= pivotValue) {
//                i++;
//                swap(array, i, j);
//            }
//        }
//        swap(array, i + 1, high);
//        return i + 1;
//    }
//
//    private static void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
//
//    private static int medianOfThree(int[] array, int low, int high) {
//        int mid = low + (high - low) / 2;
//        if (array[mid] < array[low]) {
//            swap(array, low, mid);
//        }
//        if (array[high] < array[low]) {
//            swap(array, low, high);
//        }
//        if (array[high] < array[mid]) {
//            swap(array, mid, high);
//        }
//        swap(array, mid, high);
//        return high;
//    }
}
