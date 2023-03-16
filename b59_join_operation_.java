/*
 *		JOIN OPERATION :-
 *
 * ~> join() in java allows one thread to wait until
 * 		another thread completes its execution
*/
public class join_operation {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i = 1 ; i <= 5 ; i++) {
					System.out.println(Thread.currentThread().getName() + " , i = " + i);
				}
			}
		};
		
		Thread t1 = new Thread(r , "T1");
		Thread t2 = new Thread(r , "T2");
		Thread t3 = new Thread(r , "T3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
