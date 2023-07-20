package day09.solved;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingDemo {
	
	public static void main(String[] args) {
		
		// Creating the array list 
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");

		System.out.println("Before Sort:" + cityNames);
		
		// Sort the array list 
		Collections.sort(cityNames);
		System.out.println("After Sort:" + cityNames);
	}
}