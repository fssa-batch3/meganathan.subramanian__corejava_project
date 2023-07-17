package day08.misc;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// Implement the Hashmap
		HashMap<String, Integer> countmap = new HashMap<>();

		String[] arrnames = { "Aravind", "Meganathan", "Aravind", "Dinesh", "Ravi", "Meganathan" };

		for (String names : arrnames)
		{
			if (countmap.get(names) == null)
			{
				countmap.put(names, 1);

			} 
			else
			{
				int count = countmap.get(names); // Get the key value from the count names
				count++;
				countmap.put(names, count); // And we set the value to the names
			}
		}
		System.out.println(countmap);

	}

}
