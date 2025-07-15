package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Question29 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int index = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != 10) {
	                arr[index] = arr[i];
	                index++;
	            }
	        }
	        while (index < n) {
	            arr[index] = 0;
	            index++;
	        }
	        System.out.println("Array after removing 10s:");
	        System.out.println(Arrays.toString(arr));

	        sc.close();
	    }
}
