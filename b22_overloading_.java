/*
 * 2.) OVERLOADING :-
 * 		~> we create multiple methods of the
 * 			same name in the same class ,
 * 			if they have different no. of args
 * 			or different types of args
*/
public class overloading {
	
	public void test() {
		System.out.println(1);
	}
    
	public void test(int x) {
		System.out.println(x);
	}
    
	public void test(int x , int y) {
		System.out.println(x);
		System.out.println(y);
	}
    
	public static void main(String[] args) {
    	//calling
		overloading a1 = new overloading();
		a1.test();	//call test()
		a1.test(10);	//call test(int x)
		a1.test(20 , 30);	//call test(int x , int y)
	}
}
