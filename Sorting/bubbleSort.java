import java.util.*;
public class bubbleSort{

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input array
        int size = sc.nextInt();
        int arr[] = new int[size];
        sc.nextLine();

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //bubbleSort Logic
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        printArray(arr);

        //timeComplexity = O(n^2)

    }
}