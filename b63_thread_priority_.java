/*
 *		THREAD PRIORITY :-
 *
 * ~> it decides which thread is going to run first & which thread run later.
 * ~> if we set the priority then it is a request made to the thread schedular
 * 		where there is no assurity that it will be process & approved
 * ~> the minimum thread priority is 1 , maximum is 10 & normal is 5.
 * 		however we can set the thread priority with the number anything b/w 1 to 10.
*/
public class A extends Thread{
	String name;
	A(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		A a1 = new A("XXX");
		A a2 = new A("YYY");
		a2.setPriority(1);
		a1.setPriority(10);
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		a1.start();
		a2.start();
	}
	public void run() {
		System.out.println(this.name);
	}
}

/*
 *  OUTPUT :-
 *      10
 *      1
 *      XXX   --> not fix     --> YYY
 *      YYY                       XXX
*/
