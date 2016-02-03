package sorting;

public class Quick {
	
	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public int sortQuick(int arr[],int low,int high){
		int i=low+1;
		int j=high;
		int k=arr[low];
		while(i<=j){
			if(arr[i]<=k){
				i++;continue;
			}
			if(arr[j]>k){
				j--;continue;
			}
			swap(arr,i,j);
		}
		swap(arr,j,low);
		return j;
	}
	
	public void QuickSort(int arr[],int low,int high){
		if(low>=high){
			return;
		}
		int pivot=sortQuick(arr,low,high);
		QuickSort(arr,low,pivot-1);
		QuickSort(arr,pivot+1,high);		
	}
	
	public static void main(String args[]){
		int arr[]={-3,1,0,9,5,-8};
		Quick obj= new Quick();
		obj.QuickSort(arr,1,6);
		obj.display(arr);
	}

}
