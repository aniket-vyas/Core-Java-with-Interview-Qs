/*
 *		BUBBLE SORT :-
 *
 * ~> it is a simple sorting algorithm that compares adjacent elements of an array
 * 		& swap them if the element on the right is smaller than the one on the left
 * ~> no extra space is needed for this sort , the array itself is modified
 * ~> how many rounds to sort an array ?
 * 		--> [array].length - 1
*/
public class bubble_sort {
	 public static void main(String[] args) {
		
		//unsorted array
		int[] x = {38 , 23 , 32 , 14 , 7};
		
		int temp;
		//for repeat rounds
		for(int j = 0 ; j < x.length ; j++) {
			//compare & swap
			for(int i = 0 ; i<x.length - 1 ; i++) {
				if(x[i] > x[i+1]) {
					temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
		//for print
		for(int i=0 ; i < x.length ; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
