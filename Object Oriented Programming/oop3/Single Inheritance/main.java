public class main{
    public static void main(String[] args) {
        Box box = new Box(4, 5, 1);

        System.out.println(box.l + " "+ box.h + " " + box.w);
        // Box box2 = new Box(box);
        // System.out.println(box2.l + " "+ box2.h + " " + box2.w);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h + " " + box3.weight);

        BoxWeight box4 = new BoxWeight(5,5,10,50);
        System.out.println(box4.l + " "+ box4.h + " " + box4.w + " " + box4.weight);

        Box box5 = new BoxWeight(2,4,6,8);

        //BoxWeight box6 = new Box(2,4,6,8);
        //System.out.println(box6.weight);
    }
}