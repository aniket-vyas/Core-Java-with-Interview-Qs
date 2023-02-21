/*
 * 		ARRAYS :-
 * 
 * ~> it helps to store collection of values
 * ~> array index always start with 0
 * ~> in java arrays are abject
 * ~> it can take default values
*/
public class arrays {
	public static void main(String[] args) {
		
		//array : 1
		//create an array of name 'age'
		int[] age = new int[3];
		age[0] = 20; // @index 0
		age[1] = 21; // @index 1
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]); //print default value of int
		
		//array : 2
		//create an array of name 'name'
		String[] name = new String[2];
		name[0] = "aniket";
		name[1] = "vyas";
		System.out.println(name[0]);
		System.out.println(name[1]);
	}
}
