/*
 *		RUNNABLE :- 
*/
public class multitasking_2 implements Runnable{
	//Runnable is an interface

	String name;
	multitasking_2(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i<10000 ; i++) {
			System.out.println(this.name);
		}
	}

	public static void main(String[] args) {
		
		//Thread
		multitasking_2 a1 = new multitasking_2("XXXX");
		Thread t1 = new Thread(a1);
		t1.start();
		
		//Thread
		multitasking_2 a2 = new multitasking_2("YYYY");
		Thread t2 = new Thread(a2);
		t2.start();
		
		for(int i = 0 ; i<10000 ; i++) {
			System.out.println("main");
		}
	}
	
	//OUTPUT :- YYYY .... main .... XXXX .... (not fix)
}
