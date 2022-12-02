import java.util.*;
public class binarySearch{

    //Concept
    /** 
     * What this algorithm will do? - this algo will find the index number of an element in array
     * The given array should be in ascending order, and all the elements should be in greater than 0 positve
     * This algo will get the middle element and comapre the target with middle element if target<mid then search in the starting to mid-1, but if the target > middle element then search that element from mid+1 to end
     * The base conditino will be when you will find that element in the middle index
     * In every function call the array, target, starting point and the ending point will be pass and in the body the middle element will be created 
     * if middle element == the target then return the index number
    */

    public static int search(int arr[], int target, int s, int e){
        int m = (s + e) / 2;

        if(s > e){
            return -1;
        }
        
        if(target == arr[m]){
            return m;
        }

        if(target < arr[m]){
            return search(arr, target, s, m-1);
        } else{
            return search(arr, target, m+1, e);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find in the array ");
        int target = sc.nextInt();
        int arr[] = {1,2,4,8,10};
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}