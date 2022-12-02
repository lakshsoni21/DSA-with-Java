import java.util.ArrayList;

public class linearSearch{

    static int search(int arr[], int target, int i){

        //1. Single Occurrence
        //When we pass the wrong element wihch not there in array so this thing will happen 
        if(i == arr.length){
            System.out.println("The number you are finding is not there in the array ");
            return -1;
        }

        //Main base case
        //When we find our target element we will return the index position of array
        if(arr[i] == target){
            return i;
        } 

        return search(arr, target, i+1);
        //We use return here beacuse ye search karge bachi hui array me or kuch value le ke ayega base case se jo bhi isko value milegi ye ya pe aake return karega fir pichle vale stacks ke calls me same value return hoti jayegi or main tak poch jayegi
        
    }

    //2. Multiple Occurrence using ArrayList without returning the list 

    //For searching if the target is present in the 2 or more indexes so how we will print the indexes where they present
    //Using simple array list when we will find that element we will add that index in the array list and then move to the nex index
    // so the base case for this will be simple  when we reach out to the out of the array then we will return the data type for this function will be void
    //after wards when this staack calls will wiping out returning then at the main function we will print that array list  

    static ArrayList<Integer> list = new ArrayList<>();

    static void searchAll(int arr[], int target, int i){
        if(i == arr.length){
            return;
        }

        if(arr[i] == target){
            list.add(i);
        }

        searchAll(arr, target, i+1);

    }

    //3. Multiple Occurrence Using Arraylist and returning the arraylist passing the arraylist in the argument

    static ArrayList<Integer> searchAllNew(int arr[], int target, ArrayList<Integer> newList, int i){
        //Base case

        if(i == arr.length){
            return newList;
        }

        if(arr[i] == target){
            newList.add(i);
        }

        return searchAllNew(arr, target, newList, i+1);
        
        //ye call muje puri array me traverse karke array list lake degi jisme indexes store hai isliye return likhna jaruri hai
        //jaha bhi call lagegi agar kuch returnType hai us function call ka to vo call jab khatam hogi jab tumko kuch na kuch return karna pagega call ke baad to  yaha pe hamne call jo bhi value leke ayegi vo return kardena is case me call base case tak pochegi or vaha pe return kardegi arrayList to arrayList return hogi
    }

    //4. Multiple Occurrence Using Arraylist and returning the arraylist 
        //Condition you don't have to pass the arraylist in the arguments and you have to create the the arraylist inside the body of the funciton

    static ArrayList<Integer> searchNew1(int arr[], int target, int i){

        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> listFromAbove = searchNew1(arr, target, i+1);

        list.addAll(listFromAbove);

        return list;
        
    }

    //Main function
    public static void main(String[] args) {
        int arr[] = {3,18,1,18,9};

        //1.
        System.out.print("1st Solution: ");

        System.out.println(search(arr, 18, 0));

        //2. Question searching if the same target is present in the multiple indexes
        System.out.print("2nd Solution: ");

        searchAll(arr, 18, 0);
        System.out.println(list);

        //3
        System.out.print("3rd Solution: ");
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println(searchAllNew(arr, 18, newList, 0));

        //4
        System.out.print("4th Solution: ");
        System.out.println(searchNew1(arr, 18, 0));


    }
}