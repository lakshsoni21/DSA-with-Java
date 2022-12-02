public class BoxW extends Box{

    double w;

    BoxW(){
        this.w = 0;
    }

    BoxW(double l, double b, double h, double w){
        //Mere upar jonsi bhi class hai --> super = Box
        super(l,b,h);
        this.w = w;
    }

}