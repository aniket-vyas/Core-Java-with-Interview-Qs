public class super_keyword_2 extends super_keyword_1{
	
	//constructor
	super_keyword_2(){
		super(); //call constructor of parent class
		System.out.println("from constructor");
	}
	
	public static void main(String[] args) {
		super_keyword_2 a1 = new super_keyword_2();
		a1.test2();
	}
	
	public void test2() {
		// calling of parent class members
		super.test1();
		System.out.println(super.i);
	}
}
