public class reverseString{

	public static void reverseString(int n, String str){
		if(n==0){
			System.out.print(str.charAt(n));
			return;
		}

		System.out.print(str.charAt(n));
		reverseString(n-1, str);
	}

	public static void main(String[] args) {
		String str = "abcd";
		int n = str.length()-1;
		reverseString(n,str);
	}

	//Time complexity --> O(L) where L= the length of string 
}