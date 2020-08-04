import java.util.Scanner;
public class StringReversal 
{
	public static void main(String[] args) {
		//driver program
	Scanner obj = new Scanner(system.in);
	
	String inputstring;
	
	String reverse = reverseString(s);
	
	System.out.println("Enter a string: ");
		inputstring.obj.nextLine();
		
	System.out.println("Reversed string is" +reverse);

	}

}
	public static String reverseString(String s) {
		//recursive method
		if (s.isEmpty())
			return s;
		
		//Recursive
		return reverseString(s.substring(1)) + s.charAt(0);
		
}

	
