public class quickSort {

  public static void sortArr(int arr[], int low, int high) {
  
    if(low >= high){
      return;
    }

    int s = low;
    int e = high;
    int m = (s + e) / 2; //remember to use the () / 2 otherwise it will give an error because java does'nt know BODMAS Rule
    int pivot = arr[m];

    while (s <= e) {

      //For left hand side
      while (arr[s] < pivot) {
        s++;
      }

      //For rightend side
      while (arr[e] > pivot) {
        e--;
      }

      if (s <= e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
      }
    }

    sortArr(arr, low, e);
    sortArr(arr, s, high);
    
  }

  public static void main(String[] args) {
    int arr[] = {5,4,3,2,1,8,7};

    sortArr(arr, 0, arr.length - 1);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
  }
}
