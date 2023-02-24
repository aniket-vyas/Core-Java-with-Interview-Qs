public class switch_case {
	public static void main(String[] args) {
		
		int key = 2;
		switch (key) {
		case 1: 		//if 1 == key value
			System.out.println(1);	//print this
			break;	
		case 2: 		//if 2 == key value
			System.out.println(2);	//print this
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;

		default:		//like else condition
			System.out.println("default");
			break;
		}
		
	}
}
