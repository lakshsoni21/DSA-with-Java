//It will tell how much types we can place the tiles in a particular matrix may be we can place all of them in a horizontal this is 1 type or we can place all the tiles vertical or we can place mix
import java.util.*;
public class placeTiles {

  public static int tilesPlace(int n, int m) {

    //Base case
    if(n == m){
      return 2;
    }
    if (n < m){
      return 1;
    }

    //vertically
    int vertical = tilesPlace(n-m, m);

    //horizontally
    int horizontal = tilesPlace(n-1, m);

    return vertical + horizontal;
    
  }

  public static void main(String[] args) {
    int n = 4;
    int m = 2;
    System.out.println(tilesPlace(n,m));
  }
}
