import java.util.*;

public class InsertionSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];

    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }

    for(int i=1; i<arr.length; i++){

        int temp = arr[i];
        int j = i-1;

        while(j>=0 && arr[j] > temp){
            //shift the jth element in its next box j+1
            arr[j+1] = arr[j];
            //kyuki j+1 kya hai vahi value hai jo apan ne temp me store kar ke rakhi hai
            j--;
        }

        arr[j+1] = temp;

    }

    printArray(arr);


  }

}
