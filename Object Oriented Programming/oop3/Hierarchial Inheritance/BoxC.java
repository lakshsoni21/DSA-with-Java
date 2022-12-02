public class BoxC extends Box{
    //This class will provide the color to a particular box
    String color;

    BoxC(){
        //That is the default color of the box
        this.color = "black";
    }

    BoxC(double l, double b, double h, String c){
        //The Above class has the properties of l,b,h so they will initiliaze for me
        //They have the construcotr with 3 arguments
        super(l,b,h);
        this.color = c;
    }
}