/*
 * name of interface --> interface_1
 * name of class --> interface_2
*/
public class interface_2 implements interface_1 {

	@Override
	public void test_1() {
		System.out.println("from test_1 method");
	}
	@Override
	public void test_2() {
		System.out.println("from test_2 method");
	}
	
	public static void main(String[] args) {
		interface_2 a1 = new interface_2();
		a1.test_1();
	}
}
