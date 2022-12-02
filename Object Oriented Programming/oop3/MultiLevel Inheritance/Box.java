public class Box{

    //Basic Properties of Box
    double l;
    double b;
    double h;

    //When you are calling the Default Constructor
    Box(){
        this.l = 0;
        this.b = 0;
        this.h = 0;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
}