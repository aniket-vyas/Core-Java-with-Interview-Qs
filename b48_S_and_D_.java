/*
 *		SERIALIZATION :-
 *
 * ~> here we convert the object into 0's & 1's and then
 * 		we store that object into .ser file permanent
 * 
 * 		DESERIALIZATION :-
 * 
 * ~> here we read 0's & 1's from the file & then we form
 * 		object back , this process is called deserialization
 * 
 * ****
 * --> Every class we create in java , by default it is
 * 		subclass of object class
 * ****
*/

import java.io.Serializable;
public class S_and_D implements Serializable {
	String city = "Jaipur";
}
