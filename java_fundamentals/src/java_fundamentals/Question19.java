package java_fundamentals;
import java.util.Scanner;
public class Question19 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				String rev="";
				while(num>0) {
					int rem=num%10;
					rev=rev+rem;
					num=num/10;
				}
				System.out.print(rev);
				

			}

		}
