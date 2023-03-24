/*
 *		WRAPPER CLASS :-
 *
 * ~> the value are store in object
 * ~> it is a class whose object wraps or contains primitive data types
 * ~> it helps a java program be completely object-oriented
 * ~> the process of storing the value inside the object is called as wrapping or boxing
 * ~> reading a value from the object is called as unboxing
 * ~> advantage (purpose) : easy manipulation of data
 * ~> example of wrapper class are :
 * 		* Integer x = 10;
 * 		* Byte b = 20;
 * 		* Short s = 30;
 * 		* Long l = 40L;
 * 		* Float f = 10.3F;
 * 		* Double d = 10.3;
 * 		* Character c = 'a';
 * 		* Boolean o = true;
 * ~> there are lots of method present inside it
*/
public class Wrapper_class extends Thread{
	public static void main(String[] args) {
		Integer j = 20;
		System.out.println("j = " + j);
		
		// OR
		
		Integer i = new Integer(10);
		System.out.println("i = " + i);
		
		//Some inbuilt method are :
		System.out.println(i.MAX_VALUE);
		//warrning -> you should be accessed in a static way
		// OR
		System.out.println("max value of int = " + Integer.MAX_VALUE);
		
		System.out.println("min value of int = " + Integer.MIN_VALUE);
		
		System.out.println("Long value = " + i.longValue()); // --> 10
		
		System.out.println("Hash code = " + i.hashCode()); // --> 10
		
		System.out.println("Size = " + Integer.SIZE); // --> 32(bits)
		
		System.out.println("String = " + i.toString()); // --> 10
		
		System.out.println("Double value = " + i.doubleValue()); // --> 10.0
		
		System.out.println("Byte value = " + i.byteValue()); // --> 10
	}
}
