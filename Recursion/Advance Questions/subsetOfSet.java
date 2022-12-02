import java.util.*;
public class subsetOfSet {

  public static void printSubset(int n, int i, String substr){

    if(i==n){
      System.out.println("{" + substr + "}");
      return;
    }
    
    //Add kar new level vala number
    printSubset(n, i+1, substr + (i+1));
    //Dont add the new level member
    printSubset(n, i+1, substr);



  }

  public static void main(String[] args) {
    printSubset(3,0,"");
  }
}
