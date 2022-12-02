import java.util.*;
public class permutationString {

  public static String[] addTwoArray(String pre[], String post[], String arr[]){
    String result[] = new String[pre.length + post.length];

    //Adding the two arrays
    for(int v=0; v < pre.length; v++){
      result[v] = pre[v];
    }
    int m=0;
    for(int v=pre.length; v < arr.length; v++){
      result[v] = post[m];
      m++;

    }
    return result;
  }

  public static void permutationOfString(String arr[], int i){
    //Base case
    if(i == arr.length){
      for(int n=0; n<arr.length; n++){
        System.out.print(arr[n]);
      }
      System.out.println();
      return;
    }

    //Creating the post array
    String post[] = new String[arr.length-i];
    int k = 0;
    for(int j=i; j < arr.length; j++){
      post[k] = arr[j];
      k++;
    }

    //Creating the pre array
    String pre[] = new String[i];
    for(int l=0; l < i; l++){
      pre[l] = arr[l];
    }

    //Swapping
    for(int j=0; j < post.length; j++){
      String temp = post[0];
      post[0] = post[j];
      post[j] = temp;
      permutationOfString(addTwoArray(pre, post, arr), i+1);
    }

  }

  public static void main(String[] args) {
	   String arr[] = {"a", "b", "c"};
     int i = 0;
     permutationOfString(arr, i);

  }
}
