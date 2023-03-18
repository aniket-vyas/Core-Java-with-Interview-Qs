/*
 *		THREAD SYNCHRONIZATION :-
 *
 * ~> when 2 thread are operating on a common data ,
 * 		data corruption will happen because there is 
 * 		no synchronization
*/

//  public class A{
//	  public static void main(String[] args) {
//		  B b1 = new B();
//		  b1.start();
//		  System.out.println(b1.total);
//	  }
//  }

/*
 *	~> in the above program :-
 *		before total get calculated main() try to print total 
 */
public class A {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		synchronized(b1) {
			try {
				b1.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(b1.total);
	}
}
