import java.util.Scanner;
public class StringReversal 
{
	public static void main(String[] args) {
		//driver program
	
	String reverse = "hello world";
	
		
	System.out.println(reverseString (reverse));

	}

}
	public static String reverseString(String s) {
		//recursive method
		if (s.isEmpty())
			return s;
		
		//Recursive
		return reverseString(s.substring(1)) + s.charAt(0);
		
}

	
