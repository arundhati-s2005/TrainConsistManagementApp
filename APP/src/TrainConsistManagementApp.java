import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("======================================");

        // Create a Set to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // duplicate
        bogieIds.add("B104");
        bogieIds.add("B102"); // duplicate

        // Display all unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Check if a bogie ID exists
        String checkId = "B103";
        if (bogieIds.contains(checkId)) {
            System.out.println("\nBogie ID " + checkId + " exists in the train.");
        } else {
            System.out.println("\nBogie ID " + checkId + " does NOT exist.");
        }

        // Total unique bogies
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}
