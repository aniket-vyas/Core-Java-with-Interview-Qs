/*
 *		Context switching in threads :- 
*/
public class context_switching {
	public static void main(String[] args) {
		
		Thread t1 = new Thread("T1") {		//T1 --> Thread name
			@Override
			public void run() {
				for(int i = 1 ; i<=5 ; i++) {
					System.out.println(Thread.currentThread().getName() + " , i = " + i);
				}
			}
		};
		
		Thread t2 = new Thread("T2") {		//T2 --> Thread name
			@Override
			public void run() {
				for(int i = 1 ; i<=5 ; i++) {
					System.out.println(Thread.currentThread().getName() + " , i = " + i);
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
