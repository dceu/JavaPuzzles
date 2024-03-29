package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		int longest = 0;
		for (int c = 0; c < str.length(); c++) {
			if (c == str.length()-1) break;
			if (str.length() > 0){
				int streak = 1;
			do {
				if (str.charAt(c)==str.charAt(c+1)) streak++;
				if (c+streak > str.length()-1) break;
				if (str.charAt(c+streak) != str.charAt(c)) break;

			}while (str.charAt(c) == str.charAt(c+streak));
			if (streak > longest) longest = streak;
			}
			else if(str.charAt(c) != str.charAt(c+1)) continue;
			
			
		}
		return longest;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

