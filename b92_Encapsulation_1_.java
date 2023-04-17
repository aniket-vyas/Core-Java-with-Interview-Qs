/*
 *			ENCAPSULATION :-
 *
 * ~> covering / wrapping
 * ~> we wrap the data with the methods that operates on these data
 * 		in order to interact with these variables we develop publicly
 * 		define getters / setters we avoid direct access to the variable
 * 		by making it private
 * 	
 * 		Eg : int x = 10;
 * 			 S O P (x); --> this is direct interaction
 * 
 * ~> this is what we need to avoid direct interaction with a variable
 * 		in encapsulation
 * 
 *  		DATA HIDING :-
 *  
 * ~> here we make the variable private so that direct interaction with
 * 		a variable is not allowed 
*/

public class Encapsulation_1 {
	
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
}
