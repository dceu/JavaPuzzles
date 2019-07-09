package assignment_12;

import java.util.Arrays;
import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its left and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad". <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * starKill("cd*zq") <b>---></b>"cq"<br>
	 * starKill("ab**cd") <b>---></b> "ad" <br>
	 * starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */

	public static String starKill(String str) {
		StringBuilder sb = new StringBuilder(str);
		
			
		try {
			do {
				if (sb.indexOf("*")== -1) break;
				
				int i = sb.indexOf("*");
				int a,b;
			
				a = i;
				b = i;
				if (i!= 0) a = i -1;
				{if (i == sb.length()-1) {sb.delete(a, b+1);
					break;}
				if (i != sb.length()-1)
					b = i+2;
					do{
						int c = i + 1;
						if (sb.charAt(c) != '*') break;
						System.out.println("deleting *");
						sb.deleteCharAt(c);
						
					}while (sb.charAt(i+1)=='*');
				}
				System.out.println("deleting bubble");
				sb.delete(a, b);
			} while (sb.indexOf("*") != -1);
			
		}catch (Exception e) {
			System.out.println(e);
			
		
		}
			
		
		return sb.toString();
	}
		
	
	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
