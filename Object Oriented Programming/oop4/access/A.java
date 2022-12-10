public class A{

    private int num;
    String name;
    int arr[];

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    //Getting the Private Variable value using a method
    void getNum(){
        System.out.println(num);
    }

    //Setting the Private variable value using a method
    void setNum(int num){
        this.num = num;
    }
}