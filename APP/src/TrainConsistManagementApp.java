import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("======================================");

        // Create a TreeSet (automatically sorted & no duplicates)
        SortedSet<String> bogieIds = new TreeSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("B105");
        bogieIds.add("B101");
        bogieIds.add("B103");
        bogieIds.add("B102");
        bogieIds.add("B104");
        bogieIds.add("B101"); // duplicate (ignored)

        // Display ordered bogie IDs
        System.out.println("\nOrdered Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Remove a bogie ID
        bogieIds.remove("B103");

        System.out.println("\nAfter removing B103:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Display first and last bogie ID
        System.out.println("\nFirst Bogie ID: " + bogieIds.first());
        System.out.println("Last Bogie ID: " + bogieIds.last());

        // Total count
        System.out.println("\nTotal bogies: " + bogieIds.size());
    }
}
