package Arrays;
import java.util.Arrays;

public class ArraysCopy {
	
	public static void main(String[] args) {
		
		int[] ar1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] ar2 = Arrays.copyOf(ar1, ar1.length);
		System.out.println(Arrays.equals(ar1, ar2));
		
		for(int i=0; i<ar1.length; i++) {
			for(int j=0; j<ar2.length; j++) {
				if(Arrays.equals(ar1, ar2)) {
					System.out.println("ar1�� ar2�� ���� �� = " + ar1[i] + "�� " + ar2[j]);
				}
			}
		}
		
		
		double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		// �迭 ��ü ����
		double[] arr2 = Arrays.copyOf(arr, arr.length);
		
		// �迭 3��° ��� ���� ����
		double[] arr3 = Arrays.copyOf(arr, 3);
		
		/*for(double d : arr2)
			System.out.println(d + "\t");
		
		for(double e : arr3)
			System.out.println(e + "\t");*/
		
		/*double[] arr_arr = new double[3];
		
		System.arraycopy(arr, 1, arr_arr, 0, 3);
		
		for(double d : arr_arr)
			System.out.println(d);*/
		
	}
}
