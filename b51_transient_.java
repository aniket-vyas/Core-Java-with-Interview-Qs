/*
 *		"transient" KEYWORD :-
 *
 * ~> during serialization if yu don't want to write certain variable 
 * 		content into the object then mark that variable with transient
 * 		keyword
*/

import java.io.Serializable;
public class transient_ implements Serializable {
	 transient String city = "Jaipur";
}
