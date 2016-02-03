package sorting;

public class Bubble {

	public void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void bubbleSort(int arr[]) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
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
		Bubble bubble = new Bubble();
		bubble.bubbleSort(arr);
		bubble.display(arr);
	}

}
