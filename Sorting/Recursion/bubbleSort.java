public class bubbleSort{

    static void sort(int arr[], int i, int e){

        if(e == 0){
            return;
        }

        if(i == e){
            sort(arr, 0, e-1);
            return;
        }

        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        sort(arr,i+1,e);

    }

    public static void main(String[] args) {
        int arr[] = {8,2,5,1, 9, 10};

        //Using Loops
        int n = arr.length-1;
        while(n > 0){
            for(int i=0; i<n; i++){
                if(arr[i] > arr[i+1]){

                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
            n = n-1;

        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Using Recursion
        sort(arr, 0, arr.length-1);

        //printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}