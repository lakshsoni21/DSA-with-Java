public class checkSorted{

	public static void checkSorted(int arr[],int max, int i){
		if(i > arr.length-1){
			System.out.println("Array is Sorted");
			return;
		}
		if(max < arr[i]){
			max = arr[i];
		} else{
			System.out.println("Array is not sorted");
			return;
		}
		checkSorted(arr, max, i+1);
	}

	public static void main(String[] args) {
		int arr[] = {2,4 ,6,8};
		int max = arr[0];
		int i = 1;
		checkSorted(arr, max, i);
	}

	//Time Complexity --> O(n)

}