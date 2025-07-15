package java_fundamentals;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.print("Positive");
		}else if(n<0) {
			System.out.print("Negative");
		}else {
			System.out.print("Zero");
		}
	
	}

}
