/*
 *		IIB :- Instance Initialization Block
 *
 * ~> it will execute only when object is created.
 * ~> no. of times object is created, same no. of 
 * 		times IIB will be called.
 * ~> we can create object inside IIB ?
 * 		--> no error -> but never stops
 * ~> it is use to initialized all the instance variable.
 * ~> first IIB will call then constructor
 * ~> we can initialized both static and non-static
 * 		variable inside IIB.
*/
public class IIB {
	
	//IIB-1
	{
		System.out.println("From IIB-1");
	}
	
	//constructor
	IIB(){
		System.out.println("From constructor");
	}
	
	//IIB-2
	int i;		//static int i; 
	{
		System.out.println("From IIB-2");
		i = 20;
		System.out.println("From IIB-2 , i = " + i);
	}
	
	public static void main(String[] args) {
		System.out.println("Start main");
		
		IIB a = new IIB(); //call IIB then constructor
		IIB b = new IIB(); //call IIB then constructor
		
		System.out.println("End main");
	}
}
