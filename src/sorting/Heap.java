package sorting;

public class Heap {

	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void addHeap(int arr[], int end) {
		int i = end;
		while (i > 0) {
			int parent = (i - 1) / 2;
			if (arr[i] > arr[parent]) {
				swap(arr, i, parent);
				i = parent;
			} else {
				break;
			}
		}
	}

	public void heapify(int arr[], int end) {
		int i = 0;
		int left = 0;
		int right = 0;
		while (i <= end) {
			if (2 * i + 1 <= end) {
				left = arr[2 * i + 1];
			} else {
				left = Integer.MIN_VALUE;
			}
			if (2 * i + 2 <= end) {
				right = 2 * i + 2;
			} else {
				right = Integer.MIN_VALUE;
			}
			int max = Math.max(left, right);
			if (arr[i] >= max) {
				break;
			}
			if (left > right) {
				swap(arr, i, 2 * i + 1);
				i = 2 * i + 2;
			}
		}
	}

	public void heapSort(int arr1[]) {
		for (int j = 1; j < arr1.length; j++) {
			addHeap(arr1, j);
		}
		for (int k = arr1.length - 1; k > 0; k--) {
			swap(arr1, 0, k);
			heapify(arr1, k - 1);
		}
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 2, 8, -3, 0, 9, -4 };
		Heap heap = new Heap();
		heap.heapSort(arr);
		heap.display(arr);
	}
}
