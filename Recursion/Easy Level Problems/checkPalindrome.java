public class checkPalindrome{

    //Concept
    //eg - 12321 the index=1 and the last index the elements are equal then again 2 = 2
    // starting index = 0, ending index = 4 they are euqal 1=1
    // s=1, e=3, 2=2
    // s= 2, e=2, this is base case

    static boolean isPalindrome(int arr[], int s, int e){
        if(s == e){
            return true;
        }

        if(arr[s] == arr[e]){
            boolean isPalind = isPalindrome(arr, s+1, e-1);
            return isPalind;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2};
        System.out.println(isPalindrome(arr, 0, arr.length-1));
    }
}