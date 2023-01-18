package SinglyLinkedList;
public class happyNumber {
    public static void main(String[] args) {
        boolean isHappy = happy(98);
        if(isHappy){
            System.out.println("It is a Happy Number");
        } else{
            System.out.println("It is not a Happy Number");
        }
    }
    //My logic
    static int fun(int x, int y){

        if(x/10 == 0){
            return x*x + y*y;
        }

        return fun(x/10, x%10) + y*y;
        
    }

    //My logic
    static boolean happy(int n){
        int x = n;
        while(x != 1){
            x = fun(x, 0);
            //Ye 4 wala case bhot important hai
            //Agar apka number 4 pe phochta hai it means ye 1 to kabhi layega hi nahi
            //means the number is not a happy number
            if(x == 4){
                return false;
            }
        }
        return true;
    }



}
