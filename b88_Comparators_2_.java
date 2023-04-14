import java.util.Comparator;

public class B implements Comparator<A>{

	@Override
	public int compare(A o1, A o2) {	
		return o1.name.compareTo(o2.name);
	}
	
	public static void main(String[] args) {
	
		B b1 = new B();
		int val = b1.compare(new A(100 , "abc") , new A(101 , "xyz"));
		System.out.println(val);   // print -ve value
	
	}
}
