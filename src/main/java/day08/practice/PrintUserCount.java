package day08.practice;

import java.util.HashMap;

public class PrintUserCount {

	public static void main(String[] args) {

		// Implement the HashMap object
		HashMap<String, Integer> usercount = new HashMap<>();
		
		// Create the array
		String[] username = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
		
		for(String names : username)
		{
			if(usercount.get(names) == null)
			{
				usercount.put(names, 1);
			}
			else 
			{
				// Get the count of the names
				int count = usercount.get(names);
				count++;
				// Then the set the count to usercount mean change the value 1 - 2 
				usercount.put(names, count);
			}
			
		}
		
		System.out.println(usercount);
		
	}

}
