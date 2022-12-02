public class towerOfHonai{

	public static void towerOfHonai(int n, String src, String helper, String des) {
		//Base Case
		if(n==1){
			System.out.println("Transferred the disk "+ n + " From "+ src + " to " + des);
			return;
		}

		//Calling the left call to transfer the n-1 disk to helper
		towerOfHonai(n-1, src, des, helper);
		//When this function will transfer all the n-1 disk i wanna print my last disk transfer to destination
		System.out.println("Transferred the disk "+ n + " From "+ src + " to " +des);
		//Now i want to transfer the n-1 disks currently in helper to the destination
		towerOfHonai(n-1, helper, src, des);

	}

	public static void main(String[] args) {
		int n = 3;
		towerOfHonai(n, "A", "B", "C");
	}
}