/*
 *		MULTITASKING :-
 *
 * ~> switching b/w tasks rapidly
 * ~> Eg : Human brain
 * ~> Multitasking is done at the program level in java is called THREADS
 * ~> main purpose of THREADS is to improve application performance in terms
 * 		of execution speed
 * ~> DRAWBACK : which program / module run first we can't predict
 * ~> 2 ways to create threads
 * 		1.) By extends thread class
 * 				--> inbuilt 2 () are present 
 * 					* run()
 * 					* start()
 * 		2.) By implements Runnable interface
 * 				--> inbuilt ()
 * 					* run()
*/
public class A extends Thread{
	//Thread --> inbuilt thread class
	
	//thread - 1
	@Override
	public void run() {
		for(int i = 0 ; i<10000 ; i++) {
			System.out.println("run");
		}
	}
	
	//thread - 2
	public static void main(String[] args) {
		A a1 = new A();
		a1.start(); 	//it will call run()
		for(int i = 0 ; i<10000 ; i++) {
			System.out.println("main");
		}
	}
	
	//OUTPUT : main....run....main....run....(not fix)
}
