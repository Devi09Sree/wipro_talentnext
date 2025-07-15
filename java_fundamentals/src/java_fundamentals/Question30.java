package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int n = sc.nextInt();
	        int[] input = new int[n];
	        int[] result = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            input[i] = sc.nextInt();
	        }
	        int index = 0;
	        for (int i = 0; i < n; i++) {
	            if (input[i] % 2 == 0) {
	                result[index++] = input[i];
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            if (input[i] % 2 != 0) {
	                result[index++] = input[i];
	            }
	        }
	        System.out.println("Array with evens first and odds next:");
	        System.out.println(Arrays.toString(result));
	}

}
