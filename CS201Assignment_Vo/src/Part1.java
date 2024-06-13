/*
 * Francine Vo
 * CS 201 Study.com Assignment
 * Part 1
 */
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {

		// Create 2D array of all 50 states and their capitals
		String[][] statesAndCapitals = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
				{ "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" }, { "Kansas", "Topeka" },
				{ "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" },
				{ "Maryland", "Annapolis" }, { "Massachusetts", "Boston" }, { "Michigan", "Lansing" },
				{ "Minnesota", "Saint Paul" }, { "Mississippi", "Jackson" }, { "Missouri", "Jefferson City" },
				{ "Montana", "Helena" }, { "Nebraska", "Lincoln" }, { "Nevada", "Carson City" },
				{ "New Hampshire", "Concord" }, { "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" },
				{ "New York", "Albany" }, { "North Carolina", "Raleigh" }, { "North Dakota", "Bismarck" },
				{ "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
				{ "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
				{ "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" }, { "Virginia", "Richmond" },
				{ "Washington", "Olympia" }, { "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
				{ "Wyoming", "Cheyenne" } };

		promptUser(statesAndCapitals);

		System.out.println("\nStates and their capitals before sorting:");
		printData(statesAndCapitals);
		bubbleSortByCapital(statesAndCapitals);

		System.out.println("\nStates and their capitals after sorting by capital:");
		printData(statesAndCapitals);

	}

	// Helper method that prints out the 2D array
	private static void printData(String[][] statesAndCapitals) {
		for (String[] stateCapital : statesAndCapitals) {
			System.out.println(stateCapital[0] + " - " + stateCapital[1]);
		}
	}

	// Method that prompts the user for input and quizzes them
	private static void promptUser(String[][] statesAndCapitals) {
		int correctCount = 0;
		try (Scanner in = new Scanner(System.in)) {
			for (String[] stateCapital : statesAndCapitals) {
				System.out.print("What is the capital of " + stateCapital[0] + "? ");
				String userAnswer = in.nextLine().trim().toLowerCase();
				if (userAnswer.equals(stateCapital[1].toLowerCase())) {
					System.out.println("Correct!");
					correctCount++;
				} else {
					System.out.println("Incorrect. The capital is " + stateCapital[1] + ".");
				}
			}

			System.out.println("\nYou got " + correctCount + " out of 50 correct.\n");
		}
	}

	// Bubble sort method to sort by capital
	private static void bubbleSortByCapital(String[][] statesAndCapitals) {
		int n = statesAndCapitals.length;
		// First loop traverses to the end of the list
		for (int i = 0; i < n - 1; i++) {
			// Next, go to the next-to-last element
			for (int j = 0; j < n - i - 1; j++) {
				// Compare then swap if needed
				if (statesAndCapitals[j][1].compareToIgnoreCase(statesAndCapitals[j + 1][1]) > 0) {
					// Swap statesAndCapitals[j] and statesAndCapitals[j+1]
					String[] temp = statesAndCapitals[j];
					statesAndCapitals[j] = statesAndCapitals[j + 1];
					statesAndCapitals[j + 1] = temp;
				}
			}
		}
	}
}
