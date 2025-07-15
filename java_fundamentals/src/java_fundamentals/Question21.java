package java_fundamentals;
import java .util.Scanner;
public class Question21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
	}

}

