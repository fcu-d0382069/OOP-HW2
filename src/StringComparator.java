import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1;
		String str2 = null;
		boolean bool;
		Scanner StringComparator = new Scanner(System.in);
		for(int i=0;;i++){
			System.out.println("Enter a string1:");
			str1 = StringComparator.nextLine();
			System.out.println("Enter a string2:");
			str2 = StringComparator.nextLine();
			bool=str1.equalsIgnoreCase(str2);
			if(bool==true){
				System.out.println("The two strings are the same.");
				break;
			}
			if(bool==false)
				continue;
			
				
		
		}
		
	}

}
