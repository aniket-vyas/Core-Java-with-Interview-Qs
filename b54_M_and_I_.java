/*
 *		MUTABLE & IMMUTABLE :-
 *
 * ~> Mutable : it is something where the class object properties
 * 				keep on changing.
 * 				Eg -> age , climate
 * 
 * ~> Immutable : once object is created then its state can't
 * 				  be altered.
 * 
 * 		STEPS :-
 * 			1.) create a final class
 * 			2.) set the values of the properties using only constructor
 * 			3.) make properties as final
 * 			4.) do not provide any setters for these properties
*/
public class M_and_I {
	private final int age;
	private final String name;
	public M_and_I(int age , String name) {
		this.age = age;
		this.name = name;
	}
	
	//right click > source > generate getters & setters
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		M_and_I a1 = new M_and_I(20 , "Aniket");
	}
}
