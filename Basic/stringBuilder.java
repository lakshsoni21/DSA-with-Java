import java.util.*;
public class stringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating string builder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //set char at 0 index
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        //inserting element at 0 index automatically others elements will be shifted
        // sb.insert(0, 'S');
        // System.out.println(sb);
        // sb.insert(2, 'n');
        // System.out.println(sb);

        //deleting element
        //ending index is non exlucsive you have +1 
        // sb.delete(2, 3); from 2 to 2 will delete on letter n
        // System.out.println(sb);
        // sb.delete(2,4); //from 2 to 3 nn delete
        // System.out.println(sb);

        //Append 
        //It will add insert the value in the last of a string

        sb.append('K');//str = str + 'K';
        sb.append('A');//str = str + 'A';
        sb.append('K');
        sb.append('K');
        sb.append('R');
        System.out.println(sb);

        //length function 
        System.out.println(sb.length());
    }
}