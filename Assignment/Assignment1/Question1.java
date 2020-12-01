public class Question1{
	public static void main(String[] args) {
		String array[] = {"jigme","GYELTSHEN","AEIOU","Dorji"};// decleared an array list 

		displayArray(array); // display methode is being called in maim methode
	}
	public static void displayArray(String a[]){
		int n = a.length;//Store lenght of an arry list

		int count; /*decleration of variable*/

		String w;

		char v;

		for(int k = 0; k < n; k++){ //loop through the array list
			count = 0;
			w = a[k]; /*stored an kth index  of an array list into a string */

			for(int i = 0; i < w.length(); i++){ // loop through the string 

				v = w.charAt(i); // checks the  each string chart  with vowel chart.
				if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'A' || v == 'I' || v == 'O' || v == 'E' || v == 'U'){
					count = count + 1; /* if the string contain a vowel letter , it get incremented by 1.*/
				}
			}
	
			if(count < 3){ /* prints  s array list containing a less then 3 vowel letter .*/
				System.out.println(w);
			}
		}
	}
}