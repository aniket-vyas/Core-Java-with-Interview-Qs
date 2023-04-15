public class Test {
	public static void main(String[] args) {
		
		A<String> a1 = new A<>("abc");
		A<Integer> a2 = new A<Integer>(100);
		A<Character> a3 = new A<>('a');
		
		
		// in java JDK version 11
		System.out.println("\u265A");  // ♚
		System.out.println("\u265B");  // ♛
		System.out.println("\u265C");  // ♜
		System.out.println("\u2705");  // ✅

	}
}
