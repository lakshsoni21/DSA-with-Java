public class sumOfNDigit{
    
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,10};
        System.out.println(sum(arr, 0));
    }

    static int sum(int arr[], int i){
        //Base case 
        //There are two Ways of base cases here for this you can chosse what is easy to understand
        //Whenever it will reach that index which does'nt exist then it will return 0 because here we are adding thats why we choose to return 0
        if(i == arr.length){
            return 0;
        }

        //This base case is also valid when we reach the last index return that value
        // if(i==arr.length-1){
        //     return arr[i];
        // }

        return arr[i] + sum(arr, i+1);

    }

}