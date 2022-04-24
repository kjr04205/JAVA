package Arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] ar1 = {1, 5, 3, 2, 4};
		double[] ar2 = {1.2, 1.5, 2.2, 2.8, 5.4};
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		for(int i : ar1)
			System.out.println("int형 배열 sort = " + i);
		
		for(double j : ar2)
			System.out.println("double형 배열 sort = " + j);

	}

}
