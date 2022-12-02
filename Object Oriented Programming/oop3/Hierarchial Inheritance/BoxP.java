public class BoxP extends Box{
    //This class will set the price of the Box
    int price;

    BoxP(){
        this.price = 50;
    }

    BoxP(double l, double b, double h, int p){
        //The above class Box will handle l,b,h
        super(l,b,h);
        this.price = p;
    }
}