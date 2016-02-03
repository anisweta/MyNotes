package sorting;

public class Insertion {
	public void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void insertionSort(int arr[]) {
		if (arr == null) {
			return;
		}
		int i, j;
		for (i = 1; i < arr.length; i++) {
			j = i;
			while (j > 0) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					j--;
				} else {
					break;
				}
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 2, 8, -3, 0, 9, -4 };
		Insertion insertion = new Insertion();
		insertion.insertionSort(arr);
		insertion.display(arr);
	}
}
