import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("======================================");

        // Create ArrayList to store passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC");
        passengerBogies.add("General");
        passengerBogies.add("Chair Car");

        System.out.println("\nBogies after adding:");
        System.out.println(passengerBogies);

        // Removing a bogie
        passengerBogies.remove("General");

        System.out.println("\nBogies after removing 'General':");
        System.out.println(passengerBogies);

        // Checking if a bogie exists
        String checkBogie = "AC";
        if (passengerBogies.contains(checkBogie)) {
            System.out.println("\nBogie '" + checkBogie + "' exists in the train.");
        } else {
            System.out.println("\nBogie '" + checkBogie + "' does NOT exist.");
        }

        // Display final consist
        System.out.println("\nFinal Train Consist:");
        for (int i = 0; i < passengerBogies.size(); i++) {
            System.out.println((i + 1) + ". " + passengerBogies.get(i));
        }
    }
}
