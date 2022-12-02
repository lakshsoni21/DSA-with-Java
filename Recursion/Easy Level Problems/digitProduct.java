public class digitProduct{
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,10};
        System.out.println(product(arr, 0));
    }

    static int product(int arr[], int i){
        if(i == arr.length-1){
            return arr[i];
        }

        return arr[i] * product(arr, i+1);

    }

}