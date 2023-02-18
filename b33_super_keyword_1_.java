/*
 *		"super" KEYWORD :-
 *
 * ~> using super keyword we can access the members
 * 		of parent class
 * ~> it can only be used when inheritance will be there
 * ~> we can access both static & non-static members
 * ~> it can not be used inside static context
 * ~> we can call constructor of parent class but then 
 * 		we should use super keyword in child class constructor
 *  	& it shoud be very frist statement
 *  ~> we can not use "super" & "this" keyword in same
 *  	constructor (1'st statement problem)
*/
public class super_keyword_1 {
	int i = 10;
	super_keyword_1(){
		System.out.println("from constructor of parent class");
	}
	public void test1() {
		System.out.println("from test1()");
	}
}
