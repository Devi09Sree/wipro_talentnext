package java_fundamentals;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			String[] word= str.split(" ");
			if(word.length == 0 ) {
				System.out.println(" No values");
			}
			else {
				for(int i=0;i<word.length;i++) {
					System.out.print(word[i]);
					if( i< word.length-1) {
						System.out.print(",");
					}
				}
			}
			
		}

}
