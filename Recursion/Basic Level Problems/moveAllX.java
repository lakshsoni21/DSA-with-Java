public class moveAllX{
	//To avoid too much parameters in the function
	public static int i = 0;
	public static String withX = "";
	public static String nonX = "";

	public static void strFunction(String str, int n, char element){
		//Base case
		if(n<0){
			System.out.print(nonX + "" + withX);
			return;
		}

		if(str.charAt(i) == element){
			withX = withX + "" + element;
			i++;
		} else{
			nonX = nonX + str.charAt(i);
			i++;
		}

		strFunction(str, n-1, element);
	}

	public static void main(String[] args) {
		String str = "axbcxxd";
		char element = 'x';
		int n = str.length()-1;
		strFunction(str,n, element);
	}
	// Time Complexity = O(n)
}