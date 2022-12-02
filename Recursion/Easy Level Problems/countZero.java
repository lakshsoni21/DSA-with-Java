public class countZero{

    //n%10 ka meaning hai ki jo bhi number aap loge uski last value aapko dedega
    //for example 30204 % 10 jab aap 30204 ko 10 se divide karoge to reminder 4 bachega last digit
    // vice versa koi sa bhi number hota lo aap 302 % 10 = 2

    static int counter = 0;

    static void count(int n){

        if(n%10 == n){
            //when only 1 digit is left
            System.out.println(counter);
            return;
        }

        if(n%10 == 0){
            //jo bhi number pass hoke aya hai argument me se uski last digit check karo ki kya vo zero hai
            counter++;
        }
        count(n/10); //jo bachi hui digits hai unko argument me pass kardo jo check ho chuki hai
        //for example dry run
        //30204 % 10 = 4 which is not equal to 0 the next call will be
        //30204/10 = 3020 then after passing this arugment in the next call again it will check 3020 % 10 = 0 yes condition satisy then update the counter value and then call the next function call for 3020/10 - n = 302 so this thing will happen again and again 
    }

    public static void main(String[] args) {
        int n = 302040;
        count(n);
    }
}