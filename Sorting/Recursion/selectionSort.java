public class selectionSort{

    static void sort(int arr[], int s, int min, int i){

        if(s == arr.length-1){
            return;
        }

        if(i == arr.length){
            int temp = arr[s];
            arr[s] = arr[min];
            arr[min] = temp;

            sort(arr, s+1, s+1, s+2);
            return;
        }

        if(arr[i] < arr[min]){
            min = i;
        }

        sort(arr, s, min, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        sort(arr, 0, 0, 1);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}