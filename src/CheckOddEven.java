import java.util.Scanner;
public class CheckOddEven {
public static void main(String[] args) {
// TODO Auto-generated method stub

    int num;
    Scanner CheckOddEven = new Scanner(System.in);
    System.out.print("Enter a integer:");
    num = CheckOddEven.nextInt();
    if(num%2==0)
    	System.out.print("The input integer is Even Number.");
    else
    	System.out.print("The input integer is Odd Number.");

}
}