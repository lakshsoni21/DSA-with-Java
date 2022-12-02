public class Occurrence{
	//Used this to avoid too much parameters in the function
	public static int first = 0;
	public static int last = 0;

	public static void strCounter(String str, int n, char element, int i){
		if(n==-1){
			System.out.println("First " + first);
			System.out.println("Last " + last);
			return;
		}
		//agar element mil gaya to jo position to counter i=1 or usko last variable me daal do kyuki ki apan ulta chal raha hai 
		//jaise hi i=1 to first or last me n ki value (postion) store kardo kyuki agar kisi string me vo letter ek hi baar aya hoga isliye to first or last ki value ek hi hogi
		//agar dusri baar aya letter to i ki value greater than 1 ho jayegi update ho jayegi 2 ho jayegi to first vale variable me daal do or baar baar ye variable update hota jayega jab bhi vo element mil jayega
		if(str.charAt(n) == element){
			i++;
			if(i==1){
				last = n;
				first = n;
			} else {
				first = n;
			}
		}
		strCounter(str, n-1, element, i);
	}

	public static void main(String[] args) {
		String str = "abaacdaefaah";
		int n = str.length()-1;
		char element = 'a';
		int i = 0;

		strCounter(str, n, element, i);
	}

	//Time Complexity --> O(n)

}