/*
 * 		ANONYMOUS CLASS :-
 * 
 * ~> an anonymous inner class is an inner class that is declared
 * 		without using a class name.
 * ~> no class name
 * ~> it must be child class
 * ~> it must be inner class
*/
public class anonymous_class {
	public static void main(String[] args) {
		India id = new India();
		id.g.sayHello();
	}
}
class Greeting{ //Parent class
	public void sayHello() {
		System.out.println("Hello");
	}
}
class India{
	Greeting g = new Greeting() 
	
	//"Greeting" class ki child class --> Anonymous class
	{
		public void sayHello() {
			System.out.println("Namaste");
		}
	};
}

/*
 * ~> we are creating an instance of a subclass
 * ~> anonymous class is a subclass of "Greeting" class
*/
