/*
 * 		"this" keyword :-
 * 
 * ~> it is a special reference variable that automatically 
 * 		gets created & store object address.
 * ~> we can access non-static members.
 * ~> we can't use "this" inside static methods.
 * ~> we can call constructor, but this call should happen
 * 		from another constructor & it should be first statement 
 * 		inside another constructor 
*/
public class This { //This is a class name LOL :)
	int x = 10;//non-static variable
	
	This(){
		System.out.println("from constructor 1");
	}
	This(int x){
		this(); //it will call above constructor
		System.out.println("from constructor 2");
	}
	
	public static void main(String[] args) {
		This a = new This(100);
		This a1 = new This();//it will also call first constructor
		System.out.println(a1);//object add. will print 
		a1.test1();
	}
	public void test1() {
		//this will also print same object add.
		System.out.println(this);
		
		System.out.println("access nonstatic variable : "+this.x);
		
		//call another method using "this"
		this.test2();
	}
	public void test2() {
		System.out.println("from test2");
		//this(); --> we can't call constructor inside a method
	}
}
