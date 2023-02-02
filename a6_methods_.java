/*
 *		METHODS :- 
 *
 * ~> if you don't call girls for invitation
 *    they will never come to your functions
 *    (#girl_manners)
 * ~> same as methods when you call a method
 * 	  then it will run
 * 
 * ~>	Types of methods :
 * ~> 1.) static method
 * ~> 2.) non static method
 */
public class method {
	public static void main(String[] args) {
	/* 'V' for void & 'V' for Vijay Mallya
	 * like Vijay Mallya does't return any value to (banks) SBI.
	 * same as void will never return any value.
	 * example : return 50; --> it will give error
	 * example : return; --> control back to the calling statement 
	 */
		System.out.println("Start execution from main");
		
		//create an object for non static method
		method m = new method();
		m.test2(); //calling
		
		//call static methods
		method.test1();
		
		System.out.println("End of the program :) ");
	}
	public static void test1() {
		//static method : belongs to class
		System.out.println("from static method test1");
	}
	public void test2() {
		//non static method : belong to object
		System.out.println("from non static method test2");
	}
}
