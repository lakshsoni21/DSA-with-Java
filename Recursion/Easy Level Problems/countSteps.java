public class countSteps{

    //Concept - You have given a number let say 14 if it is even divide it by 2 and if it is odd subtract it by 1 and you have to return how much steps this number will take to reach zero


    static int count(int n, int counter){
        if(n==0){
            return counter;
        }

        if(n%2 == 0){
            n = n/2;
            counter++;
        } else {
            n--;
            counter++;
        }

        return count(n, counter);

    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(count(n,0));
    }
}