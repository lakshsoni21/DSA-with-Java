public class duplicateString{

	public static void deleteDuplicate(StringBuilder str, int i){
		//Base case
		if(i >= str.length()){
			System.out.println(str);
			return;
		}

		for(int j=i+1; j<str.length(); j++){

			if(str.charAt(i) == str.charAt(j)){
				str.delete(j,j+1);
			}
		}

		deleteDuplicate(str, i+1);
	}

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("lakshhaks");
		int i = 0;
		deleteDuplicate(str, i);
	}
	// Time Complexity = O(n)
}