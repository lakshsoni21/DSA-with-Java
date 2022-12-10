//Demo of Object class

public class ObjectDemo{
    int num;

    ObjectDemo(int num){
        this.num = num;
    }

    //Hash Code method we are overriding this form Object Class
    //We will learn more in depth how to create it in hashmap lecture 
    // @Override
    // public int hashCode(){
    //     return super.hashCode();
    // }

    //Modifing the hashCode() method
    @Override
    public int hashCode(){
        return num;
    }

    //Modifing the equals() method
    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }

}