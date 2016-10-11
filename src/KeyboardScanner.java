import java.util.Scanner;
public class KeyboardScanner {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1 ;
			float num2;
			
			String str1;
			Scanner KeyboardScanner = new Scanner(System.in);
			
			System.out.println("Enter a integer:");
			num1 = KeyboardScanner.nextInt();
			System.out.println("Enter a float point number:");
			num2 = KeyboardScanner.nextFloat();
			System.out.println("Enter your name:");
			str1 = KeyboardScanner.next();
			double num3 = num1*num2;
			String A = "Hi %s the multiplication of %d and %f is %.2e";
			System.out.printf(A,str1,num1,num2,num3);
		}

	}