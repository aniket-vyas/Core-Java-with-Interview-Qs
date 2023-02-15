public class functional_interface_2 implements functional_interface_1 {

	@Override
	public void test() {
		System.out.println("from override test method");
	}
  
	public static void main(String[] args) {
		functional_interface_2 a1 = new functional_interface_2();
    //it will call override method
		a1.test();
	}
  
}
