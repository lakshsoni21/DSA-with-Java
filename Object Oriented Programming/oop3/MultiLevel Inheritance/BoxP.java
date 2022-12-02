public class BoxP extends BoxW{

    int p;

    BoxP(){
        this.p = 0;
    }

    BoxP(double l, double b, double h, double w, int p){
        //Mere upar jonsi bhi class hai = super = BoxW(l,b,h,w)
        //Then there should exsist a constructor with 4 arguments inside the BoxW then it will run
        super(l,b,h,w);
        this.p = p;
    }

}