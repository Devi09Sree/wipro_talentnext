package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array should contain at least 2 elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Smallest 2 numbers: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest 2 numbers: " + arr[n - 2] + ", " + arr[n - 1]);

        sc.close();
	}

}
