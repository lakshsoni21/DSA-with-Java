import java.util.*;

public class checkSorted {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Variable declaration
    int size = sc.nextInt();
    int numbers[] = new int[size];

    //Taking the input from the user
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    //Ascending Logic algorithm
    int x = numbers[0];
    boolean isAscending = true;

    for (int i = 1; i < size; i++) {
        if (numbers[i] > x) {
            x = numbers[i];
        } 
        else{
            isAscending = false;
        }

    }

    if(isAscending){
        System.out.println("The array is sorted in ascending order");
    }else{
      System.out.println("The Array is not sorted in ascending order");
      int z = numbers[0];
      for(int i=0; i<size; i++){
        if(numbers[i] > z);
      }
    }

  }
}
