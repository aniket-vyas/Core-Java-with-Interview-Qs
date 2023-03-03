/*
 *		SERIALIZATION :- 
*/

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serialization {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D://test_reader.ser");
			S_and_D a1 = new S_and_D();
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
