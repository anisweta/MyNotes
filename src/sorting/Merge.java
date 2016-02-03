package sorting;

public class Merge {
	
	public void sortedMerge(int arr[], int low, int high) {
		int result[] = new int[high - low + 1];
		int i = low;
		int mid = (low + high) / 2;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				result[k] = arr[i];
				i++;
			} else {
				result[k] = arr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			result[k] = arr[i];
			k++;i++;
		}
		while (j <= high) {
			result[k] = arr[j];
			k++;j++;
		}
		k = 0;
		for (int a = low; a <= high; a++) {
			arr[a] = result[k];
			k++;
		}
	}
	
	public void mergeSort(int arr[], int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		sortedMerge(arr, low, high);
	}	

	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 2, 8, -3, 0, 9, -4 };
		int low = 0;
		int high = 5;
		Merge mergeSort = new Merge();
		mergeSort.mergeSort(arr, low, high);
		mergeSort.display(arr);
	}
}
