public class checkSorted{

    static boolean check(int arr[], int i){

        //Base case when we check again and again and finally when we reach at the last index we will return true
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] < arr[i+1]){
            return check(arr, i+1); // we will return the value whatever the function would give if the function will reach at the base case it will rerturn true it will give true and if it reaches the else block then it will return false
        } else {
            //when arr[i] > arr[i+1] it will return false to where the funciton calls
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,4,8,10};
        System.out.println(check(arr, 0));
    }
}