public class main{
    public static void main(String[] args) {
        
        //Creating an Object of Box Class
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.b + " " + box1.h);

        Box box2 = new Box(5,10,15);
        System.out.println(box2.l + " " + box2.b + " " + box2.h);

        Box box3 = new Box(box2);
        System.out.println(box3.l + " " + box3.b + " " + box3.h);

        //Creating an Object of BoxW class
        BoxW box4 = new BoxW(5,5,5,10.5);
        System.out.println(box4.l + " " + box4.b + " " + box4.h + " " + box4.w);

        //Creating an Object of BoxP class
        BoxP box5 = new BoxP(10,10,20,12.2,50);
        System.out.println(box5.l + " " + box5.b + " " + box5.h + " " + box5.w + " " + box5.p);



    }
}