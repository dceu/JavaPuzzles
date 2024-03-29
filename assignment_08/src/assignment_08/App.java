package assignment_08;

import java.util.Arrays;

import ignore.TestingUtils;

public class App {


	/**

	Given 3 int arguments - a, b, c, return their sum. However, if one of the arguments 
	is the same as any of the other ones, that number should not count towards the sum. 
	So basically you only sum unique numbers, not duplicates
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		sumUnique(1, 2, 3)   <b>---></b> 6 <br>
		sumUnique(3, 2, 3)    <b>---></b> 2 <br>
		sumUnique(3, 3, 3) <b>---></b> 0 <br>
	 */
	
	public static int sumUnique(int a, int b, int c) {
		int[] sumArray = {a,b,c};
		Arrays.sort(sumArray);
		if (sumArray[0] == sumArray[2])
			return 0;
		if (sumArray[0] == sumArray[1])
			return sumArray[2];
		if (sumArray[1] == sumArray[2])
			return sumArray[0];
		else return a + b + c;
		
		
		
		
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
