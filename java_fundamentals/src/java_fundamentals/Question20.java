package java_fundamentals;
import java.util.Scanner;
public class Question20 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				int original=num;
			    int rev=0;
				while(num>0) {
					int rem=num%10;
					rev=(rev*10)+rem;
					num=num/10;
					
				}
				
				if(original == rev) {
					System.out.print("is a Pallindrome");
				}else {
					System.out.print("Not a Pallindrome");
				}

			}

		}

