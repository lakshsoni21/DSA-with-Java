public class reverseNumber{

    //We will reverse our number there are two ways 
    //1. we can use an another variable in which we cann add our last number every time
    static int sum = 0;

    static void reverse(int n){
        if(n==0){
            return;
        }
        int lastDigit = n%10;//We will get the last digit using modulo 
        int otherDigits = n/10;//we will get the all digits expect last
        sum = sum * 10 + lastDigit;
        reverse(otherDigits);
    }

    //2 In this we will use pure recursion to reverse that number
    //here we use the math function to calculate the no of digits and to do 10^no.ofDigits-1
    //We use two functions, one is rev1 and another is helper

    static int rev1(int n){
        //calculating the no.of digits using math function
        int noOfDigits = (int)(Math.log10(n)) + 1;
        return helper(n, noOfDigits);
    }

    static int helper(int n, int noOfDigits){
        //Base case
        //Jab ek hi digit bachi hogi to vahi digit return kardena
        //when you do the modulo of single digit then the ans is same digit
        if(n%10 == n){
            return n;
        }

        int lastDigit = n%10;
        int leftDigits = n/10;

        int power = (int)(Math.pow(10, noOfDigits-1));

        return lastDigit * power + helper(leftDigits, noOfDigits-1);
    }


    public static void main(String[] args) {
        int n = 4321;
        reverse(n);
        System.out.println(sum);
        System.out.println(rev1(n));
    }
}