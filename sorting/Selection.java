package sorting;

public class Selection {
	public void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void selectionSort(int arr[]) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 2, 8, -3, 0, 9, -4 };
		Selection selection = new Selection();
		selection.selectionSort(arr);
		selection.display(arr);
	}
}
