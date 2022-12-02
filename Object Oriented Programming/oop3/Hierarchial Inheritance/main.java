public class main{
    public static void main(String[] args) {
        
        //Creating the objects of Box
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.b + " " + box1.h);

        Box box2 = new Box(6,7,8);
        System.out.println(box2.l + " " + box2.b + " " + box2.h);

        //Creating the Object of BoxC
        BoxC boxWithColor = new BoxC(10,10,10,"Red");
        System.out.print("Box with Color: ");
        System.out.println(boxWithColor.l + " " + boxWithColor.b + " " + boxWithColor.h + " " + boxWithColor.color);

        //Creating the Object of BoxP
        BoxP boxWithPrice = new BoxP(10,10,10,100);
        System.out.print("Box with Price: ");
        System.out.println(boxWithPrice.l + " " + boxWithPrice.b + " " + boxWithPrice.h + " " + boxWithPrice.price);
    }
}