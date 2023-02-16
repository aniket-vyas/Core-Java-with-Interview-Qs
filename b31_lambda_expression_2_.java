public class lambda_expression_2 {
	public static void main(String[] args) {
		
		// () --> will call test()
		// lambda expression [ -> ]
    
		lambda_expression_1 a1 = () -> {
			System.out.println("500");
		};
    
		/*
		 * ~> inherit
		 * ~> override
		 * ~> implement
		 * ~> create object 
		*/
		a1.test();
	}
}
