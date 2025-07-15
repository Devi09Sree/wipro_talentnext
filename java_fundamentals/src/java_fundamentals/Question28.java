package java_fundamentals;
import java.util.Scanner;
public class Question28 {

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

        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                skip = true; 
            } else if (arr[i] == 7 && skip) {
                skip = false; 
                continue;    
            }

            if (!skip) {
                sum += arr[i];
            }
        }

        System.out.println("Sum (ignoring numbers between 6 and 7): " + sum);

        sc.close();
	}

}
