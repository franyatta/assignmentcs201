/*
 * Francine Vo
 * CS 201 Study.com Assignment
 * Part 2
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Part2 {

	public static void main(String[] args) {

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

		Map<String, String> stateCapitals = new HashMap<>();

		// Convert 2D array to HashMap
		for (String[] pair : statesAndCapitals) {
			String state = pair[0];
			String capital = pair[1];
			stateCapitals.put(state, capital);
		}

		System.out.println("Unsorted States and Capitals: ");
		printMap(stateCapitals);

		// TreeMap class to sort the map while using a binary search tree for storage
        Map<String, String> sortedStateCapitals = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedStateCapitals.putAll(stateCapitals);
		System.out.println("\nSorted States using TreeMap:");
		printMap(sortedStateCapitals);

		System.out.println();
		promptUser(sortedStateCapitals);

	}

	private static void printMap(Map<String, String> stateCapitals) {
		// Display the contents of the HashMap
		for (Map.Entry<String, String> entry : stateCapitals.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());

		}
	}

	private static void promptUser(Map<String, String> sortedStateCapitals) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter a state: ");
		String userInput = scanner.nextLine();
		String state = userInput.toLowerCase(); // Convert user input to lowercase

        if (sortedStateCapitals.containsKey(state)) {
            System.out.println("The capital of " + userInput + " is " + sortedStateCapitals.get(state));
        } else {
            System.out.println("Invalid state entered.");
        }

		scanner.close();
	}

}
