package java_fundamentals;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question27 {

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
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int value : arr) {
            uniqueElements.add(value);
        }
        System.out.println("Array after removing duplicates:");
        for (int value : uniqueElements) {
            System.out.print(value + " ");
        }
        sc.close();
	}

}


       