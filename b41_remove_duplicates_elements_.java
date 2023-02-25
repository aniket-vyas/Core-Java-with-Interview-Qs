/*
 *		Q.) Remove duplicate elements from sorted array ? 
*/
public class remove_duplicate {
	 public static void main(String[] args) {
		 		 
		// sorted array with duplicate elements
		int[] x = {1 , 1 , 2 , 3 , 4 , 4 , 5};
		
		// create new "temp" array
		int[] temp = new int[x.length];
		
		// copy the elements into temp
		int j = 0;
		for(int i = 0 ; i<x.length-1 ; i++) {
			if(x[i] != x[i+1]) {
				temp[j] = x[i];
				j++;
			}
		}
		
		// copy the last index value into "temp"
		temp[j] = x[x.length-1]; 
		
		// print "temp" array
		for(int z = 0 ; z<temp.length ; z++) {
			System.out.print(temp[z] + " ");
		}
	 }
}
