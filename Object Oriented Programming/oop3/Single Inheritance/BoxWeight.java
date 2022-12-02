public class BoxWeight extends Box{
    
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double w, double h, double weight){
        super(l, h, w); // What is this? -> Calls the parent class constructor
        //used to initialse values in present class
        this.weight = weight;
    }
}