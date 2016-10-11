import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner PrintNumberInWord = new Scanner(System.in);

	    System.out.print("Enter a integer:");
	    num = PrintNumberInWord.nextInt();
	    if(num==1)
	    	System.out.println("The input integer is ¡§ONE¡¨.");
	    if(num==2)
	    	System.out.println("The input integer is ¡§TWO¡¨.");
	    if(num==3)
	    	System.out.println("The input integer is ¡§THREE¡¨.");
	    if(num==4)
	    	System.out.println("The input integer is ¡§FOUR¡¨.");
	    if(num==5)
	    	System.out.println("The input integer is ¡§FIVE¡¨.");
	    if(num==6)
	    	System.out.println("The input integer is ¡§SIX¡¨.");
	    if(num==7)
	    	System.out.println("The input integer is ¡§SEVEN¡¨.");
	    if(num==8)
	    	System.out.println("The input integer is ¡§EIGHT¡¨.");
	    if(num==9)
	    	System.out.println("The input integer is ¡§NINE¡¨.");
	    if(num>9||num<1)
	    	System.out.println("The input integer is ¡§OTHER¡¨.");

	}

}
