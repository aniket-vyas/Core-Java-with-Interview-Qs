/*
 * 		SIB :- Static Initialization Block
 * 
 *  ~> SIB runs before main().
 *  ~> SIB runs only once
 *  ~> it does not require to create object
 *  ~> we can't initialized non-static variable
 *  ~> we can create an object inside SIB
*/
public class SIB {
	
	//SIB-1
	static
	{
		System.out.println("From SIB-1");
	}
	
	//SIB-1
	static int i;//static variable
	static
	{
		System.out.println("From SIB-2");
		i = 20;
		System.out.println(i);
	}
	
	//IIB
	{
		System.out.println("From IIB");
	}
	
	public static void main(String[] args) {
		System.out.println("From main");
		SIB a = new SIB();  //call IIB
	}
}
