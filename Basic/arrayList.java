import java.util.*;

public class arrayList{
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(1);

        System.out.println(list);

        int i = list.get(0);
        System.out.println(i);

        list.add(1,1);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int j=0; j < list.size(); j++){
            System.out.print(list.get(j) + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);



    }
}