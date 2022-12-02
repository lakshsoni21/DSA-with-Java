import java.util.*;
public class friendPairing {

  public static void friendPairing(int i, int n, boolean used[], String ans){
    //Base case
    if(i > n){
      System.out.println(ans);
      return;
    }

    if(used[i] == true){
      friendPairing(i+1, n, used, ans);
    } else{

      used[i] = true;//Pre node
      friendPairing(i+1, n, used, ans + "(" + i + ") ");//Node call

      for(int j = i+1; j<=n; j++){
        if(used[j] == false){
          used[j] = true;//Pre Edge
          friendPairing(i+1, n, used, ans + "(" + i + j + ") ");//Edge call 
          used[j] = false;//Post Edge
        }
      }

      used[i] = false;//Post Node
    }

  }

  public static void main(String[] args) {
    int n = 4;
    boolean used[] = new boolean[n+1];
    friendPairing(1,n,used, "");
  }
}
