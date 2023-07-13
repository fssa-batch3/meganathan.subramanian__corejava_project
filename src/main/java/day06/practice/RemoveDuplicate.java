package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		// import the HashSet unique city 
		
		HashSet<String> uniquecity = new HashSet<String>(cityList);
		
		// set the all element into the new array list 
		
		cityList.addAll(uniquecity);
		
		System.out.println("After remove the all duplicate " + uniquecity);
	}
}
