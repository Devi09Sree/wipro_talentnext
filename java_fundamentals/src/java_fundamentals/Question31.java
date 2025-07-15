package java_fundamentals;
import java.util.Scanner;
public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the size of the array:");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter " + n + " integers:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        boolean result = true;
		        for (int i = 0; i < n; i++) {
		            if (arr[i] != 1 && arr[i] != 4) {
		                result = false;
		                break;
		            }
		        }
		        System.out.println(result);

		        sc.close();
	}

}
