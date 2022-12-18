package oop6.LambdaFunctions;
import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i <= 5; i++){
            arr.add(i);
        }

        //Lambda Function
        arr.forEach((item) -> System.out.println(item * 2));

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        LambdaFunctions obj = new LambdaFunctions();
        
        System.out.println(obj.operation(5, 5, div));
    }

    private int operation(int a, int b, Operation op){
        return op.calculation(a, b);
    }


}
