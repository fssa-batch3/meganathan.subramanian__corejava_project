package day09.practice;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numbers: ");

		int[] numbers = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).sorted().toArray();

		System.out.println("Sorted list: " + Arrays.toString(numbers));
		scanner.close();

	}

}
