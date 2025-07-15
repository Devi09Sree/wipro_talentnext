package java_fundamentals;
import java.util.Scanner;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Number found at index: " + index);
        }

        sc.close();
	}

}
