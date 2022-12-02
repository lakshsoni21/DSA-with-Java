
//Basically we have two things to do 2 things
//1 divide
//2 mergeing the two arrays in the sorted way

import java.util.*;
public class mergeSort {

  public static int[] mergeSort(int arr[], int l, int r){

    //Base case
    //When left index = right index when there is only 1 element left in the array 
    if(l == r){
      int base[] = new int[1];
      base[0] = arr[l];
      return base;
    }

    //Getting the mid part of
    int mid = (l+r) / 2;
    int firstArray[] = mergeSort(arr, l, mid);
    int secondArray[] = mergeSort(arr, mid+1, r);
    //These two returned array wil be merge according to merge two sorted array
    int finalSorted[] = mergeArrays(firstArray, secondArray);

    return finalSorted;

  }

  public static int[] mergeArrays(int a[], int b[]){

    int ans[] = new int[a.length+b.length];
    int i=0;
    int j=0;
    int k=0;

    while(i < a.length && j < b.length){
      if(a[i] < b[j]){
        ans[k] = a[i];
        i++;
        k++;
      } else{
        ans[k] = b[j];
        j++;
        k++;
      }
    }

    while(i < a.length){
      ans[k] = a[i];
      i++;
      k++;
    }

    while(j < b.length){
      ans[k] = b[j];
      j++;
      k++;
    }

    return ans;

  }

  public static void main(String[] args) {
    int arr[] = {6,5,4,3,2,1};

    int ans[] = mergeSort(arr, 0, arr.length-1);

    for(int i=0; i < ans.length; i++){
      System.out.print(ans[i] + " ");
    }

  }
}
