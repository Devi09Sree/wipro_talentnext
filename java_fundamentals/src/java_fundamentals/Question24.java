package java_fundamentals;
import java.util.Scanner;
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of ASCII values:");
        int n = sc.nextInt();
        int[] asciiValues = new int[n];
        System.out.println("Enter " + n + " ASCII values:");
        for (int i = 0; i < n; i++) {
            asciiValues[i] = sc.nextInt();
        }
        System.out.print("Characters: ");
        for (int value : asciiValues) {
            System.out.print((char) value);
        }

        sc.close();
	}

}
